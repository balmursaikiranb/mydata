package com.cg.selinium.Copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	 public static void main(String args[])
	 {
		 System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.get("D:\\Practice\\BDD\\SeliniumBasics\\login.html");
		 
		
		 WebElement element=driver.findElement(By.name("txtOne"));
		 element.sendKeys("saikiran");
		 
		 WebElement element1=driver.findElement(By.name("txtTwo"));
		 
		 element1.sendKeys("password");
		 WebElement element2=driver.findElement(By.name("submit"));
		 element2.click();
		/* element2.submit();*/
		/* System.out.println("Page Title is: "+driver.getTitle());
*/		 
			driver.quit();
	
	 }
}
