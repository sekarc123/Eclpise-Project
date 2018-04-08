/**
 * 
 */
package com.wordpress.testcasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.page.LoginPage;

/**
 * @author SEKAR
 *
 */
public class VerifywordpressLogin 
{
	@Test
	public void verifyLogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "G:\\VOLUME F\\selenium228\\seleniumBrowserdrivers\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://installatron.com/wordpress/demo/backend");
		Thread.sleep(3000);
		driver.switchTo().frame("itdemo");
		Thread.sleep(3000);
		
		LoginPage login=new LoginPage(driver);
		
		login.Logintowordpress("admin", "demo");
		
		/*login.typeusername("admin");
		login.typepassword("demo");
		login.typelogin();
		*/
		driver.quit();
		
		
	}

}
