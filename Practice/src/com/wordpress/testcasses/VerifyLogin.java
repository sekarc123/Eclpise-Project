/**
 * 
 */
package com.wordpress.testcasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.page.LoginPageNew;

import utility.Browsers;

/**
 * @author SEKAR
 *
 */
public class VerifyLogin 
{
	@Test
	public void checkvaliduser()
	{
		//This will launch browser and specific url
		WebDriver driver=Browsers.startBrowser("firefox", "http://installatron.com/wordpress/demo/backend");
		driver.switchTo().frame("itdemo");
		//Create object using page factory
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		
		//call the method
		login_page.verfylogin("admin", "demo");
		
		
	}
	
	
}
