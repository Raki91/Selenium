package com.qa.DataDrivernDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReaddataTestNG {WebDriver driver;


@BeforeMethod
public void setup()
{
driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}


@Test(dataProvider="testdata")
// script and use Dataprovider anotation to inject data into your test method
public void createaccount(String fullname, String rediffid, String password, String retype ) throws InterruptedException
{
	driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).clear();
	driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).sendKeys(fullname);
	Thread.sleep(20000);
	
	driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).clear();
	driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys(rediffid);
	driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).clear();
	driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys(password);
	driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).clear();
	driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys(retype);

	driver.close();
	
}

//fetch data form excel with help of apache poi
@DataProvider(name="testdata")
public Object[][] readdata()
{
	
	Object input[][]=	Xls_dataProvider.getTestData("Sheet1");
	
	return input;
	
	
	
	
	
	
	
	
	
	
	
	
}

}