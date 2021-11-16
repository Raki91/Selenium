package actionclassDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlesTabDemo {
	
	@Test
	public void HandlesTabDemo() throws AWTException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(3000);
ArrayList<String> tabs = new ArrayList<String>  (driver.getWindowHandles());
		
		System.out.println(tabs);
		
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.switchTo().window(tabs.get(0));
		driver.get("https://www.amazon.com/");
		driver.quit();
		
		
	}

}
