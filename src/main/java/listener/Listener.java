package listener;

import base.ScriptBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Listener extends ScriptBase implements ITestListener {

    public void onTestStart(ITestResult result) {
        //System.out.println("My Test Starting now");
        Reporter.log("Test  start: "+result.getMethod().getMethodName());

    }

    public void onTestSuccess(ITestResult result) {
        //System.out.println("My test successful ");
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat formater= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName= result.getName();
        if(result.isSuccess()){
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try {
                String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/successScreenshots";
                File destFile=new File((String)reportDirectory+"/"+methodName+"_"+formater.format(calendar.getTime())+".png");
                FileUtils.copyFile(srcFile,destFile);
                Reporter.log("<a href='"+destFile.getAbsolutePath()+"'> <image src='"+destFile.getAbsolutePath()+"'height='100' width'100'/> </a>");
            }catch (Exception e){

            }

        }
        Reporter.log("Test  success: "+result.getMethod().getMethodName());

    }

    public void onTestFailure(ITestResult result) {

        Calendar calendar=Calendar.getInstance();// This code for get date
        SimpleDateFormat formater= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");//this code for get date and month and time
        String methodName= result.getName();// This code for get test result
        if(result.getStatus()==ITestResult.FAILURE){
            File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//this code will take screenshot
            try {
                String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/failureScreenshots";
                File destFile=new File((String)reportDirectory+"/"+methodName+"_"+formater.format(calendar.getTime())+".png");//this code show where to save  screenshot
                FileUtils.copyFile(srcFile,destFile);// This code for copy screenshot
                Reporter.log("<a href='"+destFile.getAbsolutePath()+"'> <image src='"+destFile.getAbsolutePath()+"'height='100' width'100'/> </a>");
            }catch (Exception e){

            }

        }




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
