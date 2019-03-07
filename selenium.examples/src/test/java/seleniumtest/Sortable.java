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

public class Sortable {
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
			driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(0);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]"));
			Actions act=new Actions(driver);					
		      act.dragAndDropBy(From,9, 46).build().perform();
	  }
	  @Test(priority=2)
	  public void connectlist() throws InterruptedException {
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
			driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Connect Lists')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(1);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]"));
			Actions act=new Actions(driver);					
		      act.dragAndDropBy(From,161, 89).build().perform();
	  }
	  
	  @Test(priority=3)
	  public void displaygrid() throws InterruptedException {
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
			driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Display as grid')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(2);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]"));
			Actions act=new Actions(driver);					
		      act.dragAndDropBy(From,5, 110).build().perform();
	  }
	  
	  @Test(priority=4)
	  public void Portlets() throws InterruptedException {
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
			driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Portlets')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(3);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]"));
			Actions act=new Actions(driver);					
		      act.dragAndDropBy(From,12, 201).build().perform();
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

