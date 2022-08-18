package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	public WebDriver ldriver;

	public WaitHelper(WebDriver rdriver) {
		this.ldriver=rdriver;
	}

	public void waitForElement(WebElement element, Duration i) {
		WebDriverWait wait = new WebDriverWait(ldriver, i);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
