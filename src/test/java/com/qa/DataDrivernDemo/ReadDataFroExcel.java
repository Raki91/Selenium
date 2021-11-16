package com.qa.DataDrivernDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadDataFroExcel {
	
WebDriver driver;
	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\Dell\\Desktop\\excel\\ReadData.xlsx");
	
	@BeforeClass
	public void setup()
	{
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	
	@Test
	public void createAcount() throws InterruptedException
	{
		
		reader.addColumn("Sheet2", "Status");
		
		
	int rowcount= reader.getRowCount("Sheet2"); // 20
		
	
		
		// go to every row , every column in the sheet and fetch the cell data of the excel
		
		for (int i=2;i<=rowcount;i++)
		{
		String fullname= reader.getCellData("Sheet2", "fullname", i);
		String rediffid = reader.getCellData("Sheet2", "rediffid", i);
		String password = reader.getCellData("Sheet2", "password", i);
		String retype = reader.getCellData("Sheet2", "retype", i);
		
	
	
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).sendKeys(fullname);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys(rediffid);
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys(retype);
	
		
		reader.setCellData("Sheet2", "Status", i, "executed");
		}
	}
	

}
