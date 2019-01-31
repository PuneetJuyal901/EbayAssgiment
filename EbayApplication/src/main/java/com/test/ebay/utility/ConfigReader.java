package com.test.ebay.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	
	public ConfigReader() 
	{
		
	
		try {
			File src= new File(System.getProperty("user.dir")+"//configuration//config.properties");
			 FileInputStream fis= new FileInputStream(src);
			 prop= new Properties(); 
			
			 
			prop.load(fis); 
		}
			catch (Exception e) {
				
			     System.out.println("Exception is" +e.getMessage());
			}	
				
		}
	
	public  String os()
	{
		String os= prop.getProperty("operatingSystem");
		return os;
	}
	
	public String deviceName()
	{
		String deviceName =prop.getProperty("deviceName");
		return deviceName;
	}
	
	public String jsonPath()
	{
		String path= prop.getProperty("JsonPath");
		return path;
	}
	
	public String log4jPath()
	{
		String path = prop.getProperty("log4jPath");
		return path;
		
	}
	
	public String ebayAutomationReportPath()
	{
		String path = prop.getProperty("reportName");
		return path;
	}
	
	public String registerUserName()
	{
		String path =prop.getProperty("email");
		return path;
	}
	
	public String registeredpassword()
	{
		String path=prop.getProperty("password");
		return path;
	}
	

}
