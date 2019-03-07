package seleniumtest;

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

public class ToolsTips {
	public WebDriver driver;
	@Test(priority=1)
	public void Fun() throws InterruptedException
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
		driver.findElement(By.xpath("//a[contains(text(),'Tooltip')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		WebElement element1=driver.findElement(By.xpath("//input[@title='We ask for your age only for statistical purposes.']"));
		action.moveToElement(element1).build().perform();
}
	@Test(priority=2)
	public void Custom() throws InterruptedException
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
		driver.findElement(By.xpath("//a[contains(text(),'Tooltip')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'custom animation demo')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'custom animation demo')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(1);
	
		WebElement element1=driver.findElement(By.xpath("//a[@title='slide down on show']"));
		action.moveToElement(element1).build().perform();
		WebElement element2=driver.findElement(By.xpath("//a[@title='explode on hide']"));
		action.moveToElement(element2).build().perform();
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


