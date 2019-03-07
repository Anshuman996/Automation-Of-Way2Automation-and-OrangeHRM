package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;


 
public class Login {
public static void main(String[] args) throws InterruptedException
{
//	WebDriver driver= new ChromeDriver();
	WebDriver driver= new SafariDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	
  driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();



	driver.findElement(By.xpath("//b[contains(text(),'Directory')]")).click();
	
	
	driver.findElement(By.xpath("//b[contains(text(),'Maintenance')]")).click();
	
	
	driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();
	
	
	driver.findElement(By.xpath("//b[contains(text(),'Time')]")).click();
	
	
	driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click(); 
	
	
	driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
	
	
	
    driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
	
//	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ram");
//	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
//	//driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("0024");
//	driver.findElement(By.xpath("//input[@id='btnSave']")).click();  
//	
//	driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
	
//	driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Ram kumar");
//	
//	driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("0033");
//	
//	
//	driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	
	
//	if ( !driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_34']")).isSelected() )
//	{
//	     driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_34']")).click();
//	}
//	
//	driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
//	driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
//	
	driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
//	
	//driver.findElement(By.xpath("//a[contains(text(),'0001')]")).click();
	
      

    driver.findElement(By.xpath("//input[@name='searchSystemUser[userName]']")).sendKeys("john.smith");
    
    
	Select UserRole=new Select(driver.findElement(By.xpath("//select[@name='searchSystemUser[userType]']")));
	UserRole.selectByVisibleText("ESS");
	
	driver.findElement(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")).sendKeys("John Smith");
	
	driver.findElement(By.xpath("//li[@class='ac_even ac_over']")).click();
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	
	if ( !driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_4']")).isSelected() )
	{
	     driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_4']")).click();
	}
//    driver.findElement(By.xpath("//input[@id='btnAdd'] ")).click();
//    
//	driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Fiona Grace");
//	
//	driver.findElement(By.xpath("//input[@id='systemUser_userName']")).sendKeys("test.2");
//	Select Status=new Select(driver.findElement(By.xpath("//select[@name='systemUser[status]']")));
//	Status.selectByVisibleText("Disable");
//	
//	driver.findElement(By.xpath("//input[@id='systemUser_password']")).sendKeys("AnshuNitin19040");
//	
//	driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("AnshuNitin19040");
//	
//	Thread.sleep(5000);
//	
//	driver.findElement(By.xpath("//input[@id='btnSave']")).click();  
//	
	driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	if ( !driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_27']")).isSelected() )
	{
	     driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_27']")).click();
	}
	
	if ( !driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_26']")).isSelected() )
	{
	     driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_26']")).click();
	}
	
	
	 driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
	 
	 driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
}
}
