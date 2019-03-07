package seleniumtest1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Menu {

	public WebDriver driver;
	@Test(priority=1)
	public void Simple() throws InterruptedException
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
		driver.findElement(By.xpath("//a[@href='menu.php'][contains(text(),'Menu')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		driver.findElement(By.id("ui-id-2")).click();
		
		
}
	@Test(priority=2)
	public void Sub() throws InterruptedException
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
		driver.findElement(By.xpath("//a[@href='menu.php'][contains(text(),'Menu')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Menu With Sub Menu')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(1);
		WebElement element1 = driver.findElement(By.xpath("//li[contains(text(),'Adamsville')]"));

		action.moveToElement(element1).build().perform();
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
		
	}
	@Test(priority=3)
	public void select() throws InterruptedException
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
		driver.findElement(By.xpath("//a[@href='menu.php'][contains(text(),'Menu')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Select Menu')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//img[@src='../images/popup_pic.gif']")).click();
		Actions builder = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//img[@src='../images/popup_pic.gif']"));
		builder.contextClick(element1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			
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


