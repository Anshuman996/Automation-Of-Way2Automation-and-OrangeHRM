package First;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Links {
	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.calculator.net");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links in the Page is " + links.size());
		for (int i = 1; i <= links.size(); ++i) {
			System.out.println("Name of Link# " + i + "--" + links.get(i).getText());

}
		
	}
	
}
