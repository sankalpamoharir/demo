package com.allkeywords;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.allkeywords.customerror.BrowserNameError;
/**
 * This is the keyword class which contains the necessary keywords used in whole project.
 * @author Sankalpa Moharir
 *
 */
public class Keywords {
	public static RemoteWebDriver driver;
	public FluentWait<WebDriver> wait;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.err.println("Invalid Browser Name: You have enter the wrong name");
			throw new BrowserNameError(browserName);
		}
		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("");
		wait.ignoring(NoSuchElementException.class);

	}

	public void scrollPage() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

	public void launchingUrl(String Url) {
		driver.get(Url);
	}

	public void visibilityOfElement(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}
	public void dropdown(WebElement skills, String item) {
		Select objSelect =new Select(skills);
		objSelect.selectByVisibleText(item);

	}
	public void dropdownbyvalue(WebElement country, String item) {
		Select objSelect = new Select(country);
		objSelect.selectByValue(item);

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

}
