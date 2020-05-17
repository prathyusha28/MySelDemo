package prathyusha;

import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(prathyusha.ListenerDemo.class)

public class TestNGListenerTest {

	
		@Test(priority=1)
		public void TestLogin(){
			System.out.println("The Login Test ");
		}
		
		@Test(priority=2)
		public void EnterInfo(){
			System.out.println("Enter Info Test  ");
		}
		
		@Test(priority=3)
		public void Logout(){
			//System.out.println("Logged out ");
			Assert.assertEquals(false, true);
			
			System.out.println("Logged Out Test Passed");
		}
		
		
}
