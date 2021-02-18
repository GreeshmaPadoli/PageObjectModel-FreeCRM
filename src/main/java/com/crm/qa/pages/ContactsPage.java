package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement createNewContactBtn;
	
	//Initializing page objects
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsPageLabel() {
		return contactsLabel.isDisplayed();
	}
	
	public void selectCheckboxByContactName(String name) {
		driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//parent::td//preceding-sibling::td//div")).click();
		//selected contact by checkbox name
	}
	
	

}
