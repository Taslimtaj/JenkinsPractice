package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest 
{
	
	@Test
	public void Launch()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions cp=new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(cp);
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
	}

}
