package com.ibm.assignment.day4;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy");
		String expected = dateFormat.format(date);
				
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
				
		String actual = driver.findElement(By.xpath("//form/table/tbody/tr[1]/td/font/b")).getText().trim();
		
		System.out.println("Expected Date :" + expected);
		System.out.println("Actual Date :" + actual);
		
		if(expected.equals(actual))
			System.out.println("Date Matched");
		else
			System.out.println("Date Not Matched");
	}

}


