package com.fb.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.fb.utility.BrowserFactory;
import com.fb.utility.ConfigDataProvider;
import com.fb.utility.ExcelDataProvider;
import com.fb.utility.Helper;

public class Base {

	public WebDriver driver;
	public ConfigDataProvider config;
	public ExcelDataProvider excel;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setupSuite() {

		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./reports/" + Helper.currentDate() + ".html");

		report = new ExtentReports();
		report.attachReporter(extent);

	}
// commit by rupendra singh
	@BeforeClass
	public void setUp() {
		// driver=BrowserFactory.openBrowser(driver, "https://www.facebook.com/",
		// "firefox");
		driver = BrowserFactory.openBrowser(driver, config.getUrl(), config.getBrowser());

	}

	@AfterMethod()
	public void tearDownScreenshot(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.SUCCESS) {

			logger.pass("test case pass inside extent",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.getScreenshot(driver)).build());
		}

		else if (result.getStatus() == ITestResult.FAILURE) {

			// Helper.getScreenshot(driver);
			logger.fail("our test is failed",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.getScreenshot(driver)).build());

		}

		else if (result.getStatus() == ITestResult.SKIP) {

			logger.skip("test case passed with report",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.getScreenshot(driver)).build());
		}

		report.flush();
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.closeBrowser(driver);

	}

}
