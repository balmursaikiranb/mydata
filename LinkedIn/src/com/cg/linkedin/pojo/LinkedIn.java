/**
 * 
 */
package com.cg.linkedin.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author learning
 *
 */
public class LinkedIn {

	@FindBy(how = How.NAME, name = "firstName")
	private WebElement firstname;
	@FindBy(how = How.NAME, name = "lastName")
	private WebElement lastname;
	@FindBy(how = How.ID, id = "reg-email")
	private WebElement emailid;
	@FindBy(how = How.ID, id = "reg-password")
	private WebElement password;
	@FindBy(how = How.ID, id = "registration-submit")
	private WebElement button;
	
	public String getFirstname() {
		return firstname.getAttribute("value");
	}
	public void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}
	public String getLastname() {
		return lastname.getAttribute("value");
	}
	public void setLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	public String getEmailid() {
		return emailid.getAttribute("value");
	}
	public void setEmailid(String emailid) {
		this.emailid.sendKeys(emailid);
	}
	public String getPassword() {
		return password.getAttribute("value");
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public void clickme()
	{
		button.submit();
	}
	
}
