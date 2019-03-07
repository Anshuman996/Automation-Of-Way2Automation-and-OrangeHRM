package Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverSetUp {

	public AndroidDriver<MobileElement> driver;
	public DesiredCapabilities capabilities=new DesiredCapabilities();
	public WebDriverWait wait;
	public MainPage mainPage;
	
	@BeforeTest
	public void setUp(){
 
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability("deviceName", "Samsung Galaxy on8");
		capabilities.setCapability("os_version", "8.0.0");
		capabilities.setCapability("device_id", "j8y18lte");
		capabilities.setCapability("newCommandTimeout", 12000);
		capabilities.setCapability("appPackage", "com.bsb.hike");
		capabilities.setCapability("appActivity", "com.bsb.hike.ui.HomeActivity");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 30);
			mainPage=new MainPage(driver);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
//	@AfterTest
//	public void tearDown(){
//		driver.quit();
//	}
}
