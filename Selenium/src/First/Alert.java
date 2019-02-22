package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		//Simple Alert
//		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
//		org.openqa.selenium.Alert simpleAlert = driver.switchTo().alert();
//		simpleAlert.accept();
//		
		//Confirmation alert
//		driver.findElement(By.xpath("//*[@id='content']/p[8]/button")).click();
//		org.openqa.selenium.Alert confirmationAlert = driver.switchTo().alert();
//	    confirmationAlert.dismiss();
//		
		
		//Prompt alert
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[11]/button")).click();
		org.openqa.selenium.Alert promptAlert  = driver.switchTo().alert();
		 Thread.sleep(4000); 
		 promptAlert .sendKeys("Yes");
		 promptAlert.accept();
		 }
		
		

		
	}
