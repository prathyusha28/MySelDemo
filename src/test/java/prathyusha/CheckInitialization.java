package prathyusha;

import org.openqa.selenium.WebDriver;

import prathyushaBase.Base;

public class CheckInitialization extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		Base.intialization();
		
		driver.get("http://www.cheapoair.com");
	}

}
