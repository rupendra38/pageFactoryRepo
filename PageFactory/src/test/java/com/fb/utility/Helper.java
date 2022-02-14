package com.fb.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.mongodb.MapReduceCommand.OutputType;

public class Helper {

	
	public static String getScreenshot(WebDriver driver)
	{
		Reporter.log("screenshot going to setup log", true);

		
		
		File file=((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		String currentPath=System.getProperty("user.dir")+"/screenshot/"+currentDate()+".jpg";
		try {
			//FileUtils.copyFile(file, new File("./screenshot/"+currentDate()+".jpg"));
			FileUtils.copyFile(file, new File(currentPath));

		} catch (IOException e) {
			// TODO Auto-generated catch block
		System.out.println("unable to save screenShot"+e.getMessage());
		}
		
		
		System.out.println("-------------------- current scrrenShot path"+currentPath);
	
		Reporter.log("screen shot configured log", true);

		return currentPath;
		
	}
	
	
	
	
	public static String currentDate()
	{
		Reporter.log("getting ready current time log", true);

		SimpleDateFormat currentFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date=new Date();
		
		
		Reporter.log("current time ready  log", true);

	return	currentFormat.format(date);
		
	}
	
	public void handleWindow()
	{
		
		
		
		
	}
	
	
	
	public void handleAlert()
	{
		
		
		
		
	}
	
	
	public void handleFrame()
	{
		
		
		
		
	}
}
