package com.test.ebay.utility;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class CreateSession {
	public static AndroidDriver<WebElement> driver;
	public static  void appStart(String operatingSystem,String deviceName) throws MalformedURLException
	{
		if(operatingSystem.trim().equalsIgnoreCase("Android"))
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
			cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/EbayApk"+"/eBay.apk");
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		}
	}

}
