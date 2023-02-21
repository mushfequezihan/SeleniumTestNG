package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements testing listeners
//we need to specify listener path in xml file
public class Listeners implements ITestListener{

	//overriding unimplemented methods from ITestListener interface
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully passed listener code on test case pass");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot code
		//response code if API fails
		System.out.println("I successfully FAILED listener code on test case on method - " + result.getName());
	}
}
