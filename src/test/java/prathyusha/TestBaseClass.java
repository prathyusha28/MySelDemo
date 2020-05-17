package prathyusha;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import prathyushaBase.Base;

public class TestBaseClass extends Base{
	WebDriver driver;
	@Test
	
	public void TestBrowser(){
		driver.get("https:\\google.com");
	}









}


