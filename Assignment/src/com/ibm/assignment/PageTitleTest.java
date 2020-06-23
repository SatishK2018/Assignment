//Write Selenium script to confirm whether the application displays manzoormehadi26@gmail.com upon succesful login

package com.ibm.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //Implicit wait
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("Rajesh.Kumar@mail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String expected = "Rajesh.Kumar@mail.com";
		String actual = driver.findElement(By.xpath("//A[@class='account']")).getText();
		
		if(expected.equals(actual))
			System.out.println("Expected");
		else
			System.out.println("Not Expected");
		
		driver.quit();
		
	}

}

/*//Declare all packages 
import java.util.List;
import junit.framework.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Page_Title_TestTest extends TestCase {
  
 protected PhantomJSDriver driver;
  
  @Before
   protected void setUp(){
      DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
      driver = new PhantomJSDriver(capabilities);
      driver.get("http://demowebshop.tricentis.com/");
      driver.manage().window().setSize( new Dimension( 1124, 850 ) );
      driver.findElement(By.linkText("Log in")).click();
   }
   @After 
   protected void tearDown(){
      driver.quit();
   }
  
  @Test
  public void testTitle() {
      // write your code to login
      driver.findElement(By.id("Email")).sendKeys("Rajesh.Kumar@mail.com");
	  driver.findElement(By.id("Password")).sendKeys("pass123$");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
      
	  String Expected ="Rajesh.Kumar@mail.com";
	  String Actual = driver.findElement(By.xpath("//A[@class='account']")).getText();
	  assertEquals(Actual, Expected);
  }
}

 */
