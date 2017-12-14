package mavepro.mavepro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Utils {
	public static void waitForDuration(WebDriver drv, int duration) {
		drv.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);

	}
	
	
	public static void pauseDriverForDuration(int durationMiliSeconds) throws InterruptedException{
		Thread.sleep(durationMiliSeconds);
	}
}
