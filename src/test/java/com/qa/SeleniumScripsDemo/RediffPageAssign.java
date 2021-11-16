package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffPageAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignement to test Rediff Page 
		
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Delete all the cookies 
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//Fetch the title of the page
		
		String actualtitle = driver.getTitle();
		
		System.out.println("actual title is :" +actualtitle);
		
		//Compare the title
		
		String expectedtitle = "Rediffmail Free Unlimited Storage";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Title is correct" );
		}
		else
		{
			System.out.println("Title is not correct" );
		}
		
		
		
		
	}

}
