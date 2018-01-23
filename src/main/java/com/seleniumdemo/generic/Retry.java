package com.seleniumdemo.generic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int retrycount = 0;
	private int maxretrycount = 1;

	public boolean retry(ITestResult result) {
		if (retrycount < maxretrycount) {
			System.out.println("Retrying Test" + result.getName() + "with status" + getStatusMessage(result.getStatus())
					+ "for the" + (retrycount + 1) + "time(s).");
			retrycount++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public String getStatusMessage(int status) {
		String resultname = null;
		if (status == 1)
			resultname = "SUCCESS";
		if (status == 2)
			resultname = "failed";
		if (status == 3)
			resultname = "skiped";
		return resultname;

	}

}
