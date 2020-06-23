package com.ibm.assignment.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

		WebDriver driver;
		
		public HomePage(WebDriver driver) {
			this.driver = driver;				
		}
		
		public void clickRegisterLink() {
			driver.findElement(By.linkText("Register")).click();
		}
 }


