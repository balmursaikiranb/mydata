/**
 * 
 */
package com.cg.hotel.step;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.PersonalDetails_152604.bean.EducationalDetailsBean;
import com.cg.PersonalDetails_152604.bean.PersonalDetailsBean;
import com.cg.PersonalDetails_152604.util.DriverUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author learning
 *
 */
public class EducationalStepDefinition {
Logger log=Logger.getRootLogger();
	
	private WebDriver driver;
	private WebDriver driver1;
	private PersonalDetailsBean pageBean;
	private EducationalDetailsBean pageOneBean;
	private DriverUtil util=new DriverUtil();
	private DriverUtil utilTwo=new DriverUtil();
	@Before
	public void initialization() throws FileNotFoundException, IOException {
		driver = util.initializeDriver("chrome");
		pageBean = new PersonalDetailsBean();
		//pageOneBean=new EducationalDetailsBean();
		//PageFactory.initElements(driver, pageBean);
		//driver1=utilTwo.initializeDriver("chrome");
		pageOneBean=new EducationalDetailsBean();
		PageFactory.initElements(driver, pageOneBean);
		/*String log4JPropertiesFile="logger.properties";
		Properties p=new Properties();
		p.load(new FileInputStream(log4JPropertiesFile));
		PropertyConfigurator.configure(p);
		log.info("iam configured");*/
		
	}
	@After
	public void closeUp() {

	//	util.closeDriver();
	}
	@Test
	public void checkForEducationalDetails() throws InterruptedException
	{
		user_Educational_details_page();
		user_click_on_Register_Me_button_without_selecting_Graduation();
		display_the_message_Please_select_Graduation();
		user_click_on_Register_Me_button_without_entering_Percentage();
		display_the_message_Please_fill_percentage_detail();
		user_click_on_Register_Me_button_without_entering_Passing_Year();
		display_the_message_Please_fill_passing_year();
		user_click_on_Register_Me_button_without_entering_Project_Name();
		display_the_message_Please_fill_the_Project_Name();
		user_click_on_Register_Me_button_without_selecting_Technologies_Used();
		display_the_message_Please_select_Technologies_used();
		display_the_message_Please_fill_other_technologies_used();
		display_the_message_Your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link();
	}
	@Given("^User Educational details page$")
	public void user_Educational_details_page() {
		driver.get("D:\\Practice\\BDD\\PersonalDetails_152604\\Web\\EducationalDetails.html");
		String title=driver.getTitle();
		System.out.println(title);
		
	//	assertEquals("Educational Details",title);
	   
	}

	@When("^User click on 'Register Me' button without selecting 'Graduation'$")
	public void user_click_on_Register_Me_button_without_selecting_Graduation() throws InterruptedException  {
		
	//	pageOneBean.register();
		Thread.sleep(4000);
	}

	@Then("^Display the message 'Please select Graduation'$")
	public void display_the_message_Please_select_Graduation()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please Select Graduation", message);
		   log.info("enter the graduation");
	}

	@When("^User click on 'Register Me' button without entering 'Percentage'$")
	public void user_click_on_Register_Me_button_without_entering_Percentage()  {
		//driver.switchTo().alert().dismiss();
		 pageOneBean.setGraduation("BE");
		  pageOneBean.register();
	}

	@Then("^Display the message 'Please fill percentage detail'$")
	public void display_the_message_Please_fill_percentage_detail()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill Percentage detail", message);
		   log.info("enter the percentage");
	}

	@When("^User click on 'Register Me' button without entering 'Passing Year'$")
	public void user_click_on_Register_Me_button_without_entering_Passing_Year() {
	//driver.switchTo().alert().dismiss();
		 pageOneBean.setPercentage("86");
		   pageOneBean.register();
	}

	@Then("^Display the message 'Please fill passing year'$")
	public void display_the_message_Please_fill_passing_year()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill Passing Year", message);
		   log.info("enter the passing year");
	}

	@When("^User click on 'Register Me' button without entering 'Project Name'$")
	public void user_click_on_Register_Me_button_without_entering_Project_Name()  {
		//driver.switchTo().alert().dismiss();
		 pageOneBean.setPassYear("2018");
		   pageOneBean.register();
	}

	@Then("^Display the message 'Please fill the Project Name'$")
	public void display_the_message_Please_fill_the_Project_Name()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill Project Name", message);
		   log.info("enter the project name");
	}

	@When("^User click on 'Register Me' button without selecting  'Technologies Used'$")
	public void user_click_on_Register_Me_button_without_selecting_Technologies_Used() {
		//driver.switchTo().alert().dismiss();
		 pageOneBean.setProjectName("java");
		   pageOneBean.register();
	}

	@Then("^Display the message 'Please select Technologies used'$")
	public void display_the_message_Please_select_Technologies_used()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please Select Technologies Used", message);
		   log.info("select the technologies used");
	}

	@When("^user click on 'Register Me' button selecting other in 'Technologies Used'$")
	public void user_click_on_Register_Me_button_selecting_other_in_Technologies_Used()  {
		//driver.switchTo().alert().dismiss();
		 pageOneBean.setTechnologies("Java");
		   pageOneBean.register();
	}

	@Then("^Display the message 'Please fill other technologies used'$")
	public void display_the_message_Please_fill_other_technologies_used()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Please fill other Technologies Used", message);
		   log.info("enter the technologies used");
	}

/*	@Given("^User educational details page$")
	public void user_educational_details_page()  {
	   
	}

	@When("^User click on 'Register Me' button after entering Valid information$")
	public void user_click_on_Register_Me_button_after_entering_Valid_information()  {
		driver.switchTo().alert().dismiss();
		 pageOneBean.setOtherTechs("C++");
		   pageOneBean.register();
	}*/

	@Then("^Display the message 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!'$")
	public void display_the_message_Your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link()  {
		String message=driver.switchTo().alert().getText();
		   assertEquals("Your Registration Has succesfully done Plz check you registerd email for account activation link !!!", message);
		  
	}
	
}
