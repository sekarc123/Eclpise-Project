package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test 
{
	WebDriver driver;

	@Given("^open chrome browser and start application$")
	public void open_chrome_browser_and_start_application() throws Throwable 
	{
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://interviewhunt.com");
	}

	@And("^check the site is opening$")
	public void check_the_site_is_opening() throws Throwable 
	{
	   
	}

	@When("^click a given titles$")
	public void click_a_given_titles() throws Throwable 
	{
	    
	}

	@And("^check the link is opening$")
	public void check_the_link_is_opening() throws Throwable 
	{
	   
	}

	@Then("^validate the outcomes$")
	public void validate_the_outcomes() throws Throwable 
	{
	   
	}


	
}
