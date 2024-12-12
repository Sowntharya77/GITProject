Feature: To verify the ICICI Bank login page


@Sanity
Scenario: To verify login page with valid username and invalid password
Given To open the chrome browser and maximize the window 
When To launch the url of ICICI Bank website 
And To click the getuser option 
And To enter the userId in userId field
And To enter the password in the password field
And To click Submit button
Then To close the entire browser

