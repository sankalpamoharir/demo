package com.allkeywords.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.allkeywords.Keywords;

public class PracticesitePage {
	@FindBy(css = "button#btn2")
	public WebElement registerLink;
	@FindBy(css = "#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(10) > a")
	public WebElement practiceSite;
	@FindBy(css = "a[href=\"https://practice.automationtesting.in/shop/\"]")
	public WebElement shop;
	@FindBy(css = "a[href=\"https://practice.automationtesting.in/product-category/android/\"]")
	public WebElement android;
	@FindBy(css = "a[href=\"/product-category/android/?add-to-cart=169\"]")
	public WebElement addToBasket;
	
	
	Keywords keys = new Keywords();

	public PracticesitePage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	public void clickOnRegisterlink() {
		registerLink.click();
	}

	public void clickOnPracticeSite() {
		practiceSite.click();
	}

	public void clickOnShop() {
		shop.click();
	}

	public void clickOnAndroid() {
		android.click();
	}
	public void addToBasket() {
		Keywords keys = new Keywords();
		keys.slightScrollPage();
		addToBasket.click();

	}

}
