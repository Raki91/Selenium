package com.qa.SeleniumScripsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		
		WebElement dd = driver.findElement(By.xpath("//select[@name='coffee']"));
		
		//select is a class
		
		Select e = new Select(dd);
		
		e.selectByValue("black");
		Thread.sleep(2000);
		e.selectByValue("regular");
		Thread.sleep(2000);
		
		e.selectByIndex(1);
		e.selectByVisibleText("With sugar");
		
		
		List<WebElement> li = e.getOptions();
		
		li.size();
		
		for(WebElement v : li)
		{
			System.out.println(v.getText());
		}
			
				
		
		 
		
		
		
		
		

	}

}
