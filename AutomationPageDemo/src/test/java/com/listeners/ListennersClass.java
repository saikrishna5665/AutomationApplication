package com.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.automationbase;

public class ListennersClass extends automationbase  implements ITestListener {
	

	
	   
	    @Override
	public void onTestStart(ITestResult result) {
		System.out.println("Welcome to on test");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

		@Override
	public void onTestFailure(ITestResult result) {
	    	screenshot(result.getName());
	}

		public static void screenshot(String screenname) {
	    	TakesScreenshot ts=(TakesScreenshot)drive;
	    	File source=ts.getScreenshotAs(OutputType.FILE);
	    	File target=new File("ABC",screenname+".png");
	    	try {
				FileUtils.copyFile(source, target);  
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    }
}