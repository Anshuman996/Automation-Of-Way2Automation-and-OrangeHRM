package com.testhike;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class Conversation extends Hike {
	@Test
	public void tap(){
//		driver.findElement(By.xpath("//android.widget.FrameLayout[@index=‘1’]")).click();
		List element = driver.findElements(By.className("android.widget.FrameLayout"));
		((WebElement) element.get(1)).click();
}
}