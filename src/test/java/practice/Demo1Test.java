package practice;

import org.testng.annotations.Test;

public class Demo1Test {
	@Test(groups="regression")
	public void m4() {
		System.out.println("print-4");
	}

	@Test(groups= "smoke")
	public void m5() {
		System.out.println("print-5");
	}
	@Test
	public void m6() {
		System.out.println("print-6");
	}


}
