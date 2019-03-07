package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImg {
 
	
	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");		
		driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).click();

		
}
}