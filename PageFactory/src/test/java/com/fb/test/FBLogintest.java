package com.fb.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fb.pages.Base;
import com.fb.pages.LoginPage;
import com.fb.utility.BrowserFactory;
import com.fb.utility.ExcelDataProvider;

public class FBLogintest extends Base {

	@Test
	public void loginApp()
	{
	Reporter.log("Fblogin test getting started log", true);
		
		logger=report.createTest("application started");
	
		LoginPage login= PageFactory.initElements(driver,LoginPage.class);
		
		logger.info("application started");
     	//Assert.assertEquals(false, true);

	//	login.loginTofb("rupendas32@gmail.com", "monu#452010");
	     login.loginTofb(excel.getStringData("login", 0, 0),excel.getStringData("login", 0, 1));
	    logger.info("application close");

	    logger.pass("login done successfully ");
	    
		Reporter.log("Fblogin test ended log", true);

	
	}

	
	
	@Test
	public void run()
	{
		
		Reporter.log("run test getting started log", true);

	logger=	report.createTest("second test for tesing");
		
	logger.info("second test started");
 	Assert.assertEquals(false, true);
	
	logger.info("test status after assertion");
	logger.fail("test is fail");
		
	Reporter.log("Fblogin test ended log", true);

	}
}
