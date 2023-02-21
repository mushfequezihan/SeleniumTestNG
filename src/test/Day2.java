package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	//Test Suit -> Test Folder(module) -> Test cases (classes)
	//grouping for smoke test 
	//testcase level parameter
	@Parameters({"URL"})
	@Test(groups = {"smoke"})
	public void pLoan(String url) {
		System.out.println("good");
		System.out.println(url);
	}

	//before executing test cases if anything needs to be done
	@BeforeTest
	public void beforeTest() {
		System.out.println("I will execute first");
	}
	
}
