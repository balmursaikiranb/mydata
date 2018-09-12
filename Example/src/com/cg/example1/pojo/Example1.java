/**
 * 
 */
package com.cg.example1.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * @author learning
 *
 */
public class Example1 {
	
	@FindBy(how = How.NAME, name = "username")
	private WebElement name;
	@FindBy(how = How.NAME, name = "designation")
	private List<WebElement> radioButtons;
	@FindBy(how = How.NAME, name = "country")
	private WebElement country;
	@FindBy(how = How.LINK_TEXT, linkText= "Next")
	private WebElement nextLink;
	@FindBy(how = How.NAME, name = "reset")
	private WebElement reset;
	public String getName() {
		return name.getAttribute("value");
	}
	public void setName(String name) {
		this.name.sendKeys(name);;
	}
	public String getDesignation() {
		for (WebElement radio :radioButtons ) {
		
		  if(radio.isSelected()) 
		  { 
			  return radio.getAttribute("value");
		  }
		}
	  return null;
	  }
	

	public void setDesignation(String country){
		  for(WebElement radio : radioButtons){
		    if(radio.getAttribute("value").contains(country))
		        radio.click();
		  }
		}
	public String getCountry() {
		return new Select(this.country).getFirstSelectedOption().getText();
	}
	public void setCountry(String country) {
		new Select(this.country).selectByVisibleText(country);
	}
	public void NextLink() {
		System.out.println("sdsdag");
		 nextLink.click();
	}
	
	public void resetBtn() {
		reset.click();
	}
}
