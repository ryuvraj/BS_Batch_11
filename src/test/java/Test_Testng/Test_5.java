package Test_Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_5 {
	
	@Test(priority=1,invocationCount=2)
	public void A() {
		System.out.println("A Test");
	}
	
	@Test(priority=-1)
	public void Z() {
		System.out.println("Z Test");
	}
	
	@Test(priority=0)
	public void G() {
		System.out.println("G Test");
	}
	
	@Test(priority=0)
	public void S() {
		System.out.println("S Test");
		Assert.assertTrue(false);
	}
	
	@Test
	public void R() {
		System.out.println("R Test");
	}


}
