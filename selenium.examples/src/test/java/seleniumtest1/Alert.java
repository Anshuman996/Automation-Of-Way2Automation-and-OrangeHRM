package seleniumtest1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert {
	public WebDriver driver;
	@Test(priority=1)
	public void alert() throws InterruptedException {

		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		//Alert
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Simple Alert')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

		org.openqa.selenium.Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}
		@Test(priority=2)
		public void newalert() throws InterruptedException {
			//Login
			driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
			driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
			driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
			driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Input Alert')]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		driver.switchTo().alert().sendKeys("Anshu");
		driver.switchTo().alert().accept();


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

