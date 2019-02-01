package com.ebay.pages;

import org.openqa.selenium.WebElement;

import com.test.ebay.utility.CreateSession;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SellingPage extends BasePage {
	
	public SellingPage(AndroidDriver<WebElement> driver) {
		super(driver);
		
	}
	
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Selling']")
     private WebElement selling;
	 

	 @AndroidFindBy(id="sell_something_button")
     private WebElement startSellingNowButton;
	 
	 @AndroidFindBy(id="search_src_text")
     private WebElement sellingItemSearch;
	 
	 @AndroidFindBy(id="text")
     private WebElement sellingItemSerachList;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Audio & Home Entertainment']")
     private WebElement categoryAudioAndHome;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Bluetooth Headsets & Earphones']")
     private WebElement subCategoryBluetoothAndSpeakers;
	 
	 @AndroidFindBy(id="continueImage")
     private WebElement clickOnItemImage;
	 
	 @AndroidFindBy(xpath="//android.view.View[@index='0']")
     private WebElement photo;
	 
	 @AndroidFindBy(id="listing_hub_condition")
     private WebElement conditon;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='New']")
     private WebElement conditonSubCategoryNew;
	 
	 @AndroidFindBy(id="home")
     private WebElement sellingBackButton;
	 
	 @AndroidFindBy(id="listing_hub_item_specifics")
     private WebElement itemSpecifyCategory;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Brand']")
     private WebElement itemSpecifySubCategory;
	 
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Unbranded']")
     private WebElement itemSpecifySubCategoryListUnbranded;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Type']")
     private WebElement itemSpecifySubCategoryListType;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='In Ear']")
     private WebElement itemSpecifySubCategoryTypeInEar;
	 
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Maximum Retail Price']")
     private WebElement itemSpecifySubCategoryMaxRetailPrice;
	 

	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Does Not Apply']")
     private WebElement itemSpecifySubCategoryMaxRetailPriceListDontApply;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='MPN']")
     private WebElement itemSpecifySubCategoryMpn;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Does Not Apply']")
     private WebElement itemSpecifySubCategoryListMpnDoesNotAply;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Manufacturer/Packer/Importer Details']")
     private WebElement itemSpecifySubCategoryManfactuerDetails;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='See Description']")
     private WebElement itemSpecifySubCategoryListManfactuerDetailsSeeDescrption;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Net Quantity/Number of Units']")
     private WebElement itemSpecifySubCategoryNetQuan;
	 
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Does Not Apply']")
     private WebElement itemSpecifySubCategoryListNetQuanDoNotApply;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Package/Unit Dimension']")
     private WebElement itemSpecifySubCategoryPackageDimension;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Does Not Apply']")
     private WebElement itemSpecifySubCategoryListPackageDimesnionDoNotApply;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='With or Without Mic']")
     private WebElement itemSpecifySubCategoryWithWithoutMic;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='With Mic']")
     private WebElement itemSpecifySubCategoryListWithWithoutMicWithMic;
	 
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Date of Packing, Import or Both']")
     private WebElement itemSpecifySubCategoryDateOfPacking;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Does Not Apply']")
     private WebElement itemSpecifySubCategoryListDateOfPackingDoesNotApply;
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Contact Details for Consumer Complaints']")
     private WebElement itemSpecifySubCategoryConsumerComplaints;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='See Description']")
     private WebElement itemSpecifySubCategoryListConsumerComplaints;
	 
	 
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Country of Origin']")
     private WebElement itemSpecifySubCategoryCountryOfOrigin;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Enter your own']")
     private WebElement itemSpecifySubCategoryListCountryOfOriginOfOwn;
	 
	 @AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your own']")
     private WebElement itemSpecifySubCategoryCountryOfOriginEnter;
	 
	 @AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
     private WebElement itemSpecifySubCategoryCountryOfOriginok;
	 

	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Warranty']")
     private WebElement itemSpecifySubCategoryWarranty;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Manufacturer Warranty']")
     private WebElement itemSpecifySubCategoryListWarrantymanufactuer;
	 
	 @AndroidFindBy(xpath="//android.view.View[@index='5']")
     private WebElement decriptionCategory;
	 
	 @AndroidFindBy(className="android.widget.EditText")
     private WebElement decriptionCategoryEdit;
	 
	 @AndroidFindBy(xpath="//android.view.View[@index='6']")
     private WebElement formatAndPrice;
	 
	 @AndroidFindBy(xpath="//android.widget.EditText[@text='none']")
     private WebElement formatAndPriceBuyItNow;
	 
	 @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Fixed Price']")
     private WebElement pricePut;
	 
	 @AndroidFindBy(xpath="//android.view.View[@index='7']")
     private WebElement shipingAndPickUpCategory;
	 
	 @AndroidFindBy(id="sell_add_first_shipping_service")
     private WebElement addShippinAddress;
	 
	 @AndroidFindBy(xpath="//android.widget.LinearLayout[@index='1']") 
     private WebElement shippingAddressFlatRate;
	 
	 @AndroidFindBy(xpath="//android.widget.Button[@text='OK']") 
     private WebElement shippingAddressOk;
	 
	 @AndroidFindBy(id="button_continue") 
     private WebElement shipingItemContinue;
	 
	 
	 
	 
	 
	 public void sellingButtonClick()
	 {
		 isvisible(selling,CreateSession.driver);
		 selling.click();
		 
	 }
	 
	 public void addtheSellingItem(String productName,String country,String description,String price) 
	 {
		 isvisible(startSellingNowButton,CreateSession.driver);
		 startSellingNowButton.click();
		 isvisible(sellingItemSearch,CreateSession.driver);
		 sellingItemSearch.sendKeys(productName);
		 isvisible(sellingItemSerachList,CreateSession.driver);
		 sellingItemSerachList.click();
		 isvisible(categoryAudioAndHome,CreateSession.driver);
		 categoryAudioAndHome.click();
		 isvisible(subCategoryBluetoothAndSpeakers,CreateSession.driver);
		 subCategoryBluetoothAndSpeakers.click();
		 isvisible(clickOnItemImage,CreateSession.driver);
		 clickOnItemImage.click();
		 isvisible(conditon,CreateSession.driver);
		 conditon.click();
		 isvisible(conditonSubCategoryNew,CreateSession.driver);
		 conditonSubCategoryNew.click();
		 isvisible(sellingBackButton,CreateSession.driver);
		 sellingBackButton.click();
		 isvisible(itemSpecifyCategory,CreateSession.driver);
		 itemSpecifyCategory.click();
		 isvisible(itemSpecifySubCategory,CreateSession.driver);
		 itemSpecifySubCategory.click();
		 isvisible(itemSpecifySubCategoryListUnbranded,CreateSession.driver);
		 itemSpecifySubCategoryListUnbranded.click();
		 isvisible(itemSpecifySubCategoryListType,CreateSession.driver);
		 itemSpecifySubCategoryListType.click();
		 isvisible(itemSpecifySubCategoryTypeInEar,CreateSession.driver);
		 itemSpecifySubCategoryTypeInEar.click();
		 isvisible(itemSpecifySubCategoryMaxRetailPrice,CreateSession.driver);
		 itemSpecifySubCategoryMaxRetailPrice.click();
		 isvisible(itemSpecifySubCategoryMaxRetailPriceListDontApply,CreateSession.driver);
		 itemSpecifySubCategoryMaxRetailPriceListDontApply.click();
		 isvisible(itemSpecifySubCategoryMpn,CreateSession.driver);
		 itemSpecifySubCategoryMpn.click();
		 isvisible(itemSpecifySubCategoryListMpnDoesNotAply,CreateSession.driver);
		 itemSpecifySubCategoryListMpnDoesNotAply.click();
		 isvisible(itemSpecifySubCategoryManfactuerDetails,CreateSession.driver);
		 itemSpecifySubCategoryManfactuerDetails.click();
		 isvisible(itemSpecifySubCategoryListManfactuerDetailsSeeDescrption,CreateSession.driver);
		 itemSpecifySubCategoryListManfactuerDetailsSeeDescrption.click();
		 isvisible(itemSpecifySubCategoryNetQuan,CreateSession.driver);
		 itemSpecifySubCategoryNetQuan.click();
		 isvisible(itemSpecifySubCategoryListNetQuanDoNotApply,CreateSession.driver);
		 itemSpecifySubCategoryListNetQuanDoNotApply.click();
		 isvisible(itemSpecifySubCategoryPackageDimension,CreateSession.driver);
		 itemSpecifySubCategoryPackageDimension.click();
		 isvisible(itemSpecifySubCategoryListPackageDimesnionDoNotApply,CreateSession.driver);
		 itemSpecifySubCategoryListPackageDimesnionDoNotApply.click();
		 isvisible(itemSpecifySubCategoryWithWithoutMic,CreateSession.driver);
		 itemSpecifySubCategoryWithWithoutMic.click();
		 isvisible(itemSpecifySubCategoryListWithWithoutMicWithMic,CreateSession.driver);
		 itemSpecifySubCategoryListWithWithoutMicWithMic.click();
		 isvisible(itemSpecifySubCategoryDateOfPacking,CreateSession.driver);
		 itemSpecifySubCategoryDateOfPacking.click();
		 isvisible(itemSpecifySubCategoryListDateOfPackingDoesNotApply,CreateSession.driver);
		 itemSpecifySubCategoryListDateOfPackingDoesNotApply.click();
		 isvisible(itemSpecifySubCategoryConsumerComplaints,CreateSession.driver);
		 itemSpecifySubCategoryConsumerComplaints.click();
		 isvisible(itemSpecifySubCategoryListConsumerComplaints,CreateSession.driver);
		 itemSpecifySubCategoryListConsumerComplaints.click();
		 isvisible(itemSpecifySubCategoryCountryOfOrigin,CreateSession.driver);
		 itemSpecifySubCategoryCountryOfOrigin.click();
		 isvisible(itemSpecifySubCategoryListCountryOfOriginOfOwn,CreateSession.driver);
		 itemSpecifySubCategoryListCountryOfOriginOfOwn.click();
		 isvisible(itemSpecifySubCategoryCountryOfOriginEnter,CreateSession.driver);
		 itemSpecifySubCategoryCountryOfOriginEnter.sendKeys(country);
		 isvisible(itemSpecifySubCategoryCountryOfOriginok,CreateSession.driver);
		 itemSpecifySubCategoryCountryOfOriginok.click();
		 scrollTillWarranty(CreateSession.driver);
		 isvisible(itemSpecifySubCategoryWarranty,CreateSession.driver);
		 itemSpecifySubCategoryWarranty.click();
		 isvisible(itemSpecifySubCategoryListWarrantymanufactuer,CreateSession.driver);
		 itemSpecifySubCategoryListWarrantymanufactuer.click();
		 isvisible(sellingBackButton,CreateSession.driver);
		 sellingBackButton.click();
		 isvisible(decriptionCategory,CreateSession.driver);
		 decriptionCategory.click();
		 isvisible(decriptionCategoryEdit,CreateSession.driver);
		 decriptionCategoryEdit.sendKeys(description);
		 sellingBackButton.click();
		 scrollDown(CreateSession.driver,decriptionCategory,photo);
		 isvisible(formatAndPrice,CreateSession.driver);
		 formatAndPrice.click();
		 isvisible(pricePut,CreateSession.driver);
		 pricePut.click();
		 isvisible(formatAndPriceBuyItNow,CreateSession.driver);
		 formatAndPriceBuyItNow.sendKeys(price);;
		 sellingBackButton.click();
		 isvisible(shipingAndPickUpCategory,CreateSession.driver);
		 shipingAndPickUpCategory.click();
		 isvisible(addShippinAddress,CreateSession.driver);
		 addShippinAddress.click();
		 isClickable(shippingAddressFlatRate,CreateSession.driver);
		 shippingAddressFlatRate.click();
		 isvisible(shippingAddressOk,CreateSession.driver);
		 shippingAddressOk.click();
		 sellingBackButton.click();
		 isvisible(shipingItemContinue,CreateSession.driver);
		 shipingItemContinue.click();
		 
		 
		 
		 
		 
		 
		 
		 	 
		 
	 }

}
