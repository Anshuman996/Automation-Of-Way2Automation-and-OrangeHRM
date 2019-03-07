package seleniumtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

public class New {
	public WebDriver driver;
	@Test
	public void main() {


		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		

		driver.findElement(By.id("btnLogin")).click();


		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		

		driver.findElement(By.id("welcome")).click(); 
        driver.findElement(By.linkText("Logout")).click();

	}
	@BeforeMethod
	public void beforeMethod() {

		

		driver = new ChromeDriver();

		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

	}

	@AfterMethod
	 public void afterMethod() {
		 
		  
		 
		      driver.quit();
		 
		  }
		 
		}


