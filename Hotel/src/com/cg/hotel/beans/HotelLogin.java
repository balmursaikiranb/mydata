/**
 * 
 */
package com.cg.hotel.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author learning
 *
 */
public class HotelLogin {

	@FindBy(how = How.NAME, name = "userName")
	private WebElement name;
	@FindBy(how = How.NAME, id = "userPwd")
	private WebElement password;
	@FindBy(how = How.ID, id = "login")
	private WebElement button;

	public String getFirstname() {
		return name.getAttribute("value");
	}

	public void setFirstname(String firstname) {
		this.name.sendKeys(firstname);
	}

	public String getLastname() {
		return password.getAttribute("value");
	}

	public void setLastname(String lastname) {
		this.password.sendKeys(lastname);
	}

	public void clickme() {
		button.submit();
	}
}
