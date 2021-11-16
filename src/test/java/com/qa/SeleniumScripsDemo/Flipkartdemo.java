package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
public class Flipkartdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='col-12-12 _2oO9oE']/child::button[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//form[@class='_2M8cLY header-form-search']/descendant::input[1]")).sendKeys("Books");
		
		Thread.sleep(2000);
		
		List<WebElement> book = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/child::*"));
		
		System.out.println("the list of books :" + book.size());
		
		for(int i=0; i<book.size();i++)
		{
		String	text = book.get(i).getText();
	       if(text.contains("books for children"))
	       {
	    	   book.get(i).click();
	    	   break;
	       }
	
			
		}
		

	}

}
