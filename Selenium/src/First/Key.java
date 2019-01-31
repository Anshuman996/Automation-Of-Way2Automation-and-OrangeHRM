package First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key {
	
	
	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://www.facebook.com/");
		
		
		Actions builder = new Actions(driver);
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT)
	
									.sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT)
	
		                              .sendKeys(txtUsername, "hello").perform();
}
}
