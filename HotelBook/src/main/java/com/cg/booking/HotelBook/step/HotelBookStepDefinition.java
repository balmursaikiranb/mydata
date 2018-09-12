/**
 * 
 */
package com.cg.booking.HotelBook.step;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.booking.HotelBook.pojo.ConfernaceRoomBookingPageBean;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


/**
 * @author learning
 *
 */
public class HotelBookStepDefinition {

	//Logger log=Logger.getLogger(HotelBookStepDefinition.class);
	Logger log=Logger.getRootLogger();
	
	private WebDriver driver;
	private ConfernaceRoomBookingPageBean pageBean;
	private com.cg.booking.HotelBook.util.DriverUtil1 util=new com.cg.booking.HotelBook.util.DriverUtil1();
	@Before
	public void initialization() throws FileNotFoundException, IOException {
		driver = util.initializeDriver("chrome");
		pageBean = new ConfernaceRoomBookingPageBean();
		PageFactory.initElements(driver, pageBean);
		/*String log4JPropertiesFile="logger.properties";
		Properties p=new Properties();
		p.load(new FileInputStream(log4JPropertiesFile));
		PropertyConfigurator.configure(p);
		log.info("iam configured");*/
		
	}
	@After
	public void closeUp() {

		util.closeDriver();
	}
	
	@Given("^User Conference room booking page to book the room$")
	public void user_Conference_room_booking_page_to_book_the_room()  {
		driver.get("D:\\Practice\\BDD\\HotelBook\\Web\\Q.html");
	  log.info("in booking page");
	}

	@When("^User click on 'Next' link without entering 'FirstName'$")
	public void user_click_on_Next_link_without_entering_FirstName()  {
		pageBean.clickNextPageLink();
	
	}

	@Then("^Display the message 'Please fill the First Name'$")
	public void display_the_message_Please_fill_the_First_Name()  {
	   String message=driver.switchTo().alert().getText();
	  log.info("enter the first name");
	   assertEquals("Please fill the First Name", message);
	   
	}

	@When("^User click on 'Next' link without entering 'LastName'$")
	public void user_click_on_Next_link_without_entering_LastName()  {
		driver.switchTo().alert().dismiss();
		pageBean.setFirstName("saikiran");
		pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please fill the Last Name'$")
	public void display_the_message_Please_fill_the_Last_Name()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill the Last Name", message);
		  log.info("enter the lastname");
	}

	@When("^User click on 'Next' link without entering 'Email'$")
	public void user_click_on_Next_link_without_entering_Email()  {
		driver.switchTo().alert().dismiss();
		pageBean.setLastName("balmur");
		pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please fill the Email'$")
	public void display_the_message_Please_fill_the_Email()  {
		 
			String message=driver.switchTo().alert().getText();
			   assertEquals("Please fill the Email", message);
			  log.info("enter the email");
	   
	}

	@When("^User click on 'Next' link after entering invalid 'Email' address$")
	public void user_click_on_Next_link_after_entering_invalid_Email_address()  {
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("balmursaikiran");
		pageBean.clickNextPageLink();
	  
	}

	@Then("^Display the message 'Please enter valid Email Id\\.'$")
	public void display_the_message_Please_enter_valid_Email_Id()  {
		
			String message=driver.switchTo().alert().getText();
			   assertEquals("Please enter valid Email Id.", message);
			   log.info("enter the valid email");
	}

	@When("^User click on 'Next' link without entering 'Contact No'$")
	public void user_click_on_Next_link_without_entering_Contact_No()  {
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("balmursaikiran@gmail.com");
		pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please fill the Contact No\\.'$")
	public void display_the_message_Please_fill_the_Contact_No()  {
		
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill the Contact No.", message);
		   log.info("enter the contact number");
	}

	@When("^User click on 'Next' link after entering invalid 'Contact No'$")
	public void user_click_on_Next_link_after_entering_invalid_Contact_No()  {
		driver.switchTo().alert().dismiss();
	   pageBean.setContactNo("0123456789");
	   pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please enter valid Contact no\\.'$")
	public void display_the_message_Please_enter_valid_Contact_no()  {
		
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please enter valid Contact no.", message);
		   log.info("enter the valid contact number");
	}

	@When("^User click on 'Next' link without selecting  'Number of people attending'$")
	public void user_click_on_Next_link_without_selecting_Number_of_people_attending()  {
		driver.switchTo().alert().dismiss();
		 pageBean.setContactNo("9703806992");
		   pageBean.clickNextPageLink();
	  
	}

	@Then("^Display the message 'Please fill the Number of people attending'$")
	public void display_the_message_Please_fill_the_Number_of_people_attending()  {
		
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill the Number of people attending", message);
		  log.info("enter the number of people attending");
	}

	@When("^User click on 'Next' link without entereing  'Building Name & Room No'$")
	public void user_click_on_Next_link_without_entereing_Building_Name_Room_No()  {
		driver.switchTo().alert().dismiss();
		 pageBean.setNoOfPerson("4");
		   pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please fill the Building & Room No'$")
	public void display_the_message_Please_fill_the_Building_Room_No()  {
		
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill the Building & Room No", message);
		   log.info("enter the building and room number");
	}

	@When("^User click on 'Next' link without entereing  'Area Name'$")
	public void user_click_on_Next_link_without_entereing_Area_Name()  {
		driver.switchTo().alert().dismiss();
		 pageBean.setBuildingAndRoomNo("sai4");
		   pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please fill the Area name'$")
	public void display_the_message_Please_fill_the_Area_name()  {
		
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill the Area name", message);
		   log.info("enter the area name");
	}

	@When("^User click on 'Next' link without selecting  'City'$")
	public void user_click_on_Next_link_without_selecting_City()  {
		driver.switchTo().alert().dismiss();
		 pageBean.setAreaName("capgemini");
		   pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please select city'$")
	public void display_the_message_Please_select_city() {
		
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please select city", message);
		   log.info("enter the city");
	}

	/*@When("^User click on 'Next' link without selecting  'State'$")
	public void user_click_on_Next_link_without_selecting_State(){
		pageBean.setCity("hyderabad");
		   pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please select state'$")
	public void display_the_message_Please_select_state()  {
		driver.switchTo().alert().dismiss();
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please select state", message);
	}

	@When("^User click on 'Next' link without selecting  'MemberShip Status '$")
	public void user_click_on_Next_link_without_selecting_MemberShip_Status()  {
		pageBean.setCity("telangana");
		   pageBean.clickNextPageLink();
	}

	@Then("^Display the message 'Please Select MemeberShip status'$")
	public void display_the_message_Please_Select_MemeberShip_status() {
		driver.switchTo().alert().dismiss();
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please select MemberShip status", message);
	}*/

	@When("^User click on 'Next' link after entering Valid information$")
	public void user_click_on_Next_link_after_entering_Valid_information() {
		driver.switchTo().alert().dismiss();
		
		pageBean.setCity("Hyderabad");
		   pageBean.clickNextPageLink();
		 /*  pageBean.setMemberStatus("employee");
		   pageBean.clickNextPageLink();*/
	}

	@Then("^Display the message 'Personal details are validated\\.'$")
	public void display_the_message_Personal_details_are_validated(){
	
		/*String message=driver.switchTo().alert().getText();
		System.out.println(message);
		   assertEquals("Personal details are validated.", message);
		   driver.switchTo().alert().dismiss();*/
		   pageBean.clickNextPageLink();
		   log.info("moved to next page");
	}

@Test
public void checkpage() throws InterruptedException
{
	user_Conference_room_booking_page_to_book_the_room();
	Thread.sleep(2000);
	user_click_on_Next_link_without_entering_FirstName();
	Thread.sleep(2000);
	display_the_message_Please_fill_the_First_Name();
	Thread.sleep(2000);
	user_click_on_Next_link_without_entering_LastName();
	Thread.sleep(2000);
	display_the_message_Please_fill_the_Last_Name();
	Thread.sleep(2000);
	user_click_on_Next_link_without_entering_Email();
	Thread.sleep(2000);
	display_the_message_Please_fill_the_Email();
	Thread.sleep(2000);
	user_click_on_Next_link_after_entering_invalid_Email_address();
	Thread.sleep(2000);
	display_the_message_Please_enter_valid_Email_Id();
	Thread.sleep(2000);
	user_click_on_Next_link_without_entering_Contact_No();
	Thread.sleep(2000);
	display_the_message_Please_fill_the_Contact_No();
	Thread.sleep(2000);
	user_click_on_Next_link_after_entering_invalid_Contact_No();
	Thread.sleep(2000);
	display_the_message_Please_enter_valid_Contact_no();
	Thread.sleep(2000);
	user_click_on_Next_link_without_selecting_Number_of_people_attending();
	Thread.sleep(2000);
	display_the_message_Please_fill_the_Number_of_people_attending();
	Thread.sleep(2000);
	 user_click_on_Next_link_without_entereing_Building_Name_Room_No();
	 Thread.sleep(2000);
	display_the_message_Please_fill_the_Building_Room_No();
	Thread.sleep(2000);
	user_click_on_Next_link_without_entereing_Area_Name();
	Thread.sleep(2000);
	display_the_message_Please_fill_the_Area_name();
	Thread.sleep(2000);
	user_click_on_Next_link_without_selecting_City();
	Thread.sleep(2000);
	display_the_message_Please_select_city();
	/*user_click_on_Next_link_without_selecting_State();
	 display_the_message_Please_select_state();
	user_click_on_Next_link_without_selecting_MemberShip_Status();
	display_the_message_Please_Select_MemeberShip_status();*/
	Thread.sleep(2000);
	user_click_on_Next_link_after_entering_Valid_information();
	Thread.sleep(2000);
	display_the_message_Personal_details_are_validated();
	Thread.sleep(2000);
	
}
}
