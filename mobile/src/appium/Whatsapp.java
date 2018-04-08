package appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Whatsapp 
{
 public static void main(String[] args) throws Throwable
 {
	DesiredCapabilities c=new DesiredCapabilities();
	c.setCapability("noReset","true");
	c.setCapability("fullReset","false");
	c.setCapability("deviceName", "Redmi");
	c.setCapability(CapabilityType.BROWSER_NAME, "");
	c.setCapability("platformName", "Android");
	c.setCapability("platformVersion","6.0.1");
	c.setCapability("appackage","com.whatsapp");
	c.setCapability("appActivity","com.whatsapp.Main");
	
	URL u= new URL("http://127.0.0.1:4723/wd/hub");
	
	AndroidDriver driver=new AndroidDriver(u,c);
	Thread.sleep(5000);
	//WebDriverWait driverWait = new WebDriverWait(driver, 30);
	//driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Search']")));

	driver.findElement(By.xpath("//*[@content-desc='Search']")).click();
	/*driver.findElementById("com.whatsapp:id/menuitem_search").click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@content-desc='Search']")).click();
	Thread.sleep(5000);
	WebDriverWait driverWait1 = new WebDriverWait(driver, 30);
	driverWait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search…']")));
	
	driver.findElement(By.xpath("//*[@text='Search…']")).sendKeys("Myvodafone");
	Thread.sleep(2000);*/
	
	
	
 }

}
