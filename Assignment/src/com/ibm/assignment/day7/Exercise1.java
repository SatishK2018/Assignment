package com.ibm.assignment.day7;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
	
	WebDriver driver; 
	
  @Test (dependsOnMethods = {"openBrowser"})
  public void logIn() {
	  
	  driver.get("http://demowebshop.tricentis.com");
	  driver.manage().window().maximize();
	  System.out.println("Login to the application");
	  driver.findElement(By.className("ico-login")).click();
	  driver.findElement(By.id("Email")).sendKeys("Tarun.Kumar1@mail.com");
	  driver.findElement(By.id("Password")).sendKeys("pass123$");
	  driver.findElement(By.xpath("//INPUT[@class='button-1 login-button']")).click();
	  
  }
  
  @Test 
  public void openBrowser() {
	  System.out.println("Open the browser");
	  driver = new ChromeDriver();
  }

  @Test (dependsOnMethods = {"logIn"})
  public void logOut() {
	  System.out.println("Logout from the application");
	  driver.findElement(By.xpath("//A[@href='/logout'][text()='Log out']")).click();
	  driver.close();
	  System.out.println("Chrome Browser test is completed");
	  
  }

}
