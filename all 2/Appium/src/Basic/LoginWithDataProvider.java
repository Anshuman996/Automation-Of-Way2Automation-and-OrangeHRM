package Basic;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginWithDataProvider {
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;
	DesiredCapabilities capabilities = new DesiredCapabilities();

	/**
	 * This method is used to do set up before launching 
	 */
	@BeforeTest
	public void setUp() {

		capabilities.setCapability("deviceName", "Samsung Galaxy on8");
		capabilities.setCapability("os_version", "8.0.0");
		capabilities.setCapability("device_id", "j8y18lte");
		capabilities.setCapability("newCommandTimeout", 12000);
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
//		capabilities.setCapability("fullReset", false);
//		capabilities.setCapability("noReset", false);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 30);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This test case verify login to flipkart
	 */
	@Test(dataProvider = "Authentication")
	public void verify_LoginToFlipKart(String sUsername, String sPassword) {
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).click();
				
		
			WebElement element =driver.findElement(By.id("com.google.android.gms:id/cancel"));
			if (element != null) {
				element.click();
			}
		
		
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).sendKeys(sUsername);
		driver.findElement(By.id("com.flipkart.android:id/et_password")).clear();
		driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys(sPassword);
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
	}
	
	/**
	 * Quits the driver after session ends
	 */
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
	

	  @DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@1234" }};
	 
	  }
	 
}
