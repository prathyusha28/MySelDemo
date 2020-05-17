package prathyusha;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTestTwo {

	

	@Test(priority=1)
	public void TestLoginTwo(){
		System.out.println("The Login Test ");
	}
	
	@Test(priority=2)
	public void EnterInfoTwo(){
		System.out.println("Enter Info Test  ");
	}
	
	@Test(priority=3)
	public void LogoutTwo(){
		//System.out.println("Logged out ");
		Assert.assertEquals(false, true);
		
		System.out.println("Logged Out Test Passed");
	}
	
	
}
