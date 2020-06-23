package com.ibm.assignment.day7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Exercise2_ParallelTestRun1 {
	
	WebDriver driver; 
	
  @Test
  public void openChromeBrowser() {
	  
	  driver.get("http://demowebshop.tricentis.com");
	  System.out.println("Chrome Browser: "+ driver.getTitle());
	  driver.findElement(By.className("ico-login")).click();
	  driver.findElement(By.id("Email")).sendKeys("Tarun.Kumar1@mail.com");
	  driver.findElement(By.id("Password")).sendKeys("pass123$");
	  driver.findElement(By.xpath("//INPUT[@class='button-1 login-button']")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.xpath("//A[@href='/logout'][text()='Log out']")).click();
	  System.out.println("Chrome Browser test is completed");
	  driver.close();
  }

}
