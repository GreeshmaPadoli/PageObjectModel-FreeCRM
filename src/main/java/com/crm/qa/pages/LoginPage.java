package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR
	@FindBy(name="email")
	WebElement emailAddress;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpLink;
	
	//Initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String loginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String email, String pwd) {
		emailAddress.sendKeys(email);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}
}
