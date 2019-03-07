package seleniumtest1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePicker {
	
		public WebDriver driver;
		@Test(priority=1)
		public void Date() throws InterruptedException
		{
			

			//Login
			driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
			driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
			driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
			driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

			//Mouse hover
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Widget')]"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(0);
			
			
			driver.findElement(By.id("datepicker")).click();
			driver.findElement(By.xpath("//tbody//tr[2]//td[3]//a[1]")).click();

}
		@Test(priority=2)
		public void animation() throws InterruptedException
		{
			

			//Login
			driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
			driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
			driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
			driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

			//Mouse hover
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Widget')]"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Animations')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(1);
			
			
			driver.findElement(By.id("datepicker")).click();
			driver.findElement(By.xpath("//tbody//tr[2]//td[3]//a[1]")).click();

}
		@BeforeMethod
		public void beforeMethod() {

			driver = new ChromeDriver();



			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


			driver.get("http://way2automation.com/way2auto_jquery/index.php");
		}

		@AfterMethod
		public void afterMethod() {

			driver.quit();
		}

	}

