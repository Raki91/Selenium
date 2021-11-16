package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page");
		
		// Find element and enter username and data
		
		driver.findElement(By.id("wpName2")).clear();
		driver.findElement(By.id("wpName2")).sendKeys("admin");
		
		driver.findElement(By.name("wpName")).clear();
		  
		  driver.findElement(By.name("wpName")).sendKeys("admin");
		  
		  driver.findElement(By.xpath("//*[@id=\"wpName2\"]")).clear();
		  driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");
		  
		  

	}

}
