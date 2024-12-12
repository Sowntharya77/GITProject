package org.stepdefinition;//challenge 1

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartLogin extends BaseClass{
	
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To launch the url of the flipkart application")
	public void to_launch_the_url_of_the_flipkart_application() {
		launchUrl("https://affiliate.flipkart.com/login");
	   
	}

	@When("To pass valid email address in email field")
	public void to_pass_valid_email_address_in_email_field() {
		WebElement email= driver.findElement(By.id("inputEmail"));
		email.sendKeys("sowntharyabsc01@gmail.com");	   
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		WebElement password= driver.findElement(By.name("inputPassword"));
		password.sendKeys("sgwdfwd123");  
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		WebElement login= driver.findElement(By.id("submitLogin"));
		login.click();  
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();	
		}

}
