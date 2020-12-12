package listener;

import base.ScriptBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends ScriptBase implements ITestListener {

    public void onTestStart(ITestResult result) {
        //System.out.println("My Test Starting now");
        Reporter.log("Test  start: "+result.getMethod().getMethodName());

    }

    public void onTestSuccess(ITestResult result) {
        //System.out.println("My test successful ");
        Reporter.log("Test  success: "+result.getMethod().getMethodName());

    }

    public void onTestFailure(ITestResult result) {
        //System.out.println("My Test failed");
        Reporter.log("Test  Failed: "+result.getMethod().getMethodName());

    }

    public void onTestSkipped(ITestResult result) {
        //System.out.println("My Test Skipped");
        Reporter.log("Test  Skip: "+result.getMethod().getMethodName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {
        //System.out.println("Test Will start soon");
        Reporter.log("Test Starting soon ");
    }

    public void onFinish(ITestContext context) {

       // System.out.println("My test finish");
        Reporter.log("Test  Finish Properly  ");
    }

}
