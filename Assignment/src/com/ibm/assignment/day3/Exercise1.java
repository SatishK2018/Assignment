package com.ibm.assignment.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[3]/table/tbody/tr[2]"));
		List<WebElement> columns = table.findElements(By.tagName("td"));
		
		System.out.println("Total Number of columns:"+ columns.size());
		
		driver.close();
	}

}
