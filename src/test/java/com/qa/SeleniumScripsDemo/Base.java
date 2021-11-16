package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver ;
	
	public static void openBrowser() 
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
