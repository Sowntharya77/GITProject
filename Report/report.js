$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FacebookFinal.feature");
formatter.feature({
  "name": "To validate the facebook login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To login with valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "To open the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Final.to_open_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of facebook",
  "keyword": "When "
});
formatter.match({
  "location": "Final.to_launch_the_url_of_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid username",
  "keyword": "And "
});
formatter.match({
  "location": "Final.to_enter_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid password",
  "keyword": "And "
});
formatter.match({
  "location": "Final.to_enter_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Final.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the entire chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Final.to_close_the_entire_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});