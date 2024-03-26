package com.allkeywords.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class can be used to read properties file. It contains utility methods
 * to read any properties file in different ways.
 * 
 * @author Sankalpa Moharir
 *
 */

public class PropUtil {
	private String filePath;

	public PropUtil(String locatorFile) {
		filePath = locatorFile;
	}

	public PropUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method can be used to get value of a specified key.
	 * 
	 * @param filePath from which you want to value.
	 * @param key      for which you need value
	 * @return {@code String} representation of value.
	 */

	public String getValue(String filePath, String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {

		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

		}
		String value = prop.getProperty(key);
		return value;
	}

	/**
	 * This method can be used along with {@code PropUtil{String filePath}}. This
	 * method can read the file which is initialized during object creation.
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}

}
