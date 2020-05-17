package prathyusha;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import prathyushaBase.Base;

public class TestngTesting extends Base {
	
	WebDriver driver;
	@Test
	public void LoginTest() {
		System.out.println("My Login Successful");
		driver.get("http://www.cheapoair.com");
	}
	
	
	@Test
	
	public void LoansDept() {
		System.out.println("My Bank Loans");
	}
	
	@Test
	
	public void CarLoans() {
		System.out.println("My Car Loans");
		
		
	}
	
	
	@Test

	public void HomeLoans() {
	System.out.println("My Home Loans");
	}

}
