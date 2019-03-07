package seleniumtest;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Slider {
	public WebDriver driver;
	@Test
	public void slide() throws InterruptedException
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
		driver.findElement(By.xpath("//a[contains(text(),'Slider')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		slider.sendKeys(Keys.ARROW_RIGHT);
		slider.sendKeys(Keys.ARROW_RIGHT);
		slider.sendKeys(Keys.ARROW_RIGHT);
		slider.sendKeys(Keys.ARROW_LEFT);


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


