package com.ibm.assignment.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login() {
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys(RegistrationPage.username);
	driver.findElement(By.id("Password")).sendKeys(RegistrationPage.password);
	}
	
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
	}
}