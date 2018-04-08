package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example {
	
		WebDriver driver;
	
	@Given("^open chrome browser$")
	public void open_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^open gmail\\.com$")
	public void open_gmail_com() throws Throwable {
		driver.get("http://www.gmail.com");
		WebDriverWait w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.urlContains("google"));
		
		
	}

	@Then("^exit$")
	public void exit() throws Throwable {
		driver.quit();
	   
	}
}
