package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;





public class Form {


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new SafariDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
//		List<WebElement>radiobtn=driver.findElements(By.name("sex"));
//		boolean chk=radiobtn.get(0).isSelected();
//		if(chk==false)
//			radiobtn.get(1).click();
		
//		
//     WebElement dropdwn=driver.findElement(By.id("continents"));
//     Select opt=new Select(dropdwn);
//     opt.selectByIndex(0);
//     
//     opt.selectByVisibleText("Asia");
//     opt.selectByVisibleText("Europe");
		
//		 WebElement textarea=driver.findElement(By.id("selenium_commands"));
//		 Select opt=new Select(textarea);
//	     opt.selectByVisibleText("Browser Commands");
//		 opt.selectByVisibleText("Navigation Commands");
		driver.findElement(By.xpath("//*[@name='sex' and @id='sex-0']")).click();
		driver.findElement(By.xpath("//*[@name='exp' and @id='exp-2']")).click();
		
	}

}
