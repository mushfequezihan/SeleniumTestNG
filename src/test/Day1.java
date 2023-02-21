package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Day1 {
	
	/*
	 * TestNG can run without java compiler main method
	 * to do that we need @Test annotation following by method 
	 * also to import annotation and TestNG library
	 * per @Test is a test case
	 * you can run multiple test case from a single class
	 */
	
	//we can include specific method in xml to run only
	@Test
	public void Demo() {
		System.out.println("Hello TestNG");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testCase2() {
		System.out.println("bye");
	}
	
	//after running all test cases in one test folder
	@AfterTest
	public void afterTest() {
		System.out.println("I will execute after all test cases is done in one module(Personal loan)");
	}
	
	//executing after all suite run
	@AfterSuite
	public void afterSuite() {
		System.out.println("I will execute at last from no 1");
	}

}
