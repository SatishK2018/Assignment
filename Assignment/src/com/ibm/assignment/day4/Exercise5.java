package com.ibm.assignment.day4;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Properties prop = new Properties();
		FileInputStream objProp = new FileInputStream(System.getProperty("user.dir")+"\\src\\objectRepository.properties");
		
		prop.load(objProp);
		driver.findElement(By.className(prop.getProperty("loginLink"))).click();;
		driver.findElement(By.id(prop.getProperty("usernameInput"))).sendKeys("Tarun.Kumar1@mail.com");
		driver.findElement(By.id(prop.getProperty("passwordInput"))).sendKeys("pass123$");
		driver.findElement(By.xpath(prop.getProperty("loginBtn"))).click();
		driver.findElement(By.xpath(prop.getProperty("logoutLink"))).click();
		driver.close();
	}

}


