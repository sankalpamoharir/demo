package com.allkeywords.stepsdefinition;

import com.allkeywords.Config;
import com.allkeywords.Keywords;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
	Keywords keys = new Keywords();

	@Before
	public void openingBrowserandLaunchingUrl() {
		Config cofg = new Config();
		keys.openBrowser(cofg.getBrowserName());
		keys.launchingUrl(cofg.getAppUrl());
	}

	@After
	public void teatDown() {
		keys.quiteBrowser();
	}

}
