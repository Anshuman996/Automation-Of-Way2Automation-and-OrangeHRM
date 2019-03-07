package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dynamic {
	public WebDriver driver;
	 @Test(priority=1)
  public void Dynamic() throws InterruptedException
	{
		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
		
		//Mouse hover
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Elements')]"));
		 
      Actions action = new Actions(driver);

      action.moveToElement(element).build().perform();

      driver.findElement(By.xpath("//a[contains(text(),'Submit Button Clicked')]")).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Starts With')]")).click();
      int size = driver.findElements(By.tagName("iframe")).size();
      System.out.print(size);
		driver.switchTo().frame(0);
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gvxagd");
      
      driver.findElement(By.xpath("//input[@value='submit']")).click();
	}
      @Test(priority=2)
      public void Dynamicnew() throws InterruptedException {
    //Login
    		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
    		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
    		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
    		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
    		
    		//Mouse hover
    		Thread.sleep(5000);
    		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Elements')]"));
    		 
          Actions action = new Actions(driver);

          action.moveToElement(element).build().perform();
          driver.findElement(By.xpath("//a[contains(text(),'Submit Button Clicked')]")).click();

     
      driver.findElement(By.xpath("//a[contains(text(),'Ends With')]")).click();
      driver.switchTo().frame(1);
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gvxagd");
      driver.findElement(By.xpath("//input[@id='1111']")).click();
      }
    	  
    	  
    	  
      
      @Test(priority=3)
      public void Dynamicnewt() throws InterruptedException {
    	//Login
  		driver.findElement(By.xpath("//a[contains(text(),'Signin')]")).click();
  		driver.findElement(By.xpath("//div[@id='login']//input[@name='username']")).sendKeys("Anshu996");
  		driver.findElement(By.xpath("//div[@id='login']//input[@name='password']")).sendKeys("Nitin@1996");
  		driver.findElement(By.xpath("//div[@id='login']//input[@value='Submit']")).click();
  		
  		//Mouse hover
  		Thread.sleep(5000);
  		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Elements')]"));
  		 
        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Submit Button Clicked')]")).click();
      
      driver.findElement(By.xpath("//a[contains(text(),'Complete id Dynamic')]")).click();
      driver.switchTo().frame(2);
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gvxagd");
      driver.findElement(By.xpath("//*[@name='submit')]")).click();
      
      
      
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