package org.stepdefinition; //challenge 4 using snippets 

import java.util.List;
import org.pojo.AmazonPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonSigin extends BaseClass{
	
	@Given("To launch the chrome browser and maximize the window")
	public void toLaunchTheChromeBrowserAndMaximizeTheWindow() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch url of amazon application")
	public void toLaunchUrlOfAmazonApplication() {
		launchUrl("http://www.amazon.in");  
	}
	@When("To click the account and list option")
	public void toClickTheAccountAndListOption() {
		AmazonPojo a = new AmazonPojo();
		clickBtn(a.getClickaccount() );    
	}
	@When("To pass the username or mobilenum in username or mobilenum text box")
	public void toPassTheUsernameOrMobilenumInUsernameOrMobilenumTextBox(DataTable d)throws InterruptedException  {
		Thread.sleep(500);
		
	     List<String> l = d.asList(); //convert datatable into list
		AmazonPojo a = new AmazonPojo();
		passText(l.get(3), a.getEmail());
	}
	@When("To click continue option")
	public void toClickContinueOption() {
		AmazonPojo a = new AmazonPojo();
		clickBtn(a.getClickcontinue()); 
	}
	@Then("To close the chrome browser to close the application")
	public void toCloseTheChromeBrowserToCloseTheApplication() {
		closeEntireBrowser();
	}

}
