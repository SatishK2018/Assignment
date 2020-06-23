package com.ibm.assignment.day2;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();

		int num = rand.nextInt(100);
		driver.findElement(By.linkText("Register")).click();
				
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Tarun"+num);
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("Tarun"+num+".Kumar1@mail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.close();
	
	}
	

}
