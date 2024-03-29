package com.allkeywords.stepsdefinition;

import org.testng.Assert;

import com.allkeywords.Config;
import com.allkeywords.Keywords;
import com.allkeywords.Pages.RegisterPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
		
	}
	@Then("User should get error message about first name")
	public void checkingFirstNameErrMsg() {
		String errorMsg = "true";
		RegisterPage resg = new RegisterPage();
		String actualmsg = resg.getmsgofErr("firstName");
		Assert.assertEquals(actualmsg, errorMsg);

	}

}