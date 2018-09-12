/**
 * 
 */
package com.cg.example1.stepdef;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.example1.pojo.Example1;
import com.cg.example1.util.DriverUtil1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author learning
 *
 */
public class StepDefinition {

	private WebDriver driver;
	private Example1 pageBean;
	private DriverUtil1 util=new DriverUtil1();
	@Before
	public void initialization() {
		driver = util.initializeDriver("chrome");
		pageBean = new Example1();
		PageFactory.initElements(driver, pageBean);
	}
	@Given("^The index page$")
	public void the_index_page() {
		driver.get("http://localhost:8081//Example1//index.html");
	}

	@When("^Entered all the inputs into the page$")
	public void entered_all_the_inputs_into_the_page()  {
		 pageBean.setName("saikiran");
		  pageBean.setDesignation("SE");
		  pageBean.setCountry("CHINA");
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^Show the redirect page$")
	public void show_the_redirect_page()  {
		pageBean.NextLink();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@After
	public void closeUp() {

		util.closeDriver();
	}
	@Test
	public void runTest()
	{
		the_index_page();
		entered_all_the_inputs_into_the_page();
		show_the_redirect_page();
	}
}
