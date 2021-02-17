package com.crm.qa.testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	String sheetName="Contacts";
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		homePage=loginPage.login(prop.getProperty("emailAdr"), prop.getProperty("password"));
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test(enabled=false)
	public void verifyContactsPageTest() {
		Assert.assertTrue(contactsPage.verifyContactsPageLabel(),"Contacts page label missing");
	}
	
	@Test(enabled=false)
	public void selectContactCheckboxTest() {
		testUtil.cursorMoveByOffset(20, 0);
		contactsPage.selectCheckboxByContactName("John M Cena");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
