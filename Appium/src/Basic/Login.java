package Basic;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login {

	AndroidDriver<MobileElement> driver;
	WebDriverWait wait;
	DesiredCapabilities capabilities = new DesiredCapabilities();

	/**
	 * This method is used to do set up before launching 
	 */
	@BeforeTest()
	public void setUp() {

		capabilities.setCapability("deviceName", "Samsung Galaxy on8");
		capabilities.setCapability("os_version", "8.0.0");
		capabilities.setCapability("device_id", "j8y18lte");
		capabilities.setCapability("newCommandTimeout", 12000);
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		capabilities.setCapability("fullReset", false);
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
	@Test(description = "This method verify addition of two number")
	public void verify_LoginToFlipKart() {
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).click();
				
		
			WebElement element = driver.findElement(By.id("com.google.android.gms:id/cancel"));
			if (element != null) {
				element.click();
			}
		
		
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).sendKeys("bokkatable.test@gmail.com");
		driver.findElement(By.id("com.flipkart.android:id/et_password")).clear();
				
		driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys("abcd");
				
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
	}
	
	/**
	 * Quits the driver after session ends
	 */
//	public void tearDown() {
////		
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		driver.quit();

//	}
	
	public static void main(String[] args) throws IOException {
		
		Login login = new Login();
		login.setUp();
		login.verify_LoginToFlipKart();
//		login.tearDown();
	}
}
