package com.ibm.assignment.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exercise3_ParallelTestRun_Chrome {
	
	WebDriver driver;
	String email, password;
	WebElement computersLink, shoppingCart;
			
   	  @Test (dependsOnMethods = "loginToApp")
	  public void createOrder() {
   		  	Actions action = new Actions(driver);
		   	computersLink = driver.findElement(By.xpath("//A[@href='/computers']"));
			action.moveToElement(computersLink).build().perform();
			driver.findElement(By.linkText("Desktops")).click();
			driver.findElement(By.xpath("//A[@href='/simple-computer'][text()='Simple Computer']")).click();
			driver.findElement(By.name("product_attribute_75_5_31")).click();
			driver.findElement(By.id("add-to-cart-button-75")).click();
			driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
   			/*action.moveToElement(shoppingCart).build().perform();
   			driver.findElement(By.xpath("//INPUT[@type='button']")).click();*/
   			driver.findElement(By.name("termsofservice")).click();
			
	  }
   	  
   	@Test (dependsOnMethods = "createOrder")
 	  public void checkOut() throws InterruptedException {
   			    
   			driver.findElement(By.id("checkout")).click();
   			driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
   			driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
   			driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
   			driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
   			driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
   			driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();   	
   			
 	  }
	  
	  @Test(dataProvider = "RegisteredUser")
	  public void loginToApp(String email, String password) {
		  	driver.findElement(By.linkText("Log in")).click();
		  	driver.findElement(By.id("Email")).sendKeys(email);
		  	driver.findElement(By.id("Password")).sendKeys(password);
		  	driver.findElement(By.xpath("//INPUT[@class='button-1 login-button']")).click();
		  	
	  }

	  @Test (dependsOnMethods = "checkOut")
	  public void logoutFromApp() {
		  driver.findElement(By.xpath("//A[@href='/logout'][text()='Log out']")).click();
	  }

	  @BeforeTest
	  public void openBrowser() {
		  	driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void closeBrowser() {
		 // driver.close();
	  }
	  
	  @DataProvider (name="RegisteredUser")
	  public Object[][] userData(){
		  return new Object[][] { {"Rajesh.Kumar@mail.com" , "pass123$"}};
	  }
  }


