package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://www.tinyupload.com/");
		
//		WebElement element = driver.findElement(By.id("uploadfile_0"));
		
		WebElement element = driver.findElement(By.name("uploaded_file"));
		
		
		
		element.sendKeys("/Users/androiduser/Downloads/Drag_Drop.java");
		
		
		
//		 driver.findElement(By.name("send")).click();
		driver.findElement(By.xpath("//img[@src='images/button_upload.gif']")).click();
		
		
		
	}
}
