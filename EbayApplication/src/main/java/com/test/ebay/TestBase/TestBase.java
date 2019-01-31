package com.test.ebay.TestBase;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.ebay.utility.ConfigReader;
import com.test.ebay.utility.CreateSession;
	
	
	
	public class TestBase {
	
		ConfigReader reader = new ConfigReader();
		public  static  ExtentReports extent;
		public ExtentTest Reportlogger;
		Properties prop = new Properties();
		Test test;
		String testName;
		public  static final Logger  logger = Logger.getLogger(TestBase.class.getName());
		String log4Jpath = System.getProperty("user.dir") + reader.log4jPath();
		
		
	@BeforeSuite
	public void setup() 
	{
			PropertyConfigurator.configure(log4Jpath);
		
			try {
				prop.load(ClassLoader.getSystemResourceAsStream(""));
			} catch (IOException e) {
				e.printStackTrace();
			}
			String filepath ="//"+"ebayReports"+"//" + createFolder() + "//"+timestamp()+reader.ebayAutomationReportPath();
			extent = new ExtentReports(System.getProperty("user.dir") + filepath, false);
			extent.loadConfig(new File(System.getProperty("user.dir") +"//test-output"+ "//extent-config.xml"));
	        
		
	}
	
	@BeforeTest
	public void startApp() throws MalformedURLException
	{
		CreateSession.appStart(reader.os(),reader.deviceName());
	}
	

	@BeforeMethod(alwaysRun = true)
	public void nameBefore(Method method) {
		
		test = method.getAnnotation(Test.class);
		testName = method.getName();		
		Reportlogger = extent.startTest(testName);

	}

	@AfterMethod
	public void getResult(ITestResult result) {
	
		 String screenshotPath = null;
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
				
			 screenshotPath = capture(CreateSession.driver, testName);
			 } catch (Exception e) {
			 e.printStackTrace();
			 }

			Reportlogger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			Reportlogger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
			logger.info("Failed test case is"+ result.getName() );

			Reportlogger.log(LogStatus.FAIL, "Snapshot below: " +
			 Reportlogger.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			Reportlogger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			Reportlogger.log(LogStatus.PASS, "Test case passed is " + result.getName());
		}

		
		extent.endTest(Reportlogger);
	
	}
	 public static String capture(WebDriver instance , String screenShotName) throws IOException {
		 
		 TakesScreenshot ts = (TakesScreenshot) CreateSession.driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 String destination = System.getProperty("user.dir") + "//ScreenShots//"+screenShotName+"in"+timestamp()+".png";
		 File finalDestination = new File(destination);
		 FileUtils.copyFile(source, finalDestination);
		 return destination;
	}
	 

	public String createFolder() {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String time = dateFormat.format(now);
		File dir = new File(time);
		dir.mkdir();
		return dir.toString();
	}
	
    public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	} 
	
		
		
	@AfterTest
	public void appClose()
	{
	  CreateSession.driver.closeApp();
	}
	
	
	@AfterSuite
	
	public void closeExtentReport()
	{
		extent.flush();
    	extent.close();
	}
	
	}
		