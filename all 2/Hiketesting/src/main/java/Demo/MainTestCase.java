package Demo;

import org.testng.annotations.Test;

public class MainTestCase extends DriverSetUp
{
	@Test
	public void test(){
		mainPage.tap_group();
	}
}
