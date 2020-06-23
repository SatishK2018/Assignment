package com.ibm.assignment.day6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Exercise3 {
	
	WebDriver driver;
	
  @Test
  public void verifyPageTitle() {
	  String expectedTitle = "Demo Web Shop";
	  String actualTitle = driver.getTitle();
	  System.out.println("Expected Title: " + expectedTitle +"\n"+"Actual Title: "+ actualTitle);
	  assertEquals(actualTitle, expectedTitle);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SATISHKALE\\Downloads\\IBM\\Upskill Program - Selenium\\SeleniumSetUpFiles\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
