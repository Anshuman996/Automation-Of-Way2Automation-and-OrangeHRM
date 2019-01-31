package First;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class rightClick {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	
	Actions builder = new Actions(driver);
//	WebElement element = driver.findElement(By.id("menu_admin_viewAdminModule"));
//	builder.contextClick(element).perform();
	
	
	WebElement element = driver.findElement(By.id("menu_admin_viewAdminModule"));
	builder.click(element).perform();
	}
	}
