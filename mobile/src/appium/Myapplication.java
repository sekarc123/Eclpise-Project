package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Myapplication 
{
public static void main(String[] args) throws MalformedURLException, InterruptedException 
 {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter computer/avd /ard");
	String x=sc.nextLine();
	WebDriver driver = null;
	if(x.equals("computer"))
	{
		System.setProperty("webdriver.chrome.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(x.equals("avd"))
	{
		DesiredCapabilities c=new DesiredCapabilities();
		//c.setCapability("noReset", true);
		c.setCapability(CapabilityType.BROWSER_NAME, "Browser");
		c.setCapability("deviceName", "emulator-5554");
		c.setCapability("platformName","Android");
		c.setCapability("PlatformVersion","6.0");
		URL u=new URL ("http://127.0.0.1:4725/wd/hub");
		driver=new AndroidDriver(u,c);
		Thread.sleep(5000);
	}
	else if(x.equals("ard"))
	{
		//ChromedriverHandler.chromeDriverHandlerThread().start();
		
		DesiredCapabilities c=new DesiredCapabilities();
		//c.setCapability("noReset", true);
		c.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		c.setCapability("deviceName", "Redmi");
		c.setCapability("platformName","Android");
		c.setCapability("PlatformVersion","6.0.1");
		//c.setCapability("appPackage", "com.android.chrome");
		//c.setCapability("appActivity", "Chrome");
		c.setCapability("noReset", true);
		URL u=new URL ("http://127.0.0.1:4725/wd/hub");
		driver=new AndroidDriver(u,c);
		Thread.sleep(5000);
		
	}
	else
	{
		System.out.println("wrong data");
		System.exit(0);
		
				//c.setCapability("fullReset", false);
				//c.setCapability(MobileCapabilityType.FULL_RESET, false);
				
	}
	//launch site
	driver.get("http://gmail.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.name("identifier"));
	//Thread.sleep(15000);
	//login
	driver.findElement(By.name("identifier")).sendKeys("sekarcreddy@gmail.com");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(15000);
	driver.findElement(By.name("password")).sendKeys("sekar18.");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(15000);
	//logout
	driver.findElement(By.xpath("//*[starts-with(@title,'Google Account')]/child::span")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[text()='Sign out']")).click();
	Thread.sleep(5000);
	//ChromedriverHandler.chromeDriverHandlerThread().stop();
	//close site
	driver.close();	
 }


}
