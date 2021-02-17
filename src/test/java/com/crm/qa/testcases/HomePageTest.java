package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		dealsPage = new DealsPage();
		homePage=loginPage.login(prop.getProperty("emailAdr"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTest() {
		Assert.assertTrue(homePage.verifyHomePageScreen());
	}
	
	@Test(priority=2)
	public void verifyLoggedInUserTest() {
		Assert.assertTrue(homePage.verifyLoggedinUser());
	}
	
	@Test(priority=3)
	public void clickContactsLinkTest() {
		contactsPage=homePage.clickOnContactsLink();
	}
	
	@Test(priority=4)
	public void clickDealsLinkTest() {
		dealsPage=homePage.clickOnDealsLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
