package com.qa.TestNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DescriptioDemo {
	
	@Test(description="Testing Wiki page")
	public void HomePageTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("selenium testing");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
			

}
