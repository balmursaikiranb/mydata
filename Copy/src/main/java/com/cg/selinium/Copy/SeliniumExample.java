package com.cg.selinium.Copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumExample {
 public static void main(String args[])
 {
	 System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	
	 driver.get("http://www.google.com");
	 WebElement element=driver.findElement(By.name("q"));
	 element.sendKeys("Balmur Saikiran images");
	 element.submit();
	 System.out.println("Page Title is: "+driver.getTitle());
	 driver.quit();
 }
}
