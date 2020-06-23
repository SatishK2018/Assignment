package com.ibm.assignment.day6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Exercise5 {
	
	WebDriver driver;
	
  @Test(priority=2)
  public void Test1_RegisterPage() {
	  System.out.println("Test Case 1");
	  driver.findElement(By.linkText("REGISTER")).click();
	  String expectedResult = "Register: Mercury Tours";
	  String actualResult = driver.getTitle();
	  assertEquals(actualResult, expectedResult);	
	 	
  }
  
  @Test(priority=3)
  public void Test2_SupportPage() {
	  System.out.println("Test Case 2");
	  driver.findElement(By.linkText("SUPPORT")).click();
	  String expectedResult = "Under Construction: Mercury Tours";
	  String actualResult = driver.getTitle();
	  assertEquals(actualResult, expectedResult);	
	 	
  }
  
  @Test(priority=1)
  public void Test3_SignOnPage() {
	  System.out.println("Test Case 3");
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  String expectedResult = "Sign-on: Mercury Tours";
	  String actualResult = driver.getTitle();
	  assertEquals(actualResult, expectedResult);	
	 	
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  String expectedResult = "Welcome: Mercury Tours";
	  String actualResult = driver.getTitle();
	  assertEquals(actualResult, expectedResult);	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("Home")).click();
  }

  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SATISHKALE\\Downloads\\IBM\\Upskill Program - Selenium\\SeleniumSetUpFiles\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	 
  }

}
