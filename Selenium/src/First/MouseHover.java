package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	
	public static void main(String[] args)  {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
	WebElement element = driver.findElement(By.linkText("Configure"));
	
	Actions action = new Actions(driver);
	 
    action.moveToElement(element).build().perform();
    
    driver.findElement(By.linkText("Leave Types")).click();
		
		
}
}
