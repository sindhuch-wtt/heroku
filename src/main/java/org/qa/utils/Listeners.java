package org.qa.utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseTest implements ITestListener{

	ExtentTest test;
	ExtentReports exrep= ExtentReporterNG.getReportObject();
	@Override
	public void onTestStart(ITestResult result) 
	{
		test= exrep.createTest(result.getMethod().getMethodName());

		System.out.println("On Test Start");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
		System.out.println("On Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
		test.fail(result.getThrowable());
		try {
		String filepath= getScreenshot(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
 
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Failed But Within Success Percentage started");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Test Failed With Timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
		exrep.flush();
	}

}
