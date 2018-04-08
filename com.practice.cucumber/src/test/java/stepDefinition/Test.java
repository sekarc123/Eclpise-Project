package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test 
{
	@Given("^open application$")
	public void open_application() throws Throwable 
	{
		System.out.println("application opened");
	  
	}

	@When("^login$")
	public void login() throws Throwable 
	{
		System.out.println("login passed");	
	    
	}

	@Then("^logout$")
	public void logout() throws Throwable 
	{
		System.out.println("logout passed");			
	   
	}


}
