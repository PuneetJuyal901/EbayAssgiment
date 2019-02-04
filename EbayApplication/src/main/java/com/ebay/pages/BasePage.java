package com.ebay.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class BasePage {
	public AndroidDriver<WebElement>driver;

	public static final Logger logger = Logger.getLogger(BasePage.class.getName());
	
	public BasePage(AndroidDriver<WebElement>driver)
	{
		this.driver=driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver), this);
		
	}
	
	public  boolean isClickable(WebElement element,  AndroidDriver<WebElement>driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			logger.info("Element which is not clickable is" +e.getMessage());
			return false;
		}
	}
	

	public boolean  isvisible(WebElement element, AndroidDriver<WebElement>driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf((element))); 
			return true;

		} catch (Exception e) {
			logger.info("Element not visible is " +e.getMessage());
			return false;
		}
	}

	public  boolean isNotVisible(WebElement element,AndroidDriver<WebElement>driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.invisibilityOf(element));
			return true;
		} catch (Exception e) {
			logger.info("Element which is not  visible is " +e.getMessage());
			return false;
		}
	}
	
	public void clickOnAppBackButton(AndroidDriver<WebElement>driver)
	{
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public void clickOnAppHomeButton(AndroidDriver<WebElement>driver)
	{
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
	
	public void scrollTillWarranty(AndroidDriver<WebElement>driver)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Warranty\"));");
	}
	
	public void scrollTillFormatAPrice(AndroidDriver<WebElement>driver)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(index(\"7\"));");
	}
	
	public void scrollDown(AndroidDriver<WebElement>driver,WebElement element1,WebElement element2) {
		TouchAction action = new TouchAction(driver);
		
		action.longPress(element(element1)).moveTo(element(element2)).release().perform();
	     
	}
	
	public void switchToAlert(AndroidDriver<WebElement>driver)
	{
		driver.switchTo().alert();
	}
 
	}
	
	

	


	
	


