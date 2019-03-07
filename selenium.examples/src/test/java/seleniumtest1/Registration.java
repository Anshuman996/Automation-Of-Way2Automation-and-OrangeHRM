package seleniumtest1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class Registration {

	public WebDriver driver;


	//	@Test(priority=1)
	//	public void signup()
	//	{
//			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Nitin Dash");
//			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8018594363");
//			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anshu@gmail.com");
//			Select dropdwn=new Select(driver.findElement(By.xpath("//select[@name='country']")));
//			dropdwn.selectByVisibleText("India");
//			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("banglore");
//			driver.findElement(By.xpath("//div[@id='load_box']//input[@name='username']")).sendKeys("Nitin996");
//			driver.findElement(By.xpath("//div[@id='load_box']//input[@name='password']")).sendKeys("Nitin@1996");
//			driver.findElement(By.xpath("//div[@id='load_box']//input[@value='Submit']")).click();	
//	
//		}
	@Test
	public void login() throws InterruptedException {
		//Login 
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		Thread.sleep(5000);
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Anshuman");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/p[2]/input[1]")).sendKeys("Dash");
		if ( !driver.findElement(By.xpath("//label[contains(text(),'Single')]//input[@name='m_status']")).isSelected() )
		{
			driver.findElement(By.xpath("//label[contains(text(),'Single')]//input[@name='m_status']")).click();
		}

		if ( !driver.findElement(By.xpath("//label[contains(text(),'Cricket')]//input[@name='hobby']")).isSelected() )
		{
			driver.findElement(By.xpath("//label[contains(text(),'Cricket')]//input[@name='hobby']")).click();
		}
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8017626277");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		element.sendKeys("/Users/androiduser/Downloads/Drag_Drop.java");
		driver.findElement(By.xpath("//textarea[@rows='5']")).sendKeys("isvsafbakgbgjbfjwgjwbgfjgwfjbw bnfkhfkhfbgfgwfbkgg");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@12345567");
		driver.findElement(By.xpath("//input[@name='c_password']")).sendKeys("abc@12345567");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
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



