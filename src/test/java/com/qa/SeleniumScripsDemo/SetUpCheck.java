package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//webdriver is an interface
		//driver is an object
		//Chrome Driver is a class
		
		System.setProperty("webdriver.chrome.drive","C:\\Users\\Dell\\Downloads\\chromedriver_win32");
		WebDriver driver =  new ChromeDriver();
		
		
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//Static wait :  add wait time your scripts
				Thread.sleep(10000);
		
		//close the window browser
		
		driver.close();

	}

}
