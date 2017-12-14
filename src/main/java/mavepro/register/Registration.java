package mavepro.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.google.common.base.Verify;

import mavepro.mavepro.Log;
import mavepro.mavepro.UiHelper;

public class Registration {

	By element_registration_code = new By.ByClassName("android.widget.EditText");
	By element_submit_button = new By.ByClassName("android.widget.Button");
	By element_registration_succeed_msg = new By.ByClassName("android.widget.TextView");
	By element_continue_button = new By.ByClassName("android.widget.Button");

	private String rgistration_code = "1234";

	public void registrationCodeTextFieldIsExits() {
		Log.logVerify("Check that Registration Code text box is present");
		boolean t = UiHelper.isVisibleAndDisplayed(element_registration_code);
		if (t) {
			Log.logPass("Registration code text box is found");
			Assert.assertTrue(t);
		} else {
			Log.logFail("Registration code text box is found", "Registration code text box not found");
			Assert.assertFalse(t);

		}

	}

	public void enterRegistrationCode() {
		UiHelper.enterText(element_registration_code, rgistration_code);
	}

	public void submitButtonIsExists() {

		Log.logVerify("Check that Submit button is present");
		boolean t = UiHelper.isVisibleAndDisplayed(element_submit_button);
		if (t) {
			Log.logPass("Submit button is found");
			Assert.assertTrue(t);
		} else {
			Log.logFail("Submit button is found", "Submit button not found");
			Assert.assertFalse(t);
		}

	}

	public void clickonSubmitButton() {

		UiHelper.click(element_registration_succeed_msg);
		UiHelper.click(element_submit_button);

	}

	public void clickonContinueButton() {

		UiHelper.click(element_continue_button);
	}

	public void continueButtonIsExists() {

		Log.logVerify("Check that Continue button is present");
		boolean t = UiHelper.isVisibleAndDisplayed(element_continue_button);
		if (t) {
			Log.logPass("Continue button is found");
			Assert.assertTrue(t);
		} else {
			Log.logFail("Continue button is found", "Continue button not found");
			Assert.assertFalse(t);
		}
	}

	public void registrationSucceedMsgIsExists() {

		Log.logVerify("Check that Registration Succeeded Message is present");
		boolean t = UiHelper.isVisibleAndDisplayed(element_registration_succeed_msg);
		if (t) {
			Log.logPass("Registration Succeeded Message is found");
			Assert.assertTrue(t);
		} else {
			Log.logFail("Registration Succeeded Message is found", "Registration Succeeded Message not found");
			Assert.assertFalse(t);
		}
	}

}
