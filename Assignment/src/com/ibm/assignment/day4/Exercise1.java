package com.ibm.assignment.day4;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Exercise1 {

	public static File scrFile;
	public static int count = 1;
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ico-login")).click();
		getScreenshot();
		driver.findElement(By.id("Email")).sendKeys("Tarun.Kumar1@mail.com");
		getScreenshot();
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		getScreenshot();
		driver.findElement(By.xpath("//INPUT[@class='button-1 login-button']")).click();
		getScreenshot();
		driver.findElement(By.xpath("//A[@href='/logout'][text()='Log out']")).click();
		getScreenshot();
		
		driver.close();
	}
	
	public static void getScreenshot( ) throws IOException {

		scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile,new File("./screenshots/step_"
						+ count + ".jpeg"));
		count++;
	}

}
