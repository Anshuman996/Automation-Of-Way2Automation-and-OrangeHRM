package seleniumtest;

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
		WebElement autoOptions= driver.findElement(By.xpath("//input[@class='ui-autocomplete-input']"));
		autoOptions.sendKeys("ja");

		List<WebElement> optionsToSelect = driver.findElements(By.xpath("//li[@id='ui-id-16']"));

		for(WebElement option : optionsToSelect){
		    System.out.println(option);
		    if(option.getText().equals(textToSelect)) {
		        System.out.println("Trying to select: "+textToSelect);
		        option.click();
		        break;
		    }
		}
		    
		
		
	}
	
	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();



		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("http://way2automation.com/way2auto_jquery/index.php");
	}

	@AfterMethod
	public void afterMethod() {

//		driver.quit();
	}

}