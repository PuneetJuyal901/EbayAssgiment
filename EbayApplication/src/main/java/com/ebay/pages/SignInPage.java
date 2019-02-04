package com.ebay.pages;

import org.openqa.selenium.WebElement;

import com.test.ebay.utility.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInPage extends BasePage {
		ConfigReader reader=new ConfigReader();
	public SignInPage(AndroidDriver<WebElement> driver) {
		super(driver);
		
	}
	
	 @AndroidFindBy(id="edit_text_username")
     private WebElement emailField;
     
     @AndroidFindBy(id="edit_text_password")
     private WebElement passwordField;
    
     @AndroidFindBy(id="button_sign_in")
     private WebElement register;
     
     @AndroidFindBy(id="button_google_deny")
     private WebElement noThanks;
     
     
     public void signInAsARegisteredUser()
     {
    	 isvisible(emailField,driver);
    	 emailField.sendKeys(reader.registerUserName());
    	 isvisible(passwordField,driver); 
    	 passwordField.sendKeys(reader.registeredpassword());
    	 isvisible(register,driver); 
    	 register.click();
    	 isvisible(noThanks,driver);
    	 noThanks.click();  	 	 
     }
	
	

}
