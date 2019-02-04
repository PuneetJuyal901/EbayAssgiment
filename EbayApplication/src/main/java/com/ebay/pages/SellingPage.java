package com.ebay.pages;

import org.openqa.selenium.WebElement;
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
	 
	 
	 
	 public void reachTillImageClick(String productName) {
			
		 isvisible(selling,driver);
		 selling.click();
		 isvisible(startSellingNowButton,driver);
		 startSellingNowButton.click();
		 isvisible(sellingItemSearch,driver);
		 sellingItemSearch.sendKeys(productName);
		 isvisible(sellingItemSerachList,driver);
		 sellingItemSerachList.click();
		 isvisible(categoryAudioAndHome,driver);
		 categoryAudioAndHome.click();
		 isvisible(subCategoryBluetoothAndSpeakers,driver);
		 subCategoryBluetoothAndSpeakers.click();
		 isvisible(clickOnItemImage,driver);
		 clickOnItemImage.click();
	 }
	 
	 public void conditionCategoryAndSubCategoryClick()
	 {
		 isvisible(conditon,driver);
		 conditon.click(); 	 
		 isvisible(conditonSubCategoryNew,driver);
		 conditonSubCategoryNew.click();
		 isvisible(sellingBackButton,driver);
		 sellingBackButton.click();
		 
	 }
	 
	 public void itemitemSpecifyCategoryAndSubCategoryClick(String country)
	 {
		 isvisible(itemSpecifyCategory,driver);
		 itemSpecifyCategory.click();
		 isvisible(itemSpecifySubCategory,driver);
		 itemSpecifySubCategory.click();
		 isvisible(itemSpecifySubCategoryListUnbranded,driver);
		 itemSpecifySubCategoryListUnbranded.click();
		 isvisible(itemSpecifySubCategoryListType,driver);
		 itemSpecifySubCategoryListType.click();
		 isvisible(itemSpecifySubCategoryTypeInEar,driver);
		 itemSpecifySubCategoryTypeInEar.click();
		 isvisible(itemSpecifySubCategoryMaxRetailPrice,driver);
		 itemSpecifySubCategoryMaxRetailPrice.click();
		 isvisible(itemSpecifySubCategoryMaxRetailPriceListDontApply,driver);
		 itemSpecifySubCategoryMaxRetailPriceListDontApply.click();
		 isvisible(itemSpecifySubCategoryMpn,driver);
		 itemSpecifySubCategoryMpn.click(); 
		 isvisible(itemSpecifySubCategoryListMpnDoesNotAply,driver);
		 itemSpecifySubCategoryListMpnDoesNotAply.click(); isvisible(itemSpecifySubCategoryManfactuerDetails,driver);
		 itemSpecifySubCategoryManfactuerDetails.click();	
		 isvisible(itemSpecifySubCategoryListManfactuerDetailsSeeDescrption,driver);
		 itemSpecifySubCategoryListManfactuerDetailsSeeDescrption.click();
		 isvisible(itemSpecifySubCategoryNetQuan,driver);
		 itemSpecifySubCategoryNetQuan.click();
		 isvisible(itemSpecifySubCategoryListNetQuanDoNotApply,driver);
		 itemSpecifySubCategoryListNetQuanDoNotApply.click();
		 isvisible(itemSpecifySubCategoryPackageDimension,driver);
		 itemSpecifySubCategoryPackageDimension.click();
         isvisible(itemSpecifySubCategoryListPackageDimesnionDoNotApply,driver);
		 itemSpecifySubCategoryListPackageDimesnionDoNotApply.click();
		 isvisible(itemSpecifySubCategoryWithWithoutMic,driver);
		 itemSpecifySubCategoryWithWithoutMic.click();	 
		 isvisible(itemSpecifySubCategoryListWithWithoutMicWithMic,driver);
		 itemSpecifySubCategoryListWithWithoutMicWithMic.click();
		 isvisible(itemSpecifySubCategoryDateOfPacking,driver);
		 itemSpecifySubCategoryDateOfPacking.click();
		 isvisible(itemSpecifySubCategoryListDateOfPackingDoesNotApply,driver);
		 itemSpecifySubCategoryListDateOfPackingDoesNotApply.click();
		 isvisible(itemSpecifySubCategoryConsumerComplaints,driver);
		 itemSpecifySubCategoryConsumerComplaints.click();		 
		 isvisible(itemSpecifySubCategoryListConsumerComplaints,driver);
		 itemSpecifySubCategoryListConsumerComplaints.click();
		 isvisible(itemSpecifySubCategoryCountryOfOrigin,driver);
		 itemSpecifySubCategoryCountryOfOrigin.click();
		 isvisible(itemSpecifySubCategoryListCountryOfOriginOfOwn,driver);
		 itemSpecifySubCategoryListCountryOfOriginOfOwn.click();
		 isvisible(itemSpecifySubCategoryCountryOfOriginEnter,driver);
		 itemSpecifySubCategoryCountryOfOriginEnter.sendKeys(country);
		 isvisible(itemSpecifySubCategoryCountryOfOriginok,driver);
		 itemSpecifySubCategoryCountryOfOriginok.click();
		 scrollTillWarranty(driver);
		 isvisible(itemSpecifySubCategoryWarranty,driver);
		 itemSpecifySubCategoryWarranty.click();
		 isvisible(itemSpecifySubCategoryListWarrantymanufactuer,driver);
		 itemSpecifySubCategoryListWarrantymanufactuer.click();
		 isvisible(sellingBackButton,driver);
		 sellingBackButton.click();
		 		 
	 }
	 
	 public void clickAndAddDescriptionCategory(String description)
	 {
		 isvisible(decriptionCategory,driver);
		 decriptionCategory.click();
		 isvisible(decriptionCategoryEdit,driver);
		 decriptionCategoryEdit.sendKeys(description);
		 isvisible(sellingBackButton,driver);
		 sellingBackButton.click();		 	
	 }
	 
	 public void scrollAndClickFormatAndPriceCategory(String price){
		 
		 isvisible(conditon,driver);
	     scrollDown(driver,decriptionCategory,photo);
	     isvisible(formatAndPrice,driver);
	   	 formatAndPrice.click();
		 isvisible(pricePut,driver);
		 pricePut.click();	
		 isvisible(formatAndPriceBuyItNow,driver);
		 formatAndPriceBuyItNow.sendKeys(price);
		 isvisible(sellingBackButton,driver);
		 sellingBackButton.click();		

	    }
	 
	 public void shipingAndPickUpCategorySubCategoryClick() {
		 
		 isvisible(shipingAndPickUpCategory,driver);
		 shipingAndPickUpCategory.click();
         isvisible(addShippinAddress,driver);
         addShippinAddress.click();
         isClickable(shippingAddressFlatRate,driver);
         shippingAddressFlatRate.click();
         isvisible(shippingAddressOk,driver);
         shippingAddressOk.click();
         isvisible(sellingBackButton,driver);
		 sellingBackButton.click();		
		 
	 }
	 
	 public void shipingItemContinueClick() {
    	 isvisible(shipingItemContinue,driver);
    	 shipingItemContinue.click();
		 
	 
    }}
