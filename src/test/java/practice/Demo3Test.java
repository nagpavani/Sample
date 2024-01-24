package practice;

import org.testng.annotations.Test;

public class Demo3Test {
	@Test
	public void m4() {
		System.out.println("print-7");
	}

	@Test(groups="smoke")
	public void m5() {
		System.out.println("print-8");
	}
	@Test
	public void m6() {
		System.out.println("print-9");
	}


}
