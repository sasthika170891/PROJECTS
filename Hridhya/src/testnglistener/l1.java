package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class l1 implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test is sucess ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failure");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("finished");
	}
	
	//ITestListener :  onstart, on fnsih, ontestsucess, ontestfailed
	// current class<=> itestlisterner
	// class<=> interface=> class defintion:  implements imterfacename 
     // rightclick=> source=> add unim
}
