package prathyusha;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("The Test has started:  " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The Test ran successfully:  " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The Test has failed" + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The Test has Skipped" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The Test has successpercentage" + result.getName());
	}

	public void onStart(ITestContext context) {
		//System.out.println("The Test has start" + result.getTestName());
	}

	public void onFinish(ITestContext context) {
		//System.out.println("The Test has finished" + result.getTestName());
	}

}
