package org.stepdefinition; //challenge 3 without header 1 dimensional list

import java.util.List;
import java.util.Map;

import org.pojo.FacebookPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookDatatable extends BaseClass{
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();  
	}

	@When("To launch url of facebook")
	public void to_launch_url_of_facebook() {
		launchUrl("https://www.facebook.com/");  
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		FacebookPojo f = new FacebookPojo();
		clickBtn(f.getCreateaccount());    
	}

	@When("To pass firstname in the firstname text box")
	public void to_pass_firstname_in_the_firstname_text_box(DataTable d) throws InterruptedException {
		
		Thread.sleep(500);//convert datatable into list 
		List<String> l = d.asList(); //to access 1D list
		FacebookPojo f = new FacebookPojo();
		passText(l.get(2), f.getFirstname());  
	}

	@When("To pass secondname in the secondname text box")
	public void to_pass_secondname_in_the_secondname_text_box(DataTable d) {
		
		Map<String,String> m = d.asMap(String.class, String.class);// access 1D map
		FacebookPojo f = new FacebookPojo();
		passText(m.get("secondname2"), f.getSecondname());
		
	}
	
	@When("To pass mobilenumber or email in email text box")
	public void to_pass_mobilenumber_or_email_in_email_text_box(DataTable d) {
		
		List<Map<String, String>> m = d.asMaps();//access 2D map
		FacebookPojo f = new FacebookPojo();
		passText(m.get(2).get("email"), f.getMobilenum());  
}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box(DataTable d) {
		List<List<String>> l = d.asLists();//to access 2D list
		FacebookPojo f = new FacebookPojo();
		passText(l.get(0).get(1), f.getNewpassword());
	   
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() throws InterruptedException {
		
		Thread.sleep(500);
		closeEntireBrowser();	    
	}


	
}
