package com.allkeywords.stepsdefinition;

import com.allkeywords.Config;
import com.allkeywords.Keywords;
import com.allkeywords.Pages.RegisterPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

	}
}