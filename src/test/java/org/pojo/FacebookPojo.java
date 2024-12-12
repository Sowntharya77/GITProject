package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.BaseClass;

public class FacebookPojo extends BaseClass {
	//1.Non parameterized constructor
			public FacebookPojo() {
				PageFactory.initElements(driver, this);	
			}
			
			@FindBy(xpath="//a[text()='Create new account']")
			private WebElement createaccount;
			
			@FindBy(name="firstname")
			private WebElement firstname;

			@FindBy(name="lastname")
			private WebElement secondname;
			
			@FindBy(name="reg_email__")
			private WebElement mobilenum;

			@FindBy(name="reg_passwd__")
			private WebElement newpassword;
			
			//Getter

			public WebElement getCreateaccount() {
				return createaccount;
			}

			public WebElement getFirstname() {
				return firstname;
			}

			public WebElement getSecondname() {
				return secondname;
			}

			public WebElement getMobilenum() {
				return mobilenum;
			}

			public WebElement getNewpassword() {
				return newpassword;
			}


			
			
		

}
