package mavepro.mavepro;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.AfterTest;

public class AbstractTest {

	protected static WebDriver driver = null;
	protected static ExtentReports extent;
	protected static ExtentTest logger;

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite(ITestContext testContext) {

	}
	@Parameters({"testDeviceName","testPlatformVersion", "testPort"})
	@BeforeTest(alwaysRun = true)
	public void appiumTestSetUp(String testDeviceName, String testPlatformVersion, String testPort) throws MalformedURLException, InterruptedException {
		Log.logInfo("Starting Regression Test on device = "+testDeviceName+" at Port "+testPort);
		/*extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",true);
		extent
			.addSystemInfo("Host Name", "Software Testing MAV")
			.addSystemInfo("User Name", "ubiswas")
			.addSystemInfo("Environment", "Automation Test extent report");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));*/
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("deviceName", Configuration.testDeviceName);
//		capabilities.setCapability("platformVersion", Configuration.testPlatformVersion);
		capabilities.setCapability("deviceName", testDeviceName);
		capabilities.setCapability("platformVersion", testPlatformVersion);
		capabilities.setCapability("platformName", Configuration.testPlatformName);
		capabilities.setCapability("browserName", Configuration.testBrowserName);

		capabilities.setCapability("appPackage", Configuration.testAppPackage);
		capabilities.setCapability("appActivity", Configuration.testAppActivity);
		
		Log.logInfo("Initializing appium remote driver...");

//		driver = new RemoteWebDriver(new URL(Configuration.testAppiumServer), capabilities);
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:"+testPort+"/wd/hub"), capabilities);
		Utils.waitForDuration(driver, 5);
		Utils.pauseDriverForDuration(10000);

	}

	@AfterTest
	public void appiumTestTearDown() {
		Log.logInfo("Quit appium remote driver and finish the test..");
		
		if (driver != null) {
			/*extent.flush();
			extent.close();*/
			driver.quit();
		}

	}

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
	
}
