package com.ebay.pages;

import org.openqa.selenium.WebElement;
import com.test.ebay.utility.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SellingReviewPage extends BasePage {
	ConfigReader reader=new ConfigReader();
	public SellingReviewPage(AndroidDriver<WebElement> driver) {
		super(driver);
		
	}
	
	 @AndroidFindBy(id="button_publish")
     private WebElement publishButtonText;
	 
	 public String publishButtonText()
	 {
		isvisible(publishButtonText,driver); 
		return  publishButtonText.getText();
	 }

}
