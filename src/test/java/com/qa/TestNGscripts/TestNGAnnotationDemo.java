package com.qa.TestNGscripts;

import org.testng.annotations.Test;

public class TestNGAnnotationDemo {
	
	@Test(priority='1')
	public void loginPageTest()
	{
		System.out.println("login page");
	}
	
	@Test(priority='2')
	public void createmailTest()
	{
		System.out.println("create email");
	}
	
	@Test(priority='3')
	public void ModifymailTest()
	{
		System.out.println("Modify email");
	}
	
	@Test(priority='4')
	public void DeleteemailTest()
	{
		System.out.println("Delete email");
	}
	
}
