package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1635347027&rver=7.0.6738.0&wp=MBI_SSL&wreply=https:%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin%3Fru%3Dhttps%253A%252F%252Faccount.microsoft.com%252F%253Frefp%253Dsignedout-index%2526refd%253Dwww.google.com&lc=1033&id=292666&lw=1&fl=easi2");

		//Inspect the button using xpath locator
		//xpath : //tagname[@attribute='value']
		
		//check email is displayed or nor
		
		boolean display = driver.findElement(By.xpath("//input[@type='email']")).isDisplayed();
		
		System.out.println("the elements is displayed :" + display);
		
		boolean enable1=driver.findElement(By.xpath("//input[@type='email']")).isEnabled();
		Thread.sleep(2000);
		System.out.println("the elements is Enabled :" + enable1);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Rakesh12345678");
		 Thread.sleep(2000);
		
		 boolean display2  =driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		
		System.out.println("the element is dipslayed : " + display2);
		
		boolean enable = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		
		if(enable==true)
		{
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		
	}

}
