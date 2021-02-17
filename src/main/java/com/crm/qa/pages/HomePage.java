package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Greeshma')]")
	WebElement loggedInUser;

	@FindBy(xpath = "//div[contains(text(),'Contacts activity')]")
	WebElement contactsActivityStream;

	@FindBy(xpath = "//a[@href='/contacts']")
	WebElement contactsLink;

	@FindBy(xpath = "//a[@href='/deals']")
	WebElement dealsLink;
	
	@FindBy(xpath ="//a[@href='/contacts']//following-sibling::button")
	WebElement newContactBtn;

	// Initializing page objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHomePageScreen() {
		return contactsActivityStream.isDisplayed();
	}
	
	public boolean verifyLoggedinUser() {
		return loggedInUser.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	public void clickOnNewContactBtn() {	
		newContactBtn.click();
	}

}
