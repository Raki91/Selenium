package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class FireFoxCheckup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new FirefoxDriver();
	
		
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.wikipedia.org/");
	
	driver.close();

	}

}
