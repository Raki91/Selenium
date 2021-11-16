package com.qa.SeleniumScripsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahoosearchpageDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//using  axes path we have to search 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		//xpath using descendant axes
		
		driver.findElement(By.xpath("//*[@id='sbq-wrap']/child::input[1]")).sendKeys("Appium");
			
		Thread.sleep(5000);
		
		//capture entier list form the list box
		
		//store it in a list webElement
		
		List<WebElement>list1 = driver.findElements(By.xpath("//*[@role='listbox']/child::li"));
		
		System.out.println("The Number od items in the list"  + list1.size());
		
		//start a loop
		
		for(int i=0 ; i<list1.size();i++)
		{
			String text = list1.get(i).getText();
			System.out.println(text);
			
			if(text.contains("download"))
			{
				list1.get(i).click();
				break;
			}
		}
		
		
				
				

	}

}