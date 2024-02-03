package org.qa.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	public static ExtentReports getReportObject()
	{
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter spark= new ExtentSparkReporter(path);
		spark.config().setReportName("WebTestResults");
		spark.config().setDocumentTitle("TestResult");
		
		ExtentReports exrep= new ExtentReports();
		exrep.attachReporter(spark);
		exrep.setSystemInfo("Tester", "Sindu Chittibothula");
		return exrep;

		
	}

}
