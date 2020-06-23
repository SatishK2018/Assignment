package com.ibm.assignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise5 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
	
	driver.findElement(By.name("user_login")).sendKeys("Rakesh");
	driver.findElement(By.name("user_password")).sendKeys("pass123$");
	driver.findElement(By.name("first_name")).sendKeys("Rakesh");
	driver.findElement(By.name("last_name")).sendKeys("Kumar");
	driver.findElement(By.name("email")).sendKeys("Rakesh.Kumar@mail.com");
	driver.findElement(By.name("address1")).sendKeys("234, Park Avenue");
	driver.findElement(By.name("address2")).sendKeys("Lt. Bernard Streete");
	driver.findElement(By.name("address3")).sendKeys("New York");
	driver.findElement(By.name("city")).sendKeys("New York");
	new Select(driver.findElement(By.name("state_id")));
	driver.findElement(By.name("zip")).sendKeys("12345");
	new Select(driver.findElement(By.name("country_id"))).selectByVisibleText("United States");
	driver.findElement(By.name("phone_home")).sendKeys("1-239-39290");
	driver.findElement(By.name("phone_work")).sendKeys("1-897-92832");
	new Select(driver.findElement(By.name("language_id"))).selectByVisibleText("English");
	new Select(driver.findElement(By.name("age_id"))).selectByVisibleText("25-34");
	new Select(driver.findElement(By.name("gender_id"))).selectByVisibleText("Male");
	new Select(driver.findElement(By.name("education_id"))).selectByVisibleText("Graduate School");
	new Select(driver.findElement(By.name("income_id"))).selectByVisibleText("$25,000 - $34,000");
	driver.findElement(By.name("note")).sendKeys("Test");
	Thread.sleep(5000);
	driver.findElement(By.name("Insert")).click();
	
	driver.close();
	
	}

}
