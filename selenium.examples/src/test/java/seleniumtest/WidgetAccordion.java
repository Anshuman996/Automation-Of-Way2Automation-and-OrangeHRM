package seleniumtest;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class WidgetAccordion {

	public WebDriver driver;
	@Test(priority=1)
	public void AccordionDef() throws InterruptedException
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

		driver.findElement(By.xpath("//a[contains(text(),'Accordion')]")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[4]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[3]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[1]")).click();
		
		
	}
	@Test(priority=2)
	public void AccordionCus() throws InterruptedException
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

		driver.findElement(By.xpath("//a[contains(text(),'Accordion')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Customize icons')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[4]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[3]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[2]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[1]/span[1]")).click();
		//Toggle Icon
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[4]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[3]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[1]")).click();
		
	}
	@Test(priority=3)
	public void AccordionFill() throws InterruptedException
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

		driver.findElement(By.xpath("//a[contains(text(),'Accordion')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Fill Space')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/h3[4]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/h3[3]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/h3[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/h3[1]")).click();
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