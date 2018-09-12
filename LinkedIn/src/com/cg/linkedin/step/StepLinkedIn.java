/**
 * 
 */
package com.cg.linkedin.step;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.linkedin.pojo.LinkedIn;
import com.cg.linkedin.util.DriverUtil1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author learning
 *
 */
public class StepLinkedIn {

	private WebDriver driver;
	private LinkedIn pageBean;
	private DriverUtil1 util=new DriverUtil1();
	@Before
	public void initialization() {
		driver = util.initializeDriver("chrome");
		pageBean = new LinkedIn();
		PageFactory.initElements(driver, pageBean);
	}
	@After
	public void closeUp() {

		util.closeDriver();
	}
	@Test
	public void runTest()
	{
		we_should_enter_all_the_credentials();
		we_clickon_the_signup();
		redirect_to_next_page();
		
	}
	@Given("^we should enter all the credentials$")
	public void we_should_enter_all_the_credentials()  {
		driver.get("https://in.linkedin.com/");
		pageBean.setFirstname("saikiran");
		pageBean.setLastname("balmur");
		pageBean.setEmailid("balmursaikiran@yahoo.com");
		pageBean.setPassword("saikiran@123");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("^we clickon the signup$")
	public void we_clickon_the_signup() {
	   pageBean.clickme();
	   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^redirect to next page$")
	public void redirect_to_next_page()  {
	  /* String title=driver.getTitle();
	   System.out.println(title);
	   assertEquals("Linked In: Log In or Sign Up",title);*/
	   
	}
}
