package com.cg.selinium.Copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {
	 public static void main(String args[])
	 {
		 System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
		 driver.get("https://www.amazon.in");
		 
		 WebElement element=driver.findElement(By.name("field-keywords"));
		 element.sendKeys("backpacks");
		 element.submit();
		 System.out.println("Page Title is: "+driver.getTitle());
		 			driver.quit();
		
		 
	 }

}
