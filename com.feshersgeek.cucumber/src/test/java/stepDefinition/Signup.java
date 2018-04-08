package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup 
{
	WebDriver driver;	 
	 @Given("^open browser and enter url$")
	 public void open_browser_and_enter_url() throws Throwable 
	 {
		 System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	     driver.get("http://stage-academy.freshersgeek.com/");
	     Thread.sleep(5000);
	     driver.manage().window().maximize();
		 Thread.sleep(5000);
		
	 }

	 @When("^click on signup$")
	 public void click_on_signup() throws Throwable 
	 {	 
	   driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
       Thread.sleep(5000);
   	   driver.findElement(By.xpath("//*[text()='Sign Up']")).click();
   	   Thread.sleep(5000);	  
       driver.findElement(By.name("signup_username")).sendKeys("sekarRaja");
	   driver.findElement(By.name("signup_email")).sendKeys("sekarcreddy@gmail.com");
	   driver.findElement(By.name("signup_password")).sendKeys("password");
	   driver.findElement(By.name("signup_password_confirm")).sendKeys("password");
	   Thread.sleep(5000);
	   driver.findElement(By.name("field_1")).sendKeys("sekarRaja");
	   driver.findElement(By.name("field_2")).sendKeys("location",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"Hi");
	   driver.findElement(By.name("signup_submit")).click();
	   Thread.sleep(5000);  
	    
	 }

	 @Then("^logout$")
	 public void logout() throws Throwable
	 {
	    /*driver.findElement(By.xpath("//*[@class='smallimg vbplogin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		Thread.sleep(5000);
		driver.close();*/
		driver.findElement(By.xpath("(//*[text()='Sekar Automation'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		Thread.sleep(5000);
		driver.close();
	    Thread.sleep(5000);
	    
	 }

}
