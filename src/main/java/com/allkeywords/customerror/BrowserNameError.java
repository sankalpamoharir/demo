package com.allkeywords.customerror;

public class BrowserNameError extends Error{
	private String msg;

	public BrowserNameError(String browserName) {
		msg = "Invalid Brower name" + browserName;
	}

	@Override
	public String toString() {

		return msg;
	}

}
