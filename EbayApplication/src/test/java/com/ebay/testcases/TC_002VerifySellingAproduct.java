package com.ebay.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.pages.HomePage;
import com.ebay.pages.SellingPage;
import com.ebay.pages.SellingReviewPage;
import com.ebay.pages.SignInPage;
import com.test.ebay.TestBase.TestBase;
import com.test.ebay.utility.ConfigReader;
import com.test.ebay.utility.CreateSession;
import com.test.ebay.utility.JsonReader;

import bsh.ParseException;

public class TC_002VerifySellingAproduct extends TestBase {
	
	SellingReviewPage sellingReviewPage;
	HomePage homepage;
	SellingPage sellingPage;
	SignInPage signInPage;
	ConfigReader reader= new ConfigReader();
	
	@BeforeClass
	public void SignIn()
	{

		homepage=new HomePage(CreateSession.driver);
		
	    signInPage = new SignInPage (CreateSession.driver);
	    homepage.clickOnSignIn();
	    signInPage.signInAsARegisteredUser(); 
	    
	}
	
	@Test(dataProvider="SellingProductdata",priority=1)
	public void verifySellingItems(String productName,String country,String description,String price) throws InterruptedException
	{
		sellingReviewPage=new SellingReviewPage(CreateSession.driver);
		sellingPage =new SellingPage(CreateSession.driver);
		homepage.menuButtonClick();
		sellingPage.sellingButtonClick();
		sellingPage.addtheSellingItem(productName,country,description,price);
		Assert.assertEquals(reader.sellingListYourItems(), sellingReviewPage.publishButtonText(),"Not able to Sell");
	
		
	}
	
	@DataProvider(name="SellingProductdata")
	public Object[][] passData() throws IOException, ParseException
	{
		return JsonReader.getdata( System.getProperty("user.dir")+reader.jsonPath()+"SellingProductData.json", "SellingProduct data",1,4);
		
	}

}
