package com.fb.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaicTestcase {

	
	@Test
	public void Auth() throws InterruptedException

	{
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("rupendras32@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("monu#452010");
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		//driver.quit();
	}
	
}
