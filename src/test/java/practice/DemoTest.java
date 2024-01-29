package practice;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups= "smoke" )
	public void m1() {
		System.out.println("print-1");
	}

	@Test
	public void m2() {
		System.out.println("print-2");
	}
	@Test(groups ={"smoke","Regression"})
	public void m3() {
		System.out.println("print-3");
		
		System.out.println("print-4");
		
		System.out.println("print-5");
	}

}
