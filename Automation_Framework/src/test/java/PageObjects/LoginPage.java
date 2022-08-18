/**
 * 
 */
package PageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

/**
 * @author Kalia Muduli
 *
 */
public class LoginPage {
	public WebDriver ldriver;
	WaitHelper waithelper;
	

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper=new WaitHelper(ldriver);
	}
	
	
	@FindBy(xpath = "(//*[local-name()='svg'])[2]")
	@CacheLookup
	WebElement icon_Login;
	
	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	@CacheLookup
	WebElement link_Login;

	@FindBy(id = "Username")
	@CacheLookup
	WebElement txtUserMail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtUserPassword;

	@FindBy(xpath = "//input[@value='Log in']")
	@CacheLookup
	WebElement btnLogIn;

	public void navigateTologinPage()
	{
		waithelper.waitForElement(icon_Login, Duration.ofSeconds(20));
		icon_Login.click();
		waithelper.waitForElement(link_Login, Duration.ofSeconds(20));
		link_Login.click();
	}

	public void enterUsername(String username) {
		txtUserMail.clear();
		txtUserMail.sendKeys(username);
	}

	public void enterPassword(String password) {
		txtUserPassword.clear();
		txtUserPassword.sendKeys(password);
	}

	public void clickLogin()  {
		btnLogIn.click();
		
	}
	
	public void logout()  {
		ldriver.close();
		
	}
}
