package First;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Demo2 {
	

	public static void main(String[] args) throws InterruptedException
	{
	
	WebDriver driver= new SafariDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials"); 
//	driver.manage().window().maximize();
////	System.out.println(driver.getCurrentUrl());
//	
//	
////	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
////	
////	Thread.sleep(5000);
////	driver.findElement(By.xpath("//input[@name='txtUsername']")).clear();
////	
	driver.navigate().to("https://talent.capgemini.com/in");
	 
	Thread.sleep(5000);
	driver.navigate().back();
	driver.navigate().refresh();
	
}
}
