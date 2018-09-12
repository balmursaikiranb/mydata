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
public class HotelBooking {

	@FindBy(how = How.ID, id = "txtFirstName")
	private WebElement firstname;
	
	@FindBy(how = How.ID, id = "txtLastName")
	private WebElement lastname;
	
	@FindBy(how = How.ID, id = "txtEmail")
	private WebElement email;
	
	@FindBy(how = How.ID, id = "txtPhone")
	private WebElement phone;
	
	@FindBy(how = How.ID, id = "txtAddress")
	private WebElement address;

	@FindBy(how = How.NAME, name = "city")
	private WebElement city;
	 
	@FindBy(how = How.NAME, name = "state")
	private WebElement state;
	
	@FindBy(how = How.ID, id = "persons")
	private WebElement persons;
	
	@FindBy(how = How.ID, id = "txtCardholderName")
	private WebElement cardholder;
	
	@FindBy(how = How.ID, id = "txtDebit")
	private WebElement debit;
	
	@FindBy(how = How.ID, id = "txtCvv")
	private WebElement cvv;
	
	@FindBy(how = How.ID, id = "txtMonth")
	private WebElement month;
	
	@FindBy(how = How.ID, id = "txtYear")
	private WebElement year;
	
	@FindBy(how = How.ID, id = "btnPayment")
	private WebElement paymentbtn;
}
