package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//managed in xml
//you can module the test cases based on functionality and trigger them accordingly
public class Day3 {
	
	/*
	 * @Before/AfterClass @Before/AfterMethod is in class level
	 * @Before/AfterTest @Before/AfterSuite is in xml level
	 */
	
	//executing before all method in the class
	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing all method in Day 3 class");
	}
	
	//executing after all method in the class
	@AfterClass
	public void afterClass() {
		System.out.println("after executing all method in Day 3 class");
	}
	
	//grouping for smoke test 
	//test case/folder level parameter from xml (global variable)
	@Parameters({"URL","APIkey/password"})
	@Test(groups = {"smoke"})
	public void webLoginCarLoan(String s, String pass) {
		System.out.println("web login car");
		System.out.println(s);
		System.out.println(pass);
	}

	// you can control specific method not to run with exclude tag in xml
	//to avoid any test case from execution
	@Test(enabled = false)
	public void mobileLoginCarLoan() {
		System.out.println("mobile login car");
	}
	
	//grouping for smoke test 
	@Test(groups = {"smoke"})
	public void mobileSignIn() {
		System.out.println("mobile sign in car");
	}
	
	//timeout error if any issues before failing test case
	//passing value from data provider
	@Test(timeOut = 4000, dataProvider = "getData")
	public void mobileSignOutCarLoan(String username, String password) {
		System.out.println("mobile sign out car");
		System.out.println(username);
		System.out.println(password);
	}
	
	//dependency method annotation
	@Test(dependsOnMethods = {"webLoginCarLoan","mobileSignOut"})
	public void apiLoginCarLoan() {
		System.out.println("rest API login car");
	}
	
	//executing before all test suit 
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("im the no 1");
	}
	
	//before method runs before every method and only specific to class
	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" i will run before all method in Day 3 class");
	}
	
	//after method runs after every method and only specific to class
	@AfterMethod
	public void afterMethod() {
		System.out.println(" i will run after all method in Day 3 class");
	}
	
	/*
	 * parameterized data set to run test method multiple times mobileSignoutCarloan()
	 * 1st combination - username, password with good credit
	 * 2nd - user, pass with no credit
	 * 3rd with fraud
	 * 
	 */
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		//1st data - columns in the rows are values
		data[0][0] = "firstuserCredit";
		data[0][1] = "firstpassCredit";
		
		//2nd
		data[1][0] = "2ndtuserNoCredit";
		data[1][1] = "2ndpassNoCredit";
		
		//3rd
		data[2][0] = "3rduserFraud";
		data[2][1] = "3rdpassFraud";
		
		return data;
	}
}
