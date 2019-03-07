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

public class Droppeble {
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
			driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(0);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
			 Actions act=new Actions(driver);					
		      
		        		
		        act.dragAndDropBy(From,159, 46).build().perform();	
		       
			
	  }
	  @Test(priority=2)
	  public void accept() throws InterruptedException {
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
			driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(1);
			WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
			 Actions act=new Actions(driver);					
		      
		        		
		        act.dragAndDropBy(From,285, 28).build().perform();	
		        
		        WebElement From1=driver.findElement(By.xpath("/html[1]/body[1]/div[2]"));
				
			       act.dragAndDropBy(From1,162, 48).build().perform();	
		       
			
	  }
	  @Test(priority=3)
	  
	  public void prevent() throws InterruptedException {
			  driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
				driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
				driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
				driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

				//Mouse hover
				Thread.sleep(5000);
				WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
				Actions action = new Actions(driver);

				action.moveToElement(element).build().perform();
				driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Prevent propagation')]")).click();
				int size = driver.findElements(By.tagName("iframe")).size();
				driver.switchTo().frame(2);
				WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
				 Actions act=new Actions(driver);					
			      
			        		
			        act.dragAndDropBy(From,196, 71).build().perform();	
			        act.dragAndDropBy(From,170, 14).build().perform();	
			        act.dragAndDropBy(From,453, 84).build().perform();	
			        act.dragAndDropBy(From,457, 1).build().perform();	
			       
	  }
@Test(priority=4)
	  
	  public void revert() throws InterruptedException {
			  driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
				driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
				driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
				driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

				//Mouse hover
				Thread.sleep(5000);
				WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
				Actions action = new Actions(driver);

				action.moveToElement(element).build().perform();
				driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Revert draggable Position')]")).click();
				int size = driver.findElements(By.tagName("iframe")).size();
				driver.switchTo().frame(3);
				WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
				 Actions act=new Actions(driver);					
			      
			        		
			        act.dragAndDropBy(From,290, 50).build().perform();	
			        WebElement From1=driver.findElement(By.xpath("/html[1]/body[1]/div[2]"));
			        act.dragAndDropBy(From1,164, 50).build().perform();	
			        act.dragAndDropBy(From1,8, 6).build().perform();	
			        
			        	
			       
	  }


@Test(priority=5)

public void Demo() throws InterruptedException {
		  driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
			driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
			driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
			driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();

			//Mouse hover
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Interaction')]"));
			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Shopping cart demo')]")).click();
			int size = driver.findElements(By.tagName("iframe")).size();
			driver.switchTo().frame(4);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/h2[1]/span[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/h2[2]/span[1]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/h2[3]/span[1]")).click();
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

