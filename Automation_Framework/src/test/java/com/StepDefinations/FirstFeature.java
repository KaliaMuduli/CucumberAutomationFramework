package com.StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstFeature {
	
	
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		System.out.println("This is Step-1");
	     
	}

	@When("^User enter (.+) and (.+)$")
    public void user_enter_and(String username, String password) {
	   driver.findElement(By.name("username")).sendKeys(username); 
	   driver.findElement(By.name("password")).sendKeys(password);
	   System.out.println("This is Step-2");
	   
	}
	
	@When("User enter credential using DataTable")
	public void user_enter_credential_using_data_table(DataTable dataTable) {
		List<List<String>> data=dataTable.cells();
		
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0)); 
		   driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		   System.out.println("This is Step-2");
	}

	@And("click login button")
	public void click_login_button() {
	//	driver.findElement(By.xpath("//input[@name='password']//following::input[1]")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println("This is Step-3");
		
	}

	@Then("User should login to OrangeHRM successfully")
	public void user_should_login_to_orange_hrm_successfully() {
		
		
	  driver.quit();
	  System.out.println("This is Step-4");
	}


}
