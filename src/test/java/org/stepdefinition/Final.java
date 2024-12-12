package org.stepdefinition; //challenge 7 create report json,junit,html

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Final extends BaseClass {
	@Given("To open the browser and maximize the window")
	public void to_open_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of facebook")
	public void to_launch_the_url_of_facebook() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To enter valid username")
	public void to_enter_valid_username() {
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("dheepishree");
	   
	}

	@When("To enter valid password")
	public void to_enter_valid_password() {
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("sowNthi4!");
	   
	}

	@When("To click login button")
	public void to_click_login_button() {
		WebElement login= driver.findElement(By.name("login"));
		login.click(); 
	}

	@Then("To close the entire chrome browser")
	public void to_close_the_entire_chrome_browser() throws InterruptedException {
		Thread.sleep(500);
		closeEntireBrowser();	
	}



}
