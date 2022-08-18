package stepDefinations;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import PageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage loginpage;
	public static Logger logger;
	
     
	
	
	public static String randomString()
	{
		String genreteString=RandomStringUtils.randomAlphabetic(5);
		return genreteString;
	}
	
	
}
