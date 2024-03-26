package com.allkeywords;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.allkeywords.customerror.BrowserNameError;

public class Keywords {
	public static RemoteWebDriver driver;
	public FluentWait<WebDriver> wait;

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

	public void launchingUrl(String Url) {
		driver.get(Url);
	}

	public void visibilityOfElement(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

}