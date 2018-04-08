package stepDefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Answer 
{
     
	WebDriver driver;
	
	@Given("^open browser and login$")
	public void open_browser_and_login() throws Throwable 
	{
		  System.setProperty("webdriver.chrome.driver", "F:\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe"); 
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://stage.interviewhut.com/");
		   Thread.sleep(5000);
		   
		    driver.findElement(By.linkText("Login or Register")).click();
		    Thread.sleep(10000);
		    driver.findElement(By.id("username")).sendKeys("sekarreddy");
		    driver.findElement(By.id("password")).sendKeys("112411106075");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(5000);	
   	}

	@When("^Answer a question$")
	public void answer_a_question() throws Throwable 
	{
		 //ANSWER A QUESTION
        driver.findElement(By.xpath("(//*[text()='What is router?'])[5]")).click();
        Thread.sleep(5000);
    	driver.switchTo().frame("post_content_ifr");
        driver.findElement(By.id("tinymce")).click();
        Thread.sleep(5000);
        
        File f=new File("F:\\answer.xls");
        Workbook w=Workbook.getWorkbook(f);
        Sheet s=w.getSheet(0);
        int nor=s.getRows();
        int noc=s.getColumns();
        
        WritableWorkbook wb=Workbook.createWorkbook(f,w);
        WritableSheet ws=wb.getSheet(0);
        for(int i=0; i<nor; i++)
        {
        
            String a=s.getCell(0, i).getContents();
            Thread.sleep(5000);
            driver.findElement(By.id("tinymce")).sendKeys(a);//,Keys.TAB,Keys.ENTER); 
            
        }
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@id='submit_reply'])[6]")).click();
        Thread.sleep(5000);
        w.close();
        wb.close();   
	}

	@Then("^LogOut$")
	public void logout() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[@class='avatar'])[9]")).click();
		driver.findElement(By.xpath("//*[@id='header_sidebar']/preceding::*[2]")).click();
	    Thread.sleep(5000);	
    }	
}
