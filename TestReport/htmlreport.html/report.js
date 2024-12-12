$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/IciciReport.feature");
formatter.feature({
  "name": "To verify the ICICI Bank login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify login page with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To open the chrome browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "ICICIbankReport.to_open_the_chrome_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of ICICI Bank website",
  "keyword": "When "
});
formatter.match({
  "location": "ICICIbankReport.to_launch_the_url_of_ICICI_Bank_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the getuser option",
  "keyword": "And "
});
formatter.match({
  "location": "ICICIbankReport.to_click_the_getuser_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the userId in userId field",
  "keyword": "And "
});
formatter.match({
  "location": "ICICIbankReport.to_enter_the_userId_in_userId_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the password in the password field",
  "keyword": "And "
});
formatter.match({
  "location": "ICICIbankReport.to_enter_the_password_in_the_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "ICICIbankReport.to_click_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the entire browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ICICIbankReport.to_close_the_entire_browser()"
});
formatter.result({
  "status": "passed"
});
});