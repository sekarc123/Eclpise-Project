package appium;

import java.net.MalformedURLException;
 
import java.net.URL;
 
import java.util.concurrent.TimeUnit;
 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
 
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class App 
{
	private static AndroidDriver driver;
	
 public static void main(String[] args) throws MalformedURLException, InterruptedException
 {	
	  // Create object of DesiredCapabilities class                             
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 //capabilities.setCapability("fullReset", true);
	 // Optional
	 capabilities.setCapability(CapabilityType.BROWSER_NAME, " ");
	 // Specify the device name (any name)
	 capabilities.setCapability("deviceName", "Redmi");
	 // Platform version
	 capabilities.setCapability("platformVersion", "6.0.1");
	 // platform name
	 capabilities.setCapability("platformName", "Android"); 
	 // specify the application package that we copied from appium                
	 capabilities.setCapability("appPackage", "io.selendroid.testapp");
	 // specify the application activity that we copied from appium                   
	 capabilities.setCapability("appActivity", "HomeScreenActivity");
	 // Start android driver I used 4727 port by default it will be 4723
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities); 
	 // Specify the implicit wait of 5 second
     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //Thread.sleep(5000);
	 Thread.sleep(5000);
     // Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@content-desc='my_text_fieldCD']")).sendKeys("abc");
	 Thread.sleep(5000);
	 driver.hideKeyboard();
	// Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@text='I accept adds']")).click();
	 Thread.sleep(5000);	
	//driver.findElement(By.xpath("//*[@content-desc='startUserRegistrationCD']")).click();
	//driver.findElement(By.xpath("//*[@content-desc='showPopupWindowButtonCD']")).click();
	//Thread.sleep(5000);
	//capabilities.setCapability("autoAcceptAlerts", true);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@content-desc='visibleTestAreaCD']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@text='Touch Actions']")).click();
	Thread.sleep(5000);
	WebElement e=driver.findElement(By.xpath("//*[@text='Scale Factor: 1.0']"));
	driver.pinch(e);
	driver.rotate(ScreenOrientation.LANDSCAPE);
	Thread.sleep(5000);
	driver.rotate(ScreenOrientation.PORTRAIT);
	Thread.sleep(5000);
	//driver.sendKeyEvent(AndroidKeyCode.HOME);
	//driver.runAppInBackground(10);
	//Thread.sleep(10000);
	driver.openNotifications();
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.SETTINGS);
	Thread.sleep(5000);
	//driver.openNotifications();
	Thread.sleep(5000);
	driver.pressKeyCode(AndroidKeyCode.HOME);
	  	
 }

}
