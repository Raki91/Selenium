package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IESetupCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new InternetExplorerDriver();
		
		
		
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();

	}

}
