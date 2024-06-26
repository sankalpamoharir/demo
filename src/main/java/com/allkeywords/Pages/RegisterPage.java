package com.allkeywords.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.allkeywords.Keywords;
/**
 * This class contains the css selector for the registration page as well as their methods.
 * @author Sankalpa Moharir
 *
 */
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
	@FindBy(css = "input[type='checkbox']")
	public List<WebElement> hobbies;
	@FindBy(css = "select#Skills")
	public WebElement skills;
	@FindBy(css = "input[ng-model='LastName']")
	public WebElement lastNameErr;
	@FindBy(css = "button#submitbtn")
	public WebElement submit;

	Keywords keys = new Keywords();

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

	public void tickHobbies() {
		int size = hobbies.size();

		for (int i = 0; i < size; i++) {

			hobbies.get(i).click();
		}
	}

	public void selectSkill(String text) {
		keys.scrollPage();
		keys.dropdown(skills, text);

	}

	public String getmsgofErr(String text) {
		if (text.equalsIgnoreCase("firstName")) {
			return firstName.getAttribute("required");
		} else if (text.equalsIgnoreCase("lastName")){
			return lastNameErr.getAttribute("required");
		}else if(text.equalsIgnoreCase("email")) {
			return email.getAttribute("required");	
		}else if(text.equalsIgnoreCase("phoneNo")) {
			return phoneNo.getAttribute("required");	
		}else if(text.equalsIgnoreCase("malebtn")) {
			return malebtn.getAttribute("required");
		}else {
			return "Invalid Input";
		}
		
	}

	public void enteremail(String emailid) {
		email.sendKeys(emailid);

	}

	public void selectGender(String gender) {
		if (gender.equalsIgnoreCase("female")) {
			femalebtn.click();
		} else if (gender.equalsIgnoreCase("male")) {
			malebtn.click();
		} else {
			System.out.println("Invalid Input");
		}

	}

	public void clickOnSubmit() {

		// keys.scrollPage();
		submit.click();

	}

	public String getmsgabtformat() {
	
		return phoneNo.getAttribute("required pattern=^\\d{10}$");
	}

}
