package com.qa.TestNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority='2')
	public void RadioButtonTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[3]"));
		e1.click();
		Thread.sleep(2000);
		
		driver.close();
	}
	
	@Test(priority='1')
	public void checkboxTest() throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
		WebElement e2 =driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[3]"));
		e1.click();
		e2.click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
	

}
