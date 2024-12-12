package org.stepdefinition; //challenge 6  use tagged hooks and Generate report

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ICICIbankReport extends BaseClass {
	
	@Given("To open the chrome browser and maximize the window")
	public void to_open_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
}
	@When("To launch the url of ICICI Bank website")
	public void to_launch_the_url_of_ICICI_Bank_website() {
	launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
}

	@When("To click the getuser option")
	public void to_click_the_getuser_option() {
		WebElement getuser= driver.findElement(By.id("user-id-goahead"));
		getuser.click();
}

	@When("To enter the userId in userId field")
	public void to_enter_the_userId_in_userId_field() {
		WebElement name= driver.findElement(By.xpath("//input[@title='User Id']"));
		name.sendKeys("Sowntharya");
}
	
	@When("To enter the password in the password field")
	public void to_enter_the_password_in_the_password_field() {
		WebElement pw= driver.findElement(By.xpath("//input[@title='Password']"));
		pw.sendKeys("gefuFDF637");	
	
}

	@When("To click Submit button")
	public void to_click_Submit_button() {
		WebElement login= driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
		closeEntireBrowser();
}

}
