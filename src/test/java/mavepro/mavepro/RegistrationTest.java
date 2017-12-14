package mavepro.mavepro;

import org.testng.annotations.Test;

import mavepro.register.Registration;
import pdfreport.PdfLog;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RegistrationTest extends AbstractTest{
	Registration objRgs = new Registration();
	
  @Test(groups={"Registration"}, description = " Test case to verify Registration process")
  public void verifyRegistration() {
	 objRgs.registrationCodeTextFieldIsExits();
	 objRgs.enterRegistrationCode();
	 objRgs.submitButtonIsExists();
	 objRgs.clickonSubmitButton();
	 objRgs.registrationSucceedMsgIsExists();
	 objRgs.continueButtonIsExists();
	 objRgs.clickonContinueButton();
  }
  @BeforeMethod
  public void beforeMethod() {
	  PdfLog.clearActionResultStatusList();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
