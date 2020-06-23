package com.ibm.assignment.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		WebElement computersLink = driver.findElement(By.xpath("//A[@href='/computers']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(computersLink).build().perform();
		driver.findElement(By.linkText("Accessories")).click();
		
		driver.close();
	
	}

}

