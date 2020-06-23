package com.ibm.assignment.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		HomePage home = new HomePage(driver);
		RegistrationPage register = new RegistrationPage(driver);
		LoginPage login = new LoginPage(driver);
		
		home.clickRegisterLink();
		register.fillRegisterForm();
		login.logout();
		//login.login();
					
		//driver.close();

	}

}
