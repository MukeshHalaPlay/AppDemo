package demoPac;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void afterTest() {
		System.out.println("After every Test Execution");
	}
	
	@Test
	public void Demo1() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Execution");
	}
	
	@Test
	public void Demo2() {
		System.out.println("Bye");
	}
}
