package com.wordpress.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew 
{
	WebDriver driver;
	
	public LoginPageNew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(id="user_login") @CacheLookup WebElement username;
	
	@FindBy(how=How.XPATH,using=".//*[@id='user_pass']") @CacheLookup WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='wp-submit']") @CacheLookup WebElement submit;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your password?") @CacheLookup WebElement lostpassword;
	
	public void verfylogin(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		submit.click();
	}
	

}
  