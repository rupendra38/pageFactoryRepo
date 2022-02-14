package com.fb.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class ConfigDataProvider {

	Properties property;

	public ConfigDataProvider()

	{

		property = new Properties();

		File file = new File("./config/config.properties");

		try {
			FileInputStream fis = new FileInputStream(file);
			property.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("file not loaded error");
		}

	}
	
	public  String getBrowser()
	{
	return	property.getProperty("browser");
	
	}
	
	public  String getUrl()
	{
	return	property.getProperty("testUrl");
	
	}

}
