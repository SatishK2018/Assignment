package com.ibm.assignment.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	WebDriver driver;
	public static String username;
	public static String password;
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fillRegisterForm() {
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Tarun");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("Tarun.Kumar799@mail.com");
		username = driver.findElement(By.id("Email")).getText();
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		password = driver.findElement(By.id("Password")).getText();
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
	}


}
