package seleniumtest;

import org.testng.annotations.Test;
import java.util.List;
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

public class WidgetAutocomplete {
	public WebDriver driver;
	@Test(priority=1)
	public void AccordionDef() throws InterruptedException
	{
		String textToSelect = "JavaScript";

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

		driver.findElement(By.xpath("//a[contains(text(),'Autocomplete')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);

		
		WebElement element1 = driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']"));
		element1.sendKeys("ja");
		Thread.sleep(3000);
		element1.sendKeys(Keys.ARROW_DOWN,  Keys.ENTER);

	
		}
	@Test(priority=2)
	
		public void Multiple() throws InterruptedException {
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

				driver.findElement(By.xpath("//a[contains(text(),'Autocomplete')]")).click();
				driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
				int size = driver.findElements(By.tagName("iframe")).size();
				driver.switchTo().frame(1);
				
				WebElement element2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/input[1]"));
				element2.sendKeys("ja");
				Thread.sleep(3000);
				element2.sendKeys(Keys.ARROW_DOWN,  Keys.ENTER);
				
				WebElement element3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/input[1]"));
				element3.sendKeys("py");
				Thread.sleep(3000);
				element3.sendKeys(Keys.ARROW_DOWN,  Keys.ENTER);
				
				
				WebElement element4 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/input[1]"));
				element4.sendKeys("ru");
				Thread.sleep(3000);
				element4.sendKeys(Keys.ARROW_DOWN,  Keys.ENTER);


	}
	@Test(priority=3)
	
	public void Catagory() throws InterruptedException {
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

			driver.findElement(By.xpath("//a[contains(text(),'Autocomplete')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(2);
			
			WebElement element1 = driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']"));
			element1.sendKeys("an");
			Thread.sleep(3000);
			element1.sendKeys(Keys.ARROW_DOWN,  Keys.ENTER);
			
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