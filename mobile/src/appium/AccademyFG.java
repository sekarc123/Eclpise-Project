package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AccademyFG 
{
	public static void main(String[] args) throws MalformedURLException
  {
	DesiredCapabilities c=new DesiredCapabilities();
	c.setCapability("deviceName", "Emulator");
	c.setCapability("platformName", "Android");
	c.setCapability("paltformVersion", "5.1.1");
	c.setCapability("appPackage", "biz.buildapps.academyFG");
	c.setCapability("appActivity", "biz.buildapps.academyFG.MainActivity");
	URL u=new URL ("http://127.0.0.1:4725/wd/hub");
	AndroidDriver driver=new AndroidDriver(u,c);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
  }

}
