package com.ibm.assignment.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise2_ParallelTestRun2 {
	WebDriver driver; 
	
	  @Test
	  public void openFirefoxBrowser() {
		  
		  driver.get("http://demowebshop.tricentis.com");
		  System.out.println("Firefox Browser: "+ driver.getTitle());
		  driver.findElement(By.className("ico-login")).click();
		  driver.findElement(By.id("Email")).sendKeys("Tarun.Kumar1@mail.com");
		  driver.findElement(By.id("Password")).sendKeys("pass123$");
		  driver.findElement(By.xpath("//INPUT[@class='button-1 login-button']")).click();
	  }
	
	  @BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest(){
		  driver.findElement(By.xpath("//A[@href='/logout'][text()='Log out']")).click();
		  System.out.println("Firefox Browser test is completed");
		  driver.close();
	  }
}
