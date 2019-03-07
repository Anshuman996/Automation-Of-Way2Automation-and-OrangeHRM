package seleniumtest;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Resizable {
	public WebDriver driver;
	  @Test(priority=1)
	  public void deffunctionality() throws InterruptedException {
		//Login
			driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
			driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
			driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
			driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

			//Mouse hover
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(0);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]"));
			

			Action resize = action.clickAndHold(From).moveByOffset(336, 396).release().build();

			resize.perform();
	  }
	  @Test(priority=2)
	  public void animate() throws InterruptedException {
		//Login
			driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
			driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
			driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
			driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

			//Mouse hover
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Animate')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(1);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]"));
			

			Action resize = action.clickAndHold(From).moveByOffset(336, 396).release().build();

			resize.perform();
	  }
	  @Test(priority=3)
	  public void Constrain() throws InterruptedException {
		//Login
			driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
			driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
			driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
			driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

			//Mouse hover
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Constrain resize area')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(2);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]"));
			

			Action resize = action.clickAndHold(From).moveByOffset(336, 396).release().build();

			resize.perform();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]")).isDisplayed();
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

