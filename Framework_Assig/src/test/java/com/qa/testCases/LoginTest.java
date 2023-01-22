package com.qa.testCases;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginTest extends TestBase {
	LoginPage l = new LoginPage();
	
	@Test
	public void verifylogIn() {
		l.enterUserName();
		l.enterpassWord();
		l.clickLogInButton();
		
	}

}
