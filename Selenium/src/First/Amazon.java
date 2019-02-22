package First;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Amazon {

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		

		driver.findElement(By.className("a-dropdown-prompt")).click(); 
        driver.findElement(By.linkText("Price - High to Low")).click();
		
		if ( !driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[4]/span[1]/div/label/input")).isSelected() )
		{
		     driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[4]/span[1]/div/label/input")).click();
		     
		  
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'WOW Probiotics 20 Billion per Capsule 14 Probiotic')]"));
		builder.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			

}
}


