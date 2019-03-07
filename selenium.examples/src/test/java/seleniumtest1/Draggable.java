package seleniumtest1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Draggable {
	public WebDriver driver;
  @Test(priority=1)
  public void deffunctionality() throws InterruptedException {
	//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		//Mouse hover
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='draggable.php'][contains(text(),'Draggable')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		 Actions act=new Actions(driver);					
	      
	        		
	        act.dragAndDropBy(From,450, 198).build().perform();	
	       
		
  }
  @Test(priority=2)
  public void constrainmovement() throws InterruptedException {
	//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		//Mouse hover
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='draggable.php'][contains(text(),'Draggable')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Constrain movement')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(1);
		WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		 Actions act=new Actions(driver);					
	      
	        		
	        act.dragAndDropBy(From,8, 331).build().perform();
	        WebElement From1=driver.findElement(By.xpath("/html[1]/body[1]/div[2]"));
	        act.dragAndDropBy(From1,595, 59).build().perform();
	        
	        
	        WebElement From2=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]"));
	        act.dragAndDropBy(From2,117, 0).build().perform();
  }
  @Test(priority=3)
  public void cursor() throws InterruptedException {
	//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		//Mouse hover
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='draggable.php'][contains(text(),'Draggable')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Cursor style')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(2);
		WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		 Actions act=new Actions(driver);					
	      act.dragAndDropBy(From,193, 207).build().perform();
	        		
	        
	        WebElement From1=driver.findElement(By.xpath("/html[1]/body[1]/div[2]"));
	        act.dragAndDropBy(From1,628, 358).build().perform();
	        
	        
	        WebElement From2=driver.findElement(By.xpath("/html[1]/body[1]/div[3]"));
	        act.dragAndDropBy(From2,366, 197).build().perform();
  }
  
  
  @Test(priority=4)
  public void event() throws InterruptedException {
	//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		//Mouse hover
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='draggable.php'][contains(text(),'Draggable')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Events')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(3);
		WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		 Actions act=new Actions(driver);					
	      act.dragAndDropBy(From,584, 107).build().perform();
  }
  
  @Test(priority=5)
  public void draggable() throws InterruptedException {
	//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

		//Mouse hover
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[@href='draggable.php'][contains(text(),'Draggable')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Draggable + Sortable')]")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(4);
		WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]"));
		 Actions act=new Actions(driver);					
	      act.dragAndDropBy(From,10, 30).build().perform();
  }
@BeforeMethod
public void beforeMethod() {

	driver = new ChromeDriver();



	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	driver.get("http://way2automation.com/way2auto_jquery/index.php");
}

@AfterMethod
public void afterMethod() {

	driver.quit();
}

}

