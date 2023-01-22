package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;
import com.qa.utilities.ReadConfig;

public class LoginPage extends TestBase {
	ReadConfig readcon = new ReadConfig();

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement userName;

	public void enterUserName() {
		System.out.println(readcon.getUserName());
		userName.sendKeys(readcon.getUserName());
	}

	@FindBy(xpath = "//input[@id='password']")
	WebElement passWord;

	public void enterpassWord() {
        System.out.println(readcon.getPass());
		passWord.sendKeys(readcon.getPass());
	}

	@FindBy(xpath = "//button[@id='log-in']")
	WebElement logInButton;

	public void clickLogInButton() {
		logInButton.click();

	}
}
