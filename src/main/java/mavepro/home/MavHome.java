package mavepro.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import mavepro.mavepro.Log;
import mavepro.mavepro.UiHelper;

public class MavHome {
	private static WebDriver driver;
	
	By element_enter_code_button = new By.ByClassName("android.widget.Button");
	By element_scan_code_button = new By.ByXPath("button[text()= 'Scan the code')]");	
	
	
	public void clickEnterTheCodeButton(){
		UiHelper.click(element_enter_code_button);
	}




	public void enterTheCodeButtonIsExists() {
		Log.logVerify("Check that 'Enter the Code' button is exist on home page");
		boolean t = UiHelper.isVisibleAndDisplayed(element_enter_code_button);
		if(t){
			Log.logPass("Enter the Code Button is visible in home page");
			Assert.assertTrue(t);
		}else{
			Log.logFail("Enter the Code Button is visible in home page","Enter the Code button is missing on home page");
			Assert.assertTrue(t);
		}
		
	}
	public void clickOnRegisterButton(String buttonText){
		List<WebElement> listOfbuttons = UiHelper.getElements(element_enter_code_button);
		for(WebElement button:listOfbuttons){
			if(button.getText().equalsIgnoreCase(buttonText)){
				button.click();
				break;
			}
		}
	}




	public void scanTheCodeButtonIsExits() {
		Log.logVerify("Check that 'Scan the Code' button is exist on home page");
		boolean t = UiHelper.isVisibleAndDisplayed(element_enter_code_button);
		if(t){
			Log.logPass("Scan the Code Button is visible in home page");
			Assert.assertTrue(t);
		}else{
			Log.logFail("Scan the Code Button is visible in home page","Scan the Code button is missing on home page");
			Assert.assertTrue(t);
		}
		
	}
	
	

}
