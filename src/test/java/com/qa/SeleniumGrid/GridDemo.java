package com.qa.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		
		ChromeOptions options = new ChromeOptions();
		
		options.merge(cap);
		
		String url = "http://192.168.142.187:4545/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(url),options);
		
		driver.get("https://www.wikipedia.org/");
		
		String title =driver.getTitle();
		System.out.println(" the title of the page is :" + title);

	}

}
