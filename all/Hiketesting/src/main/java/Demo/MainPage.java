package Demo;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MainPage {

	public AndroidDriver<MobileElement> driver;
	
	@FindBy(id="com.bsb.hike:id/conversation_item")
	MobileElement testing_group;
	
	public MainPage(AndroidDriver<MobileElement> driver){
		this.driver=driver;
		PageFactory.initElements(driver, MainTestCase.class);
	}
	
	public void tap_group(){
		if(testing_group!=null)
			testing_group.click();
	}
}
