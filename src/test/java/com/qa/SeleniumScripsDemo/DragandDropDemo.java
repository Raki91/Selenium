package com.qa.SeleniumScripsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo {
	
	 public void DragDropDemo()
	 {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  
	  driver.switchTo().frame(0);
	  
	  WebElement e1= driver.findElement(By.id("draggable"));
	  WebElement e2=driver.findElement(By.id("droppable"));
	  
	  Actions a = new Actions(driver);
	  
	 // a.dragAndDrop(e1, e2).perform();
	  
	  a.clickAndHold(e1).moveToElement(e2).release().perform();
	  
	 }

}
