package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Delete all the cookies from the currect domain
		
		driver.manage().deleteAllCookies();
		
		// Want to open URL of webpage to be opened on the window
		
		//Load the browser in the current browsermethod
		
		
		driver.get("https://www.wikipedia.org/");
		
		// fetch the title of the page
		String actaultitel=driver.getTitle();
		System.out.println("The actual titel :" +actaultitel);
		
		//compare the actual titel with excepted titel
			
			String expectedvalue = "WIKIPEDIA";
			
			if (actaultitel.equals(expectedvalue))
				
			{
				System.out.println("The titel is correct");
				
			}
			else
			{
				System.out.println("The titel is not  correct");
			}
		
	}

}
