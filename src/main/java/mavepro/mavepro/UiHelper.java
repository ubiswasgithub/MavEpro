package mavepro.mavepro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UiHelper {

	public static void click(By el) {
		AbstractTest.getDriver().findElement(el).click();
	}

	public static boolean isVisibleAndDisplayed(By el) {
		boolean t;
		try {
			if (AbstractTest.getDriver().findElement(el).isDisplayed()
					&& AbstractTest.getDriver().findElement(el).isEnabled()) {
				t = true;
			} else
				t = false;
		} catch (Exception e) {
			t = false;
		}
		return t;
	}

	public String getText(By el) {
		String txt = null;
		try {
			txt = AbstractTest.getDriver().findElement(el).getText();
		} catch (Exception e) {
			txt = null;
		}

		return txt;
	}

	public static void enterText(By el, String txt) {
		if (AbstractTest.getDriver().findElement(el).isDisplayed()) {
			AbstractTest.getDriver().findElement(el).clear();
			AbstractTest.getDriver().findElement(el).sendKeys(txt);
		}

	}

	boolean matchedToHeader(By el, String txt) {
		boolean b = false;
		try {
			if (getText(el).equalsIgnoreCase(txt)) {
				b = true;
			}
		} catch (Exception e) {
			b = false;
		}

		return b;

	}

	public boolean matchedSelectedCountry(By el, String txt) {
		boolean b = false;
		try {
			if (getText(el).equalsIgnoreCase(txt)) {
				b = true;
			}
		} catch (Exception e) {
			b = false;
		}

		return b;
	}

	public static List<WebElement> getElements(By el) {
		return AbstractTest.getDriver().findElements(el);

	}

}
