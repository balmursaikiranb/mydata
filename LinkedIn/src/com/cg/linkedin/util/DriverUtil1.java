package com.cg.linkedin.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverUtil1 {
	// This method is used to initialize the driver connection and returns driver
	static	WebDriver driver;

	public  WebDriver initializeDriver(String name) {
		if ("chrome".equalsIgnoreCase(name)) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if ("firefox".equalsIgnoreCase(name)) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} else if ("ie".equalsIgnoreCase(name)) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}

	// this method helps to close the driver connection
	public static void closeDriver() {
		driver.quit();
	}
	
	
	/*public static void main(String...a)
	{
		initializeDriver("chrome");
		
	}*/
}
