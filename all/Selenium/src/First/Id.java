package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Id {
	public static void main(String[] args) throws InterruptedException
	{
//	WebDriver driver= new SafariDriver();
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials"); 
	
//	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	
//	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//	
//	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
//	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/form[1]/div[2]/input[1]")).sendKeys("Admin");
//	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
//	driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
//	driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
//	driver.findElement(By.xpath("//*[starts-with(@id,'txtUsername')]")).sendKeys("Admin");
//	driver.findElement(By.xpath("//input[starts-with(@id,'txtUsername')]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[starts-with(@id,'txtUsername')]")).sendKeys("Admin");
	
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).submit();
 
}
}
