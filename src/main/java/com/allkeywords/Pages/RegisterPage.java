package com.allkeywords.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.allkeywords.Keywords;

public class RegisterPage {
	@FindBy(css = "button#btn2")
	public WebElement registerLink;
	@FindBy(css = "input[ng-model='FirstName']")
	public WebElement firstName;
	@FindBy(css = "input[ng-model='LastName']")
	public WebElement lastName;
	@FindBy(css = " textarea")
	public WebElement address;
	@FindBy(css = "input[type='Email']")
	public WebElement email;
	@FindBy(css = "input[type='tel']")
	public WebElement phoneNo;
	@FindBy(css = "input[value='Male']")
	public WebElement malebtn;
	@FindBy(css = "input[value='FeMale']")
	public WebElement femalebtn;
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
		PageFactory.initElements(Keywords.driver, this);
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

	public void enterPhoneno(String text) {
		phoneNo.sendKeys(text);

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
