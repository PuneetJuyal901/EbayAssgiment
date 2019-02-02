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
	 
	 public void startSellingNowButtonClick()
	 {
		 isvisible(startSellingNowButton,CreateSession.driver);
		 startSellingNowButton.click();
	 }
	 
	 public void sellingItemSearchClick(String productName) {

		 isvisible(sellingItemSearch,CreateSession.driver);
		 sellingItemSearch.sendKeys(productName);
		 
	 }
	 
	 public void sellingItemSerachListClick() {
		 isvisible(sellingItemSerachList,CreateSession.driver);
		 sellingItemSerachList.click();
		 
		 
	 }
	 
	 public void categoryAudioAndHomeClick() {
		 
		 isvisible(categoryAudioAndHome,CreateSession.driver);
		 categoryAudioAndHome.click();
		 
	 }
	 
	 public void subCategoryBluetoothAndSpeakersClick(){
		 isvisible(subCategoryBluetoothAndSpeakers,CreateSession.driver);
		 subCategoryBluetoothAndSpeakers.click();
	 }
	 
	 public void clickOnItemImageClick(){
		 isvisible(clickOnItemImage,CreateSession.driver);
		 clickOnItemImage.click();
		 	 
	 }
	 
	 public void conditonClick(){
		 isvisible(conditon,CreateSession.driver);
		 conditon.click(); 	 
	 }
	 
	 public void conditonSubCategoryNewClick(){
		 isvisible(conditonSubCategoryNew,CreateSession.driver);
		 conditonSubCategoryNew.click();
		 
	 }
	 
	 public void sellingBackButtonClick(){
		 isvisible(sellingBackButton,CreateSession.driver);
		 sellingBackButton.click();
	 }
	 
	 public void itemSpecifyCategoryClick() {
		 isvisible(itemSpecifyCategory,CreateSession.driver);
		 itemSpecifyCategory.click();
		 
	 }
	 public void itemSpecifySubCategoryClick() {
		 isvisible(itemSpecifySubCategory,CreateSession.driver);
		 itemSpecifySubCategory.click();
	 }
	 
	 public void itemSpecifySubCategoryListUnbrandedClick() {
		 isvisible(itemSpecifySubCategoryListUnbranded,CreateSession.driver);
		 itemSpecifySubCategoryListUnbranded.click();
	 }
	 
	 public void itemSpecifySubCategoryListTypeClick(){
		 isvisible(itemSpecifySubCategoryListType,CreateSession.driver);
		 itemSpecifySubCategoryListType.click();
	 }
	 
	 public void itemSpecifySubCategoryTypeInEarClick() {
		 isvisible(itemSpecifySubCategoryTypeInEar,CreateSession.driver);
		 itemSpecifySubCategoryTypeInEar.click();
	 }
	 
	 public void itemSpecifySubCategoryMaxRetailPriceClick(){
		 isvisible(itemSpecifySubCategoryMaxRetailPrice,CreateSession.driver);
		 itemSpecifySubCategoryMaxRetailPrice.click();
	 }
	 
	 public void itemSpecifySubCategoryMaxRetailPriceListDontApplyClick() {
		 isvisible(itemSpecifySubCategoryMaxRetailPriceListDontApply,CreateSession.driver);
		 itemSpecifySubCategoryMaxRetailPriceListDontApply.click();
	 }
	 
	 public void itemSpecifySubCategoryMpnClick() {
		 isvisible(itemSpecifySubCategoryMpn,CreateSession.driver);
		 itemSpecifySubCategoryMpn.click(); 
	 }
	 
	 public void itemSpecifySubCategoryListMpnDoesNotAplyClick() {
		 isvisible(itemSpecifySubCategoryListMpnDoesNotAply,CreateSession.driver);
		 itemSpecifySubCategoryListMpnDoesNotAply.click();
	 }
	 
	 public void itemSpecifySubCategoryManfactuerDetailsClick() {
		 isvisible(itemSpecifySubCategoryManfactuerDetails,CreateSession.driver);
		 itemSpecifySubCategoryManfactuerDetails.click();	 
	 }
	 
	 public void itemSpecifySubCategoryListManfactuerDetailsSeeDescrptionClick() {	 
	     isvisible(itemSpecifySubCategoryListManfactuerDetailsSeeDescrption,CreateSession.driver);
	     itemSpecifySubCategoryListManfactuerDetailsSeeDescrption.click();
	 }
	 
	 public void itemSpecifySubCategoryNetQuanClick(){
		 isvisible(itemSpecifySubCategoryNetQuan,CreateSession.driver);
		 itemSpecifySubCategoryNetQuan.click();
	 }
	 
	 public void itemSpecifySubCategoryListNetQuanDoNotApplyClick() {
		 isvisible(itemSpecifySubCategoryListNetQuanDoNotApply,CreateSession.driver);
		 itemSpecifySubCategoryListNetQuanDoNotApply.click();
	 }
	 
	 public void itemSpecifySubCategoryPackageDimensionClick()
	 {
		 isvisible(itemSpecifySubCategoryPackageDimension,CreateSession.driver);
		 itemSpecifySubCategoryPackageDimension.click();
		 
	 }
	 
	 public void itemSpecifySubCategoryListPackageDimesnionDoNotApplyClick() {
		 isvisible(itemSpecifySubCategoryListPackageDimesnionDoNotApply,CreateSession.driver);
		 itemSpecifySubCategoryListPackageDimesnionDoNotApply.click();
		 
	 }
	 
	 public void itemSpecifySubCategoryWithWithoutMicClick() {
		 isvisible(itemSpecifySubCategoryWithWithoutMic,CreateSession.driver);
		 itemSpecifySubCategoryWithWithoutMic.click();
	 }
	 
	 public void itemSpecifySubCategoryListWithWithoutMicWithMicClick() {
	 isvisible(itemSpecifySubCategoryListWithWithoutMicWithMic,CreateSession.driver);
	 itemSpecifySubCategoryListWithWithoutMicWithMic.click();
	 }
	 
	 
	 public void itemSpecifySubCategoryDateOfPackingClick() {
		 isvisible(itemSpecifySubCategoryDateOfPacking,CreateSession.driver);
		 itemSpecifySubCategoryDateOfPacking.click();
	 }
	 
	 public void itemSpecifySubCategoryListDateOfPackingDoesNotApplyClick () {
		 isvisible(itemSpecifySubCategoryListDateOfPackingDoesNotApply,CreateSession.driver);
	     itemSpecifySubCategoryListDateOfPackingDoesNotApply.click();

	  }
	 
	 public void itemSpecifySubCategoryConsumerComplaintsClick() {
		 isvisible(itemSpecifySubCategoryConsumerComplaints,CreateSession.driver);
		 itemSpecifySubCategoryConsumerComplaints.click();
		 
	 }
	 
	 public void itemSpecifySubCategoryListConsumerComplaintsClick() {
		 isvisible(itemSpecifySubCategoryListConsumerComplaints,CreateSession.driver);
		 itemSpecifySubCategoryListConsumerComplaints.click();
	 }
	 
	 public void itemSpecifySubCategoryCountryOfOriginClick()
	 {
		 isvisible(itemSpecifySubCategoryCountryOfOrigin,CreateSession.driver);
		 itemSpecifySubCategoryCountryOfOrigin.click();
	 }
	 
     public void itemSpecifySubCategoryListCountryOfOriginOfOwnClick() {
	 isvisible(itemSpecifySubCategoryListCountryOfOriginOfOwn,CreateSession.driver);
	 itemSpecifySubCategoryListCountryOfOriginOfOwn.click();
     }
     
     public void itemSpecifySubCategoryCountryOfOriginEnterClick(String country) {
		 isvisible(itemSpecifySubCategoryCountryOfOriginEnter,CreateSession.driver);
		 itemSpecifySubCategoryCountryOfOriginEnter.sendKeys(country);
    	 
     }
     
    public void itemSpecifySubCategoryCountryOfOriginokClick() {
 		 isvisible(itemSpecifySubCategoryCountryOfOriginok,CreateSession.driver);
		 itemSpecifySubCategoryCountryOfOriginok.click();
    	 
     }
  
    public void itemSpecifySubCategoryWarrantyScrollAndClick() {
    	 scrollTillWarranty(CreateSession.driver);
		 isvisible(itemSpecifySubCategoryWarranty,CreateSession.driver);
		 itemSpecifySubCategoryWarranty.click();
     }
  
    public void itemSpecifySubCategoryListWarrantymanufactuerClick() {
    	 isvisible(itemSpecifySubCategoryListWarrantymanufactuer,CreateSession.driver);
		 itemSpecifySubCategoryListWarrantymanufactuer.click();
	  
    }
    
    public void decriptionCategoryClick()
    {
    	isvisible(decriptionCategory,CreateSession.driver);
		decriptionCategory.click();
		 	
    }
    
    public void decriptionCategoryEdit(String description)
    {
   	 isvisible(decriptionCategoryEdit,CreateSession.driver);
	 decriptionCategoryEdit.sendKeys(description);
	 
    }
    
    public void scrollDown()
    {
   	  isvisible(conditon,CreateSession.driver);
      scrollDown(CreateSession.driver,decriptionCategory,photo);
    }
    
    public void formatAndPriceClick()
    {
    	isvisible(formatAndPrice,CreateSession.driver);
		formatAndPrice.click();
    }
    
    public void pricePutClick()
    {
    	isvisible(pricePut,CreateSession.driver);
		 pricePut.click();
    }
    
    public void formatAndPriceBuyItNowEdit(String price)
    {
		 isvisible(formatAndPriceBuyItNow,CreateSession.driver);
		 formatAndPriceBuyItNow.sendKeys(price);

		 
    }
    
    public void shipingAndPickUpCategoryClick() {
    isvisible(shipingAndPickUpCategory,CreateSession.driver);
	 shipingAndPickUpCategory.click();
    }
    
    public void addShippinAddressClick()
    {
    	 isvisible(addShippinAddress,CreateSession.driver);
		 addShippinAddress.click();
    }
    
    public void shippingAddressFlatRateClick(){
    	
		 isClickable(shippingAddressFlatRate,CreateSession.driver);
		 shippingAddressFlatRate.click();
    }
    
    public void shippingAddressOk() {
    	 isvisible(shippingAddressOk,CreateSession.driver);
		 shippingAddressOk.click();
		
    }
    
    public void shipingItemContinueClick() {
    	 isvisible(shipingItemContinue,CreateSession.driver);
		 shipingItemContinue.click();
		 
		 
    }
    
}
