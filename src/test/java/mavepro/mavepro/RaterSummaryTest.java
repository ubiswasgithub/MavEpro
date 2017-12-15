package mavepro.mavepro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mavepro.summary.RaterSummary;
import pdfreport.PdfLog;



public class RaterSummaryTest extends AbstractTest {
	RaterSummary objSummary = new RaterSummary();
	
  @Test (alwaysRun = true)
  public void verifyRaterSummaryInformation() {
	  objSummary.welcomeMessageIsExists();
  }
  @BeforeMethod (alwaysRun = true)
  public void beforeMethod() {
	  PdfLog.clearActionResultStatusList();
  }

  @AfterMethod
  public void afterMethod() {
	 
  }

}
