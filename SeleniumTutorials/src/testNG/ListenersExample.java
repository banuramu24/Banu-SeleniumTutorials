//VIDEO 12: Listeners in testNG
//suite,test and method listeners are the types. here we will see test listeners.
//to use test listener use implements itest.
//ITestListener is an interface which has methods regarding testcase status.
//what kind of methods? what happens if a test case if failed,skipped,passed,etc..
//So after adding implements we get some error in ListenersExample in redline.
//if we keep cursor there we get add unimplemented methods. just give that!!!!!!
//after giving error will go.here we can see so many methods where ITestListener has!!!!!!
//we wre going to override those methods thats why we @Override by default.
//Listeners la iruka ellaaa methods eh namma engayumey call pannaporadhu kidayadhu...
//nammaloda [test execution-means take sampletestcase.java] eh base panni idhuvey[methods eh] thaanaa call aykum.
//So goto xml now and add..
/*<listeners>
<listener class-name="testNG.ListenersExample"></listener>
</listeners>*/
//Listeners Benefits?? Though we do not call explicitly,It will help us to give the status
//on test case b4 status,after status..etc
//Triggering actions based on the result is achieved by Listeners only.
//Performs some actions based on test case execution's output.

//So finally what is testNG??
//It's all about solving the real life problems,either in manual execution/business requirements
//to solve complex criteria's/requirements testNG frameworks are widely used.
package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is going to execute");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("OnStart Executes First!!!Before Everything!!!");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("OnFinish Executes Last!!!After Everything!!!");
		
	}

}
