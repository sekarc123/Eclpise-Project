package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Abc {
      
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
	DesiredCapabilities c= new DesiredCapabilities();
	c.setCapability("deviceName", "Redmi");
	c.setCapability(CapabilityType.BROWSER_NAME," ");
	c.setCapability("platformName", "Android");
	c.setCapability("platformVersion", "6.0.1");
	c.setCapability("appPackage", "com.miui.calculator");
	c.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
	//com.android2.calculator3
	//c.setCapability("appPackage", "com.android.calculator2");
	//c.setCapability("appActivity","Calculator");
	c.setCapability("noReset", true);
	URL u=new URL("http://127.0.0.1:4725/wd/hub");
	c.setCapability("noReset", true);
	AndroidDriver driver=new AndroidDriver(u,c);
	Thread.sleep(5000);

	//driver.findElement(By.xpath("//*[@content-desc='Search']")).click();

	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@text='9']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@text='8']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@text='+']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@text='7']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@text='=']")).click();
	Thread.sleep(5000);
	String x=driver.findElement(By.xpath("//*[@class='android.widget.EditText'][@index='0']")).getText();
	System.out.println(x);
	driver.closeApp();
	
	}//com.android.calculator2:id/op_add  com.android.calculator2:id/eq

}
