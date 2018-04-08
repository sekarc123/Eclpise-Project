package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateAvatar 
{
	WebDriver driver;
	@Given("^OPEN browser and LOGIN$")
	public void open_browser_and_LOGIN() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe"); 
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://stage.interviewhut.com/");
		   Thread.sleep(10000);
			driver.findElement(By.id("open")).click();
		    //driver.findElement(By.linkText("Login or Register")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.id("log")).sendKeys("sekarreddy");
		    driver.findElement(By.id("pwd")).sendKeys("112411106075");
			driver.findElement(By.xpath("//*[@class='bt_login']")).click();
			Thread.sleep(5000);	
	    
	}

	@When("^Update avatar$")
	public void update_avatar() throws Throwable 
	{
		
	   
	}

	@Then("^LOGOUT$")
	public void logout() throws Throwable 
	{
		WebElement element = driver.findElement(By.xpath("(//*[text()='Log out'])[2]"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
	    Thread.sleep(5000);	    
	}



}
