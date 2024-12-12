Feature: To validate the facebook login page


@Smoke
Scenario: To login with valid username and password 
Given To open the browser and maximize the window
When To launch the url of facebook
And To enter valid username
And To enter valid password
And To click login button 
Then To close the entire chrome browser

