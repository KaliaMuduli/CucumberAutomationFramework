/**
 * 
 */
package stepDefinations;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Kalia Muduli
 *
 */
public class LoginSteps extends BaseClass {

	

	@Given("User Launch Chrome Web Browser")
	public void user_launch_chrome_web_browser() {
		logger=LogManager.getLogger(LoginSteps.class);
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage = new LoginPage(driver);
		logger.info("=========This is logger info==============");
		System.out.println("Chrome WebBrowser launched succeesfully");
		logger.error("Chrome WebBrowser launched succeesfully");
		logger.fatal("This is logger warn");
		logger.debug("Test Debug log");
		
		
	}

	@When("User Open {string} page")
	public void user_open_page(String url) {
		logger.info("=========This is logger info==============");
		driver.get(url);
		System.out.println("URL Opened :" + url);
	}

	@And("User NavigteTo Login Page")
	public void user_navigte_to_login_page() {
		loginpage.navigateTologinPage();
		System.out.println("Navigated to Login Page");
	}

	@And("User enter {string}")
	public void user_enter(String username) {
		loginpage.enterUsername(username);
		System.out.println("Entered UserName :" + username);
	}

	@And("User enters {string}")
	public void user_enters(String password) {
		loginpage.enterPassword(password);
		System.out.println("Entered password :" + password);
	}

	@And("User click Login button")
	public void user_click_login_button() {
		loginpage.clickLogin();
		System.out.println("User Clicked Login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		if (driver.getPageSource().contains("Login was unsuccessful")) {
			System.out.println("User Login Successfully");
		} else {
			System.out.println("User Login Failed!");
		}
	}

	@And("Close the browser")
	public void close_the_browser() {

		driver.quit();
		System.out.println("WebBrowser closed");
	}

}
