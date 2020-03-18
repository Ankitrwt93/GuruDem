package Acti.Utilities;


import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

import Acti.Testcases.BaseClass;

public class MyTestNgListeners implements ITestListener

{
	public static int passcount,executioncount,failcount,skipcount=0;
	public int StartMinute, EndMinute=0;
	
	@Override
	public void onStart(ITestContext Context) 
	{
		Reporter.log("Suite execution starts: "+new Date(),true);
	StartMinute=LocalTime.now().getMinute();
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log(result.getName()+" Script execution starts: "+new Date(),true);
		executioncount++;
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log(result.getName()+"Script passed:"+new Date(),true);
		passcount++;
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
	Reporter.log(result.getName()+"script failed: "+new Date(),true);
	failcount++;
	
	TakesScreenshot ts=(TakesScreenshot) BaseClass.driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	File dstfile = new File("C:\\Users\\anks\\Gurudem\\Screenshots\\"+result.getName()+".png");
	try {
		Files.copy(srcfile, dstfile);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	Reporter.log("screenshot has been taken", true);
	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log(result.getName()+"Script skipped: "+new Date(),true);
	skipcount++;
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		Reporter.log(result.getName()+"Script failed but is within success percentage: "+new Date(),true);
	}
	
	@Override
	public void onFinish(ITestContext Context) 
	{
		EndMinute=LocalTime.now().getMinute();
		Reporter.log("suite execution ended: "+new Date(),true);
		int Totalminutes=EndMinute-StartMinute;
		Reporter.log("total suite execution time: "+Totalminutes+"mins",true);
		
		Reporter.log("Total script executed: "+executioncount,true);
		Reporter.log("Total script passed: "+passcount,true);
		Reporter.log("Total script failed: "+failcount,true);
		Reporter.log("Total script skipped: "+skipcount,true);
		
		
		
		
	}

	
	

}
