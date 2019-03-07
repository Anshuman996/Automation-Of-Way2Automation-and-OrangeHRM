package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Window {
	public WebDriver driver;
  @Test(priority=1)
  public void New() throws InterruptedException {

		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'New Browser Tab')]")).click();
		
	  
  }
  @Test(priority=2)
  public void Newseperate() throws InterruptedException {

		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Open Seprate New Window')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seprate Window')]")).click();
		
	  
  }
  @Test(priority=3)
  public void NewFrame() throws InterruptedException {

		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Frameset')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[contains(text(),'Open Frameset Window')]")).click();
		
	  
  }
  @Test(priority=3)
  public void NewMul() throws InterruptedException {

		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Open Multiple Windows')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//a[contains(text(),'Open multiple pages')]")).click();
		
	  
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

