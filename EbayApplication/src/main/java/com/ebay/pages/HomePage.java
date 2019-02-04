package com.ebay.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
	
	public class HomePage extends BasePage {
		
		public HomePage(AndroidDriver<WebElement> driver) {
			super(driver);
		}

		@AndroidFindBy(className="android.widget.ImageButton")
        private WebElement menuButton;
		
        @AndroidFindBy(className="android.widget.ImageView")
	    private WebElement signInButton;
        
        @AndroidFindBy(id="search_box")
        private WebElement homePageSerach;
        
        @AndroidFindBy(id="search_src_text")
        private WebElement sendKeysSearch;
        
        @AndroidFindBy(className="android.widget.TextView")
        private WebElement serachFortheProduct;
        
        
        @AndroidFindBy(className="android.widget.TextView")
        private WebElement AndroidButtons;
        
        
        @AndroidFindBy(xpath="//android.widget.TextView[@text='No search results found']")    
        List<WebElement> noResultFound;
        
       
	
	public void clickOnSignIn() {
		isvisible(menuButton, driver);
		menuButton.click();
		isvisible(signInButton,driver);
		signInButton.click();
		
	}
	
	public void serachForItme(String data) 
	{
		isvisible(homePageSerach,driver);
		homePageSerach.click();
		sendKeysSearch.sendKeys(data);
		isvisible(serachFortheProduct,driver);
		serachFortheProduct.click();
		
		
	}
	
	public void backClick()
	{
		isvisible(AndroidButtons,driver);
		clickOnAppBackButton(driver);
	}
	
	public int getSizeForNoResults()
	{
		return noResultFound.size();
	}
	
	public void menuButtonClick()
	{
		isvisible(menuButton,driver);
		menuButton.click();
	}

}
