package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "/Users/androiduser/Documents/selenium-java-3.141.59/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials"); 
	
//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	
//	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//	
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

}
}
