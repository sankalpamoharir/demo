package com.allkeywords.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.allkeywords.Keywords;

public class RegisterPage {
	@FindBy(css = "")
	public WebElement registerLink;
	@FindBy(css = "")
	public WebElement firstName;
	@FindBy(css = "")
	public WebElement lastName;
	@FindBy(css = "")
	public WebElement address;
	@FindBy(css = "")
	public WebElement city;
	@FindBy(css = "")
	public WebElement state;
	@FindBy(css = "")
	public WebElement zipcode;
	@FindBy(css = "")
	public WebElement phoneNo;
	@FindBy(css = "")
	public WebElement ssn;
	@FindBy(css = "")
	public WebElement userName;
	@FindBy(css = "")
	public WebElement password;
	@FindBy(css = "")
	public WebElement confmPassword;
	@FindBy(css = "")
	public WebElement rgsbutton;
	@FindBy(css = "")
	public WebElement lastNameErr;
	public RegisterPage() {
		PageFactory.initElements(Keywords.driver,this);
	}
	public void clickOnRegisterlink() {
		registerLink.click();
	}
	public void enterFirstName(String text) {
		firstName.sendKeys(text);
	}
	public void enterLastName(String text) {
		lastName.sendKeys(text);
	}
	public void enterAddress(String text) {
		address.sendKeys(text);
	}

	public void enterCity(String text) {
		city.sendKeys(text);
		
	}

	public void enterState(String text) {
		state.sendKeys(text);
		
	}

	public void enterZipcode(String text) {
		zipcode.sendKeys(text);
		
	}

	public void enterPhoneno(String text) {
		phoneNo.sendKeys(text);
		
	}

	public void enterSsn(String text) {
		ssn.sendKeys(text);
		
	}

	public void enterUserName(String text) {
		userName.sendKeys(text);
		
	}

	public void enterPassword(String text) {
		password.sendKeys(text);
		
	}

	public void enterCnfrmPassword(String text) {
		confmPassword.sendKeys(text);
		
	}

	public void clickregisterbttn() {
		rgsbutton.click();
		
	}

	public String getmsgofLastNameErr() {
	
		return lastNameErr.getText();
	}

}
