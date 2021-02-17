package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String LoginPageTitle = loginPage.loginPageTitle();
		Assert.assertEquals(LoginPageTitle, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void login() {
		homePage=loginPage.login(prop.getProperty("emailAdr"), prop.getProperty("password"));
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
