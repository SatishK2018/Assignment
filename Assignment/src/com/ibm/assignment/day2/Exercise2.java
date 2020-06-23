package com.ibm.assignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://examples.codecharge.com/Store/Default.php");
	System.out.println(driver.getTitle());
	
	Select product = new Select(driver.findElement(By.name("category_id")));
		
	product.selectByVisibleText("Databases");
	driver.findElement(By.name("DoSearch")).click();
	
	}

}
