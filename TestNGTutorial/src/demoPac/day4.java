package demoPac;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void WebLogInHomeLoan(String uriname) {
		System.out.println("WebLogIn Home Loan");
		System.out.println(uriname);
	}
	
	@Test(groups = {"Smoke"})
	public void MobileLogInHomeLoan() {
		System.out.println("Mobile Login Home Loan");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(" After Class Execution");
	}
	
	@Test
	public void ApiLogInHomeLoan() {
		System.out.println("Api Login Home loan");
	}
}
