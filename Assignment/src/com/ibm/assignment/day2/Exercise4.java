package com.ibm.assignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise4 {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://examples.codecharge.com/Store/Default.php");
	
	Select product = new Select(driver.findElement(By.name("category_id")));
	
	product.selectByVisibleText("Databases");
	driver.findElement(By.name("DoSearch")).click();
	
	driver.findElement(By.linkText("Web Database Development")).click();
	
	System.out.println("Value :" + driver.findElement(By.name("quantity")).getAttribute("value"));
	driver.findElement(By.name("Insert1")).click();
	
	boolean check = driver.findElement(By.name("Delete1_1")).isSelected();
	System.out.println("Delete button is selected: "+ check);
		
	driver.close();
	
	}

}
