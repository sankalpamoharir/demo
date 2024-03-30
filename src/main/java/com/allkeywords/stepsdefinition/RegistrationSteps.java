package com.allkeywords.stepsdefinition;

import java.util.List;

import org.testng.Assert;

import com.allkeywords.Config;
import com.allkeywords.Keywords;
import com.allkeywords.Pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class is used to write the step definitions for the registration page
 * only.
 * 
 * @author Sankalpa Moharir
 *
 */

public class RegistrationSteps {
	Keywords keys = new Keywords();
	Config conf = new Config();

	@Given("Firefox Browser is open")
	public void launchingBrowser() {

		keys.openBrowser(conf.getBrowserName());
	}

	@And("Application is launched successfully in browser")
	public void launchingUrl() {

		keys.launchingUrl(conf.getAppUrl());
	}

	@When("User fills the entire form excluding last name")
	public void fillRegistrationFormWithoutLastname() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank@jmail.com");
		resg.enterPhoneno("1236547890");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}

	@And("Click on submit button")
	public void clickOnRegistrationButtn() {
		RegisterPage resg = new RegisterPage();
		resg.clickOnSubmit();
	}

	@Then("User should get error message about last name")
	public void checkingLastNameErrMsg() {
		String errorMsg = "true";
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgofErr("lastName");
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@When("User fills the entire form excluding first name")
	public void fillRegistrationFormWithoutFirstname() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterLastName("mo");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank@jmail.com");
		resg.enterPhoneno("1236547890");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}

	@Then("User should get error message about first name")
	public void checkingFirstNameErrMsg() {
		String errorMsg = "true";
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgofErr("firstName");
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@When("User fills the entire form excluding email id")
	public void fillRegistrationFormWithoutEmailId() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enterPhoneno("1236547890");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}

	@Then("User should get error message about email id")
	public void checkingEmailIdErrMsg() {
		String errorMsg = "true";
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgofErr("email");
		Assert.assertEquals(actualmsg, errorMsg);
	}

	@When("User fills the entire form excluding phone number")
	public void fillRegistrationFormWithoutPhoneNo() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank@jmail.com");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}

	@Then("User should get error message about phone number")
	public void checkingPhoneNoErrMsg() {
		String errorMsg = "true";
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgofErr("phoneNo");
		Assert.assertEquals(actualmsg, errorMsg);
	}

	@When("User fills the entire form excluding selection of gender")
	public void fillRegistrationFormSelectingGender() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank@jmail.com");
		resg.enterPhoneno("1236547890");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}

	@Then("User should get error message about gender selection")
	public void checkingselectionofGenderErrMsg() {
		String errorMsg = "true";
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgofErr("firstName");
		Assert.assertEquals(actualmsg, errorMsg);
	}

	@When("User fills the entire form excluding selction of country")
	public void fillRegistrationFormWithoutSelectingCountry() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank@jmail.com");
		resg.enterPhoneno("1236547890");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}

	@Then("User should get error message about country selection")
	public void checkingSelectionofCountryErrMsg() {
		String errorMsg = "true";
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgofErr("country");
		Assert.assertEquals(actualmsg, errorMsg);
	}
	@And("User fills the entire form with character in phone number")
	public void verifyingPhoneNo() {
		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank@jmail.com");
		resg.enterPhoneno("sankalpamo");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}
	@Then("User should get error message about format of phone number")
	public void checkingPhoneNoFormatErrMsg() {
		String errorMsg = null;
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgabtformat();
		Assert.assertEquals(actualmsg, errorMsg);
	}
	@When("User fills the entire form with phone number not following format:")
	public void verifyingFormatofPhoneNo(DataTable table) {
		List<String> phnos = table.asList(); 
		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank@jmail.com");
		for(String phno:phnos) {
		resg.enterPhoneno(phno);
		}
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}
	@When("User fills the entire form with email id without following format")
	public void verifyingFormatofEmailId() {
		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enteremail("sank.com");
		resg.enterPhoneno("1236547890");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");
	}
	@Then("User should get error message about format of email id")
	public void checkingEmailIdFormatErrMsg() {
		String errorMsg = null;
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgabtformat();
		Assert.assertEquals(actualmsg, errorMsg);
	}
	@When("User fills the entire form with email id without Special character")
	public void fillRegistrationFormWithoutEmailidSpecialchar() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterLastName("Moharir");
		resg.enterAddress("Pimpri");
		resg.enteremail("123.123");
		resg.selectGender("female");
		resg.tickHobbies();
		resg.selectSkill("Java");

	}


}