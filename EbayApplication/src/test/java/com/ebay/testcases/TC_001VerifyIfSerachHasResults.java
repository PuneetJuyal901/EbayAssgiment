package com.ebay.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.pages.HomePage;
import com.ebay.pages.SignInPage;
import com.test.ebay.TestBase.TestBase;
import com.test.ebay.utility.ConfigReader;
import com.test.ebay.utility.CreateSession;
import com.test.ebay.utility.JsonReader;
import bsh.ParseException;

public class TC_001VerifyIfSerachHasResults extends TestBase {
	
	HomePage homepage;
	SignInPage signInPage;
	ConfigReader reader= new ConfigReader();
	

	@BeforeClass
	public void SignIn()
	{
	    homepage  = new HomePage(CreateSession.driver);
	    signInPage= new SignInPage(CreateSession.driver);
	    homepage.clickOnSignIn();
	    signInPage.signInAsARegisteredUser();    
	}
		
	@Test(dataProvider="Product data",priority=1)
	public void searchForitems(String data)
	{
		homepage.serachForItme(data);
		Assert.assertNotEquals(homepage.getSizeForNoResults(),1,"No products is found for" +data);
		homepage.backClick();
		
	}
	
	@DataProvider(name="Product data")
	public Object[][] passData() throws IOException, ParseException
	{
		return JsonReader.getdata( System.getProperty("user.dir")+reader.jsonPath()+"ProductData.json", "Product data",2, 1);
		
	}
}
