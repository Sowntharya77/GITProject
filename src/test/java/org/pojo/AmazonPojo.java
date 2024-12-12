package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.BaseClass;

public class AmazonPojo extends BaseClass {
	//1.Non parameterized constructor
	public AmazonPojo() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement clickaccount;
	
	@FindBy(id="ap_email")
	private WebElement email;

	@FindBy(id="continue")
	private WebElement clickcontinue;
	
	//Getter methods

	public WebElement getClickaccount() {
		return clickaccount;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getClickcontinue() {
		return clickcontinue;
	}


	

	

}
