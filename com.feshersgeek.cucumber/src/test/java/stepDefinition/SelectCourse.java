package stepDefinition;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectCourse 
{
	WebDriver driver;
	
	// @select
	@Given("^open browser enter url and login$")
	public void open_browser_enter_url_and_login() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://stage-academy.freshersgeek.com/");
	    Thread.sleep(5000);
	    driver.navigate().to("http://stage-academy.freshersgeek.com/");
	    driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("log")).sendKeys("sekarc123@gmail.com");
	    driver.findElement(By.name("pwd")).sendKeys("8754740912");
	    driver.findElement(By.name("user-submit")).click();
	    Thread.sleep(5000);
	}

	@When("^I complete login click on courses$")
	public void i_complete_login_click_on_courses() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[text()='Courses'])[1]")).click();
		Thread.sleep(5000);
		
	}

	@And("^click on technology$")
	public void click_on_technology() throws Throwable 
	{
		driver.findElement(By.xpath("//*[@title='View all posts filed under Technology']")).click();
		Thread.sleep(5000);
	   
	}

	@And("^get list of technology$")
	public void get_list_of_technology() throws Throwable 
	{
		
		String x=driver.findElement(By.xpath("(//*[text()='Software Training'])[1]")).getAttribute("title");
		System.out.println(x);
		Thread.sleep(5000);
		String x1=driver.findElement(By.xpath("(//*[text()='Developing Mobile Apps'])[1]")).getAttribute("title");
		System.out.println(x1);
		String x2=driver.findElement(By.xpath("(//*[text()='How to develop Mac Apps'])[1]")).getAttribute("title");
		System.out.println(x2);
	    
	}

	@Then("^back to courses search a course by name$")
	public void back_to_courses_search_a_course_by_name() throws Throwable 
	{
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.id("course_search")).sendKeys("software",Keys.ENTER);
		String x3=driver.findElement(By.xpath("//*[text()='Software Training']")).getAttribute("href");
		System.out.println(x3);
		Thread.sleep(5000);
		
	}

	@And("^select a course from list and logout$")
	public void select_a_course_from_list_and_logout() throws Throwable 
	{
		driver.findElement(By.xpath("//*[text()='Software Training']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='TAKE THIS COURSE']")).click();
		driver.findElement(By.xpath("(//*[text()='Sekar Automation'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
	// @filter
	
	@Given("^login to stage-academy\\.freshersgeek\\.com$")
	public void login_to_stage_academy_freshersgeek_com() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://stage-academy.freshersgeek.com/");
	    Thread.sleep(5000);
	    //driver.navigate().to("http://stage-academy.freshersgeek.com/");
	    driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("log")).sendKeys("sekarc123@gmail.com");
	    driver.findElement(By.name("pwd")).sendKeys("8754740912");
	    driver.findElement(By.name("user-submit")).click();
	    Thread.sleep(5000);
		
	 }

	@When("^click on check box to filter and check the result$")
	public void click_on_check_box_to_filter_and_check_the_result() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[text()='Courses'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Technology'])[2]")).click();
		driver.findElement(By.xpath("//*[@for='user1']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("(//*[text()='All'])[1]")).click();
	    
	    // handling calendar
	    //start date
	   /* driver.findElement(By.id("start_date")).click();
		
		List<WebElement> allDates=driver.findElements(By.xpath("//*[@class='ui-state-default']"));
		
		for(WebElement ele:allDates)
		{
			String date=ele.getText();	
			if(date.equalsIgnoreCase("16"))
			{
				ele.click();
				break;
			}
		}
		Thread.sleep(5000);
		//end date
		 driver.findElement(By.id("end_date")).click();
		 driver.findElement(By.xpath("//*[@title='Next']")).click();
			
			List<WebElement> allDates1=driver.findElements(By.xpath("//*[@class='ui-state-default']"));
			
			for(WebElement ele1:allDates1)
			{
				String date1=ele1.getText();	
				if(date1.equalsIgnoreCase("18"))
				{
					ele1.click();
					break;
				}
			} */
			
		Thread.sleep(5000);
	    driver.findElement(By.xpath("(//*[text()='All'])[2]")).click();
	    driver.findElement(By.id("submit_filters")).click();
	    Thread.sleep(5000);	
	}
	
	@When("^choose a course to start$")
	public void choose_a_course_to_start() throws Throwable 
	{
		 driver.findElement(By.xpath("//*[text()='Developing Mobile Apps']")).click();
		 Thread.sleep(5000);	
		 driver.findElement(By.xpath("//*[@class='course_button full button']")).click();
		 Thread.sleep(5000);
		//back to course details
		 //driver.findElement(By.xpath("//*[text()='BACK TO COURSE']")).click();

		 
 // Ask question in discussion
		/* WebElement e= driver.findElement(By.xpath("//*[@id='discussion']/child::a[1]']"));
		 Actions a=new Actions(driver);
		 a.click(e).build().perform();
		// driver.findElement(By.xpath("//*[text()='Ask Question']")).click();
		 driver.findElement(By.xpath("//*[text()='Post Question']/preceding::*[1]")).sendKeys("what basics need to for developing mobile apps");
		 //post a question
		 driver.findElement(By.xpath("//*[text()='Post Question']")).click();
		//cancel 
		 //driver.findElement(By.xpath("//*[text()='Cancel']")).click();*/
		 
 //Review course
		 driver.findElement(By.name("review_course")).click();
		 driver.findElement(By.name("review_title")).sendKeys("developing-apps");
		 driver.findElement(By.xpath("//*[@title='5']")).click();
		 driver.findElement(By.name("comment")).sendKeys("it's good");
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(5000);
 //Finish course
		// driver.findElement(By.name("submit_course")).click();
		// driver.findElement(By.id("next_unit")).click();
	//	 driver.findElement(By.id("prev_unit")).click();
		
		 
	}

	@Then("^Logout$")
	public void logout() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[text()='Sekar Automation'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		Thread.sleep(5000);
		driver.close();
	
	}
	
//change profile picture
	
	@Given("^login$")
	public void login() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://stage-academy.freshersgeek.com/");
	    Thread.sleep(5000);
	    driver.navigate().to("http://stage-academy.freshersgeek.com/");
	    driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("log")).sendKeys("sekarc123@gmail.com");
	    driver.findElement(By.name("pwd")).sendKeys("8754740912");
	    driver.findElement(By.name("user-submit")).click();
	    Thread.sleep(5000);	
	   
	}

	@When("^open profile$")
	public void open_profile() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[text()='Sekar Automation'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='View profile']")).click();
		Thread.sleep(5000);
	//base profile
	/*	driver.findElement(By.id("edit")).click();
		Thread.sleep(5000);
		//driver.findElement(By.name("field_1")).sendKeys("name");
		driver.findElement(By.name("field_2")).sendKeys("banglore");
		driver.findElement(By.name("field_2")).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"B.E- ECE");
		driver.findElement(By.xpath("(//*[text()='Change'])[2]")).click();
		driver.findElement(By.id("see-field_3_loggedin")).click();		
		Thread.sleep(10000);
		WebElement e=driver.findElement(By.xpath("(//*[text()='Change'])[4]"));
		Actions a=new Actions(driver);
		a.click(e).build().perform();
		driver.findElement(By.xpath("(//*[text()='Change'])[4]")).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(5000);
		Thread.sleep(10000);

   //social profile
		driver.findElement(By.xpath("//*[text()='Social Profiles']")).click();
		driver.findElement(By.name("field_10")).sendKeys("facebook");
		driver.findElement(By.name("field_11")).sendKeys("twitter");
		//driver.findElement(By.name("field_11")).sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(5000);*/
		
	}

	@When("^change profile picture$")
	public void change_profile_picture() throws Throwable 
	{
		driver.findElement(By.id("change-avatar")).click();
		driver.findElement(By.id("bp-browse-button")).click();
		Thread.sleep(10000);
		//java robot for file uploading
		Robot r=new Robot();
		StringSelection s=new StringSelection("C:\\Users\\SEKAR\\Desktop\\Lion.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Crop Image']")).click();
		Thread.sleep(10000);
  //change cover photo
		driver.findElement(By.id("change-cover-image")).click();
		driver.findElement(By.id("bp-browse-button")).click();
		Thread.sleep(10000);
		//java robot for file uploading
		Robot r1=new Robot();
		StringSelection s1=new StringSelection("C:\\Users\\SEKAR\\Desktop\\Lion.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);	
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
	/*//delete profile image
		driver.findElement(By.id("change-avatar")).click();
		driver.findElement(By.xpath("//*[text()='Delete']")).click();
		driver.findElement(By.id("bp-delete-avatar")).click();
		Thread.sleep(5000);
	//delete cover photo
		driver.findElement(By.id("change-cover-image")).click();
		driver.findElement(By.id("bp-delete-cover-image")).click();
		Thread.sleep(5000);
	  */
	}

	@Then("^Signout$")
	public void signout() throws Throwable 
	{
		driver.findElement(By.xpath("(//*[text()='Sekar Automation'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		Thread.sleep(5000);
		driver.close();
	  
	}



}
