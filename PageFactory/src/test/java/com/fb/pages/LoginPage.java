package com.fb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;

	}

	@FindBy(id="email") WebElement username;

	@FindBy(id="pass")	WebElement userpass;

	@FindBy(name="login") WebElement userlogin;

	public void loginTofb(String uname, String upass) {

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		username.sendKeys(uname);
		userpass.sendKeys(upass);
		userlogin.click();
	}

}
