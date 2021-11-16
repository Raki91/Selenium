package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		 * 
		 * JavascriptExecutor js = ((JavascriptExecutor)driver);
		 * js.executeScript("scroll(0,+1200)");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * js.executeScript("scroll(0,-1200)");
		 */

		// TODO Auto-generated method stub
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.ironspider.ca/forms/checkradio.htm");
				
				// find the radio button on the page
				
			WebElement e1 =	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
			WebElement e2 =	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[3]"));
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			
			// scroll & scrollIntoView
			
			js.executeScript("arguments[1].scrollIntoView(true)", e1,e2);
			
			Thread.sleep(2000);
			
		   e2.click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			 * int a=10; int b=20; int c=30; int d=40;
			 * 
			 * js.executeScript("arguments[0].add();", a,b,c,d);
			 * js.executeScript("arguments[1].add();", a,b,c,d);
			 * js.executeScript("arguments[2].add();", a,b,c,d);
			 */	

	}

}
