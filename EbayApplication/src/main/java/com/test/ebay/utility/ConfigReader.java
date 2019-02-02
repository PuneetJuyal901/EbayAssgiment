package com.test.ebay.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	FileInputStream fis=null;
	
	public ConfigReader() 
	{
		
	
		try {
			File src= new File(System.getProperty("user.dir")+"//configuration//config.properties");
			  fis= new FileInputStream(src);
			 prop= new Properties(); 
			
			 
			prop.load(fis); 
		}
			catch (Exception e) {
				
			     System.out.println("Exception is" +e.getMessage());
			}
			     
			     finally {
			    	    if (fis != null) {
			    	        try {
			    	        	fis.close();
			    	        } catch (IOException e) {
			    	            
			    	            e.printStackTrace();
			    	        }
			    	    }
			}}
				
	
	public  String os()
	{
		return prop.getProperty("operatingSystem");
	}
	
	public String deviceName()
	{
		return prop.getProperty("deviceName");
	}
	
	public String jsonPath()
	{
		String path= prop.getProperty("JsonPath");
		return path;
	}
	
	public String log4jPath()
	{
		return prop.getProperty("log4jPath");
		
	}
	
	public String ebayAutomationReportPath()
	{
		 return prop.getProperty("reportName");
	}
	
	public String registerUserName()
	{
	
		return prop.getProperty("email");
	}
	
	public String registeredpassword()
	{
		
		return prop.getProperty("password");
	}
	
	public String sellingListYourItems()
	{

		
		return prop.getProperty("listYourItem");
	}
	}
	

