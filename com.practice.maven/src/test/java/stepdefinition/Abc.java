package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Abc 
{
	WebDriver driver= null;
	@Given("^open facebook$")
	public void open_facebook() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	    Thread.sleep(5000);
	    
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable 
	{
		driver.findElement(By.id("email")).sendKeys("sekarc123@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("98734492356");
	    driver.findElement(By.id("u_0_5")).click();
	    Thread.sleep(5000);	
	   
	}

	@Then("^validate the outcomes$")
	public void validate_the_outcomes() throws Throwable 
	{
		if(driver.findElement(By.name("pass")).isDisplayed())
		{
			System.out.println("invalid user");
		}
		else
		{
			System.out.println("valid user");
		}
			
	}



}
