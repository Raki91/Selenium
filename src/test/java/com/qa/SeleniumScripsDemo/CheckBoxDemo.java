package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		//Find Elements method used to get the list
		
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(0).click();
		
		Thread.sleep(2000);
		
		boolean bol1 =driver.findElements(By.xpath("//*[@type='checkbox']")).get(1).isSelected();
		
		System.out.println("checkbox is selected :"+bol1);
		
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(1).click();
		
		Thread.sleep(2000);
		driver.findElements(By.xpath("//*[@type='checkbox']")).get(4).click();
		
		//if the checkbox is selected or not
		
		boolean bol =driver.findElements(By.xpath("//*[@type='checkbox']")).get(4).isSelected();
		
		System.out.println("checkbox is selected :"+bol);
		

	}

}
