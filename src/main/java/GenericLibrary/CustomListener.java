package GenericLibrary;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test has started",true);
		
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test passed successfully",true);
		
	}

	public void onTestFailure(ITestResult result) 
	{
		String name=result.getMethod().getMethodName();
		DriverUtility d=new DriverUtility();
		try {
			d.ssMethod(BaseTest.driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Screenshot has been taken successfully",true);
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped successfully",true);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		int time = result.SUCCESS_PERCENTAGE_FAILURE;
		System.out.println(time);
		
	}

	public void onStart(ITestContext context) {
		Reporter.log("Test started",true);
		
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Test finished",true);
		
	}

}
