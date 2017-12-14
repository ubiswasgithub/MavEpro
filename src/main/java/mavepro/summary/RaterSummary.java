package mavepro.summary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import mavepro.mavepro.Log;
import mavepro.mavepro.UiHelper;

public class RaterSummary {
	
	By element_good_morining_message = By.className("android.widget.TextView");
	
	String welcome_text  = "Good Morning";

	public void welcomeMessageIsExists() {
		Log.logVerify("Check that page is welcome message to rater");
		boolean t = isTextIsCorrect(welcome_text);
		if(t){
			Log.logPass("Welcome message is displayed");
			Assert.assertTrue(t);
		}else{
			Log.logFail("Welcome message is displayed","Welcome morning message is not displayed");			
			Assert.assertTrue(t);
		}
	}
	
	public boolean isTextIsCorrect(String txt){
		boolean t = false;
		List<WebElement> listOfelements = UiHelper.getElements(element_good_morining_message);
		for(WebElement element:listOfelements){
			if(element.getText().equalsIgnoreCase(txt)){
				t = true;
				break;
			}
		}
		return t;
	}

}
