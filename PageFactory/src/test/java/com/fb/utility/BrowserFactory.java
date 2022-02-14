package com.fb.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	
	
	public static WebDriver openBrowser(WebDriver driver,String url,String BrowserName)
	{
		
		Reporter.log("browser getting started log", true);

         if(BrowserName.equalsIgnoreCase("chrome"))
         {
        	 
     		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver.exe");
     		
        	 driver=new ChromeDriver();
     		
         }
         if(BrowserName.equalsIgnoreCase("firefox"))
         {
        	 
     		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
     		 driver=new FirefoxDriver();
     		
         }
         if(BrowserName.equalsIgnoreCase("IE"))
         {
        	 
     		System.setProperty("webdriver.chrome.driver", "./IEDriverServer.exe");
     		 driver=new InternetExplorerDriver();
     		
         }
         else
         {
        	 
        	 System.out.println("These browser not supported");
         }
         
         
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get(url);
			Reporter.log("browser  ready for use", true);

		 return driver;

	}
	
	
	public static void closeBrowser(WebDriver driver)
	{
		
		Reporter.log("browser  going to  close log", true);

		driver.quit();
		Reporter.log("browser    close log", true);

	}
}
