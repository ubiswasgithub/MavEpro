package mavepro.mavepro;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import mavepro.home.MavHome;
import pdfreport.PdfLog;

import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class MavHomeTest extends AbstractTest {

	MavHome objHome = new MavHome();

	@Test(groups={"MavHome"}, description = "Test case to verify Epro home")
	public void verifyHome() {
		objHome.enterTheCodeButtonIsExists();
		objHome.scanTheCodeButtonIsExits();
		objHome.clickOnRegisterButton("Enter the code");
	}

	@BeforeMethod
	public void beforeMethod(Method method) {
		PdfLog.clearActionResultStatusList();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		
	}

}
