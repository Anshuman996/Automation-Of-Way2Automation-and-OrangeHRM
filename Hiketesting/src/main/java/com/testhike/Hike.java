package com.testhike;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.driver.DriverHike;

public class Hike extends DriverHike {

	@Test
	public void hike_login() {
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("com.bsb.hike:id/btn_accept")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("com.bsb.hike:id/phone_number")).sendKeys("9040808413");
		driver.findElement(By.id("com.bsb.hike:id/validate_btn")).click();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.findElement(By.id("com.bsb.hike:id/menu_skip")).click();
		driver.findElement(By.id("com.bsb.hike:id/btn_positive")).click();
		driver.findElement(By.id("com.bsb.hike:id/btn_positive")).click();
}
}