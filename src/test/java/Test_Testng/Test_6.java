package Test_Testng;

import org.testng.annotations.Test;

public class Test_6 {
	
	@Test(groups="Sanity")
	public void m1() {
	System.out.println("Test m1");	
	}
	
	@Test(groups="Regression")
	public void m2() {
		System.out.println("Test m2");
	}
	
	@Test
	public void m3() {
		System.out.println("Test m3");
	}
	
	

}
