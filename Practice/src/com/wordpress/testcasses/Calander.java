package com.wordpress.testcasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calander {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.ie.driver","G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\ie\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		System.setProperty("webdriver.gecko.driver","G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.mercurytravels.co.in/");
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//td"));
		for(WebElement e:alldates)
		{
			String s=e.getText();
			if(s.equalsIgnoreCase("15"))
			{
				e.click();
				break;
			}
			
		}
   }

}
