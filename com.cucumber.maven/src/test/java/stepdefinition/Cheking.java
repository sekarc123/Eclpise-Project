package stepdefinition;

import java.awt.Paint;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Cheking 
{
	
	WebDriver driver; 
	
	//search
	@Given("^OPen browser and login$")
	public void open_browser_and_login() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
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

	@When("^search with text and check listed corectly$")
	public void search_with_text_and_check_listed_corectly() throws Throwable 
	{
		//disable an element
		//WebElement w=driver.findElement(By.xpath("//*[@class='tab']"));
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].setAttribute('disabled,'');",w);
				
		WebElement e=driver.findElement(By.id("header_search"));
		Actions a=new Actions(driver);
		a.moveToElement(e).click().perform();
		a.sendKeys("which is best mobile below RS.10000").build().perform();
		
		//Point p=e.getLocation();
		//int xcor = p.getX();
		//int ycor= p.getY();
		//System.out.println(xcor+ "," +ycor);
		
		//driver.findElement(By.id("header_search")).sendKeys("which is best mobile below RS.10000");
		//driver.findElement(By.xpath("//*[@class='fa fa-search']")).click();
		//a.click(e).build().perform();   
		//Thread.sleep(5000);	   
	}

	@Then("^logout and exit browser$")
	public void logout_and_exit_browser() throws Throwable 
	{
		WebElement element = driver.findElement(By.xpath("(//*[text()='Log out'])[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	    Thread.sleep(5000);

		System.out.println("pass");
	}
	//Category

	@Given("^LOGIN$")
	public void login() throws Throwable 
	{

		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
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

	@When("^ort by category and check listed corectly$")
	public void ort_by_category_and_check_listed_corectly() throws Throwable 
	{
		//driver.findElement(By.xpath("(//*[text()='Select Categories'])[2]")).click();
		WebElement e=driver.findElement(By.xpath("(//*[text()='Select Categories'])[2]"));
		Select s1=new Select(e); 
		Thread.sleep(5000);
		s1.selectByVisibleText("Education");
		Thread.sleep(5000);
		
		/*Screen s=new Screen();
		s.click("C:\\Users\\SEKAR\\Desktop\\categoryselected.png");
		Thread.sleep(5000);
		String x=driver.getTitle();
		//driver.findElement(By.xpath("(//*[text()='Question Cagtegory: Accessories'])")).isDisplayed();
		System.out.println(x);*/
		
	}
	
	@Then("^sign out and Exit browser$")
	public void sign_out_and_Exit_browser() throws Throwable 
	{
		WebElement element = driver.findElement(By.xpath("(//*[text()='Log out'])[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	    Thread.sleep(5000);
	}
	
	//Trending
	@Given("^login in interviewhut$")
	public void login_in_interviewhut() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://stage.interviewhut.com/");
		Thread.sleep(10000);
       	driver.findElement(By.id("open")).click();
	    //driver.findElement(By.linkText("Login or Register")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("log")).sendKeys("sekarreddy");
	    driver.findElement(By.id("pwd")).sendKeys("112411106075");
		driver.findElement(By.xpath("//*[@class='bt_login']")).click();
		Thread.sleep(5000);
		
		/*
		  //Answer a question
		driver.findElement(By.xpath("(//*[text()='what is twitter?'])[3]")).click();
        Thread.sleep(5000);
    	driver.switchTo().frame("post_content_ifr");
        driver.findElement(By.id("tinymce")).click();
        Thread.sleep(5000);
        
        File f=new File("C:\\Users\\SEKAR\\Desktop\\answer.xls");
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
        driver.findElement(By.xpath("(//*[@id='submit_reply'])[2]")).click();
        Thread.sleep(5000);
        w.close();
        wb.write();
        wb.close(); 
        System.out.println("pass");
		Thread.sleep(5000);*/
	}

	@When("^check answer in Trending$")
	public void check_answer_in_Trending() throws Throwable 
	{
	  String a= driver.findElement(By.xpath("(//*[text()='Trending Activities'])[2]/following::span[1]")).getText();
	   System.out.println(a);
		
	}

	@Then("^logout interviewhut$")
	public void logout_interviewhut() throws Throwable 
	{
		WebElement element = driver.findElement(By.xpath("(//*[text()='Log out'])[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	    Thread.sleep(5000);
	}
	
	//Counts

	@Given("^Login in interviewhutsite$")
	public void login_in_interviewhutsite() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
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

	@When("^Check Answer,view,and vote count$")
	public void check_Answer_view_and_vote_count() throws Throwable 
	{
		String b=driver.findElement(By.xpath("(//*[@class='question-views'])[2]")).getText();
	   System.out.println("viewcount" + b);
	   String c=driver.findElement(By.xpath("(//*[@class='question-answers'])[2]")).getText();
	   System.out.println("Answercount" + c);
	   String d=driver.findElement(By.xpath("(//*[@class='question-votes'])[2]")).getText();
	   System.out.println("Votecount" +d);

	   
	}

	@Then("^Logout interviewhutsite$")
	public void logout_interviewhutsite() throws Throwable 
	{
		WebElement element = driver.findElement(By.xpath("(//*[text()='Log out'])[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	    Thread.sleep(5000);	   
	}
   //tag a question
	
	@Given("^LOGIN INTERVIEWHUT$")
	public void login_INTERVIEWHUT() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
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

	@When("^List a question based on tag$")
	public void list_a_question_based_on_tag() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[@class='q-tag'])[3]")).click();
	    Thread.sleep(5000);
	    String st=driver.findElement(By.xpath("//*[text()='Question Cagtegory: google']")).getText();
	    System.out.println(st);		
	}

	@Then("^SIGNOUT$")
	public void signout() throws Throwable 
	{ 
		WebElement element = driver.findElement(By.xpath("(//*[text()='Log out'])[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	    Thread.sleep(5000);
	}



}
