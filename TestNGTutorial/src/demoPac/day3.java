package demoPac;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" Before Class Execution");
	}
	
	@Parameters({"URL", "APIKey"})
	@Test
	public void WebLogInCarLoan(String urlName, String key) {
		System.out.println(urlName);
		System.out.println("WebLogIn Car Loan");
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" Before each Method Execution of this class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" After each Method Execution of this class");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileLogInCarLoan() {
		System.out.println("Mobile LOGIN");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" Before Suite Execution");
	}
	
	@Test(enabled=false)
	public void MobileSignInCarLoan() {
		System.out.println("Mobile SIGNIN");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignOutCarLoan(String uname,String passwrd) {
		System.out.println("Mobile SIGNOUT");
		System.out.println(uname);
		System.out.println(passwrd);
	}
	
	@Test(dependsOnMethods= {"WebLogInCarLoan","MobileLogInCarLoan"})
	public void ApiLogInCarLoan() {
		System.out.println("Api Login Car loan");
	}
	@DataProvider
	public Object[][] getData() {
		//combinations of key value of dataset
		//1st-username password(good credit history)
		//2nd-username password(No credit History)
		//3rd-username password(Fraudelent credit history)
		Object[][] data = new Object[3][2];
		//1st Data
		data[0][0]="1st UserName";
		data[0][1]="1st Password";
		//2nd Data
		data[1][0]="2nd UserName";
		data[1][1]="2nd Password";
		//3rd Data
		data[2][0]="3rd UserName";
		data[2][1]="3rd Password";
		return data;
	}
}
