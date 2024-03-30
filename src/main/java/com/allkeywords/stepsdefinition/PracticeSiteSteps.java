package com.allkeywords.stepsdefinition;

import com.allkeywords.Pages.PracticesitePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class PracticeSiteSteps {

	PracticesitePage ps = new PracticesitePage();

	@When("User enter in shop site")
	public void openingShop() {

		ps.clickOnRegisterlink();
		ps.clickOnPracticeSite();
		ps.clickOnShop();
		ps.clickOnAndroid();
	}
	@And("Add item in basket")
	public void addToBasket() {
		ps.addToBasket();

	}

}
