/**
 * 
 */
package com.wordpress.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author SEKAR
 *
 */
public class LoginPage 
{
	 WebDriver driver;
	 
     By username=By.id("user_login");
     By password=By.xpath(".//*[@id='user_pass']");
     By login=By.xpath(".//*[@id='wp-submit']");
     
     
     public LoginPage(WebDriver driver)
     {
    	 this.driver=driver;
     }
     
     public void Logintowordpress(String uid,String pass)
     {
    	 driver.findElement(username).sendKeys(uid);
    	 driver.findElement(password).sendKeys(pass);
    	 driver.findElement(login).click();
     }
     
     public void typeusername(String uid)
     {
    	 driver.findElement(username).sendKeys(uid);
     }
     public void typepassword(String pwd)
     {
    	 driver.findElement(password).sendKeys(pwd);
     }
     public void typelogin()
     {
    	 driver.findElement(login).click();
     }
     
    
     
     
}
