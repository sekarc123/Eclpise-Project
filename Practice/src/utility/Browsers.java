package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers 
{
	static WebDriver driver;
	
	static public WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\ie\\IEDriverServer.exe");
			//WebDriver driver=new InternetExplorerDriver();
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
		
	}

}
