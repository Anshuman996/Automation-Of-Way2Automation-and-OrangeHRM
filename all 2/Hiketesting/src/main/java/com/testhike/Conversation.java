package com.testhike;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;


public class Conversation extends Hike {
	
	@Test
public void convo() {
//		driver.findElement(By.className("android.widget.FrameLayout"))
//		  .click();
		List<MobileElement> elementsTwo =driver.findElementsByClassName("android.widget.FrameLayout");
		System.out.println(elementsTwo.size());
		elementsTwo.get(0).click();

		
//		new TouchAction(driver).tap(point(221, 344)).perform();

//		driver.findElement(By.id("com.bsb.hike:id/msg_compose")).sendKeys("Hii");
//		driver.findElement(By.id("com.bsb.hike:id/attachment_view")).click();
	}

}
