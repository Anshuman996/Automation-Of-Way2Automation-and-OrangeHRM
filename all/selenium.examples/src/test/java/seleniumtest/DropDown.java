package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown {
	public WebDriver driver;
	@Test(priority=1)
	public void DropDown() throws InterruptedException{

		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Elements')]"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();


		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		Select UserRole=new Select(driver.findElement(By.xpath("/html[1]/body[1]/select[1]")));
		UserRole.selectByVisibleText("India");


	}
	@Test(priority=2)
	public void Drop() throws InterruptedException
	{
		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Elements')]"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Enter Country')]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.className("ui-button-text")).click(); 
        driver.findElement(By.xpath("//input[@class='custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input']")).clear();
        driver.findElement(By.xpath("//input[@class='custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input']")).sendKeys("India");

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
