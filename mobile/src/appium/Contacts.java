package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Contacts {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability(CapabilityType.BROWSER_NAME,"");
		c.setCapability("deviceName", "emulator-5554");
		c.setCapability("platformName","Android");
		c.setCapability("platformVersion", "5.1.1");
		//c.setCapability("appPackage", "com.android.contacts");
		//c.setCapability("appActivity", ".activities..PeopleActivity");
		c.setCapability("appPackage", "com.android.providers.contacts");
		c.setCapability("appActivity", ".debug.ContactsDumpActivity");
		URL u=new URL("http://127.0.0.1:4725/wd/hub");
		AndroidDriver driver=new AndroidDriver(u,c);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@content-desc='add new contact']")).click();
		driver.findElement(By.xpath("//*[@text='Name']")).sendKeys("xyz");
		driver.findElement(By.xpath("//*[@text='Phonetic name']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@text='Nickname']")).sendKeys("def");
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys("123456789");
		driver.hideKeyboard();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Home']")).click();
		driver.findElement(By.xpath("//*[@text='Email']")).sendKeys("abc@gmail.com");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Home'][@index='0']")).click();
		Thread.sleep(5000);
				

	}

}
