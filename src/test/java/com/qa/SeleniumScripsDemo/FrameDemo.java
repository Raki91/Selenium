package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.findElement(By.linkText("org.openqa.selenium.chrome"));
		driver.findElement(By.linkText("org.openqa.selenium.chromium"));
		
		

	}

}
