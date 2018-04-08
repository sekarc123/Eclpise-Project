package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tags 
{
	
	@Given("^open  browser application$")
	public void open_browser_application() throws Throwable 
	{
		
	    System.out.println("applicataion opend");
	}

	@When("^login sucess$")
	public void login_sucess() throws Throwable 
	{
		   System.out.println("login sucess");	
	 }

	@Then("^logout sucess$")
	public void logout_sucess() throws Throwable
	{
		   System.out.println("logout sucess");
	}

	@Given("^I want to write a step with$")
	public void i_want_to_write_a_step_with() throws Throwable 
	{
		   System.out.println("tag2 Given");
	}

	@When("^I check for the step$")
	public void i_check_for_the_step() throws Throwable 
	{
		   System.out.println("tag2 When");
	}

	@Then("^I verify the step$")
	public void i_verify_the_step() throws Throwable 
	{
		   System.out.println("tag2 Then");	
	}

}
