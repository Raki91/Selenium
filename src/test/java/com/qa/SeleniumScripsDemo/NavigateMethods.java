package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		openBrowser();
		String url1 = driver.getCurrentUrl();
		
		System.out.println("URL1 is :" +url1);
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().to("https://mail.google.com/");
		
		String url2 = driver.getCurrentUrl();
		System.out.println("URL2 is :" +url2);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().forward();
		
		driver.close();
		
		
	}

}
