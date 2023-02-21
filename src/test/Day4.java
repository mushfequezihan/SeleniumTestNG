package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//managed in xml
public class Day4 {
	
	//Parameterized xml testNG -> suit level paremeter
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String urlLogin) {
		System.out.println("web login home");
		System.out.println(urlLogin);
	}

	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("mobile login home");
	}
	
	//grouping for smoke test 
	@Test(groups = {"smoke"})
	public void apiLoginHomeLoan() {
		System.out.println("rest API login home");
	}
}
