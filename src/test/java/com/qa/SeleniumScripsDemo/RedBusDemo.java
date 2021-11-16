package com.qa.SeleniumScripsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
			//using  axes path we have to search 
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/bus-tickets/");
			
		driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[1]")).sendKeys("Mumbai");
		
	Thread.sleep(5000);
	
	List<WebElement> from=driver.findElements(By.xpath("//*[@id='C120_suggestion-wrap']/descendant::*"));
	
	System.out.println("The size of the list  " + from.size());
			
	for (int i=0; i<from.size();i++)
	{
			String text = from.get(i).getText();
			System.out.println(text);
			if(text.contains("Vashi"))
			{
				from.get(i).click();
				break;
			}
	}
	

	driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[3]")).sendKeys("Pune");
	
	Thread.sleep(5000);
	
List<WebElement> to=driver.findElements(By.xpath("//*[@id='C120_suggestion-wrap']/child::*"));
	
	System.out.println("The size of the list  " + to.size());
			
	for (int i=0; i<to.size();i++)
	{
			String totext = to.get(i).getText();
			System.out.println(totext);
			if(totext.contains("Wakad"))
			{
				to.get(i).click();
				break;
			}
	}
	
	
	// select the date in the calander		
	
	driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[5]")).click();
	
	Thread.sleep(5000);
	
List<WebElement> cal=driver.findElements(By.xpath("(//*[@class='rb-calendar-days'])[2]/descendant::*"));
	
	System.out.println("The size of the list  " + cal.size());
			
	for (int i=0; i<cal.size();i++)
	{
			String caltext = cal.get(i).getText();
			System.out.println(caltext);
			if(caltext.contains("5"))
			{
				cal.get(i).click();
				break;
			}
	}
	
	driver.findElement(By.xpath("//*[@class='D120_search_btn searchBuses']")).click();
	}

}
