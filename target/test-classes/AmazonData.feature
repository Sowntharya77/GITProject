Feature: To validate the account creation of amazon application


@Regression
Scenario:To create new account in amazon
Given To launch the chrome browser and maximize the window
When To launch url of amazon application
And To click the account and list option
And To pass the username or mobilenum in username or mobilenum text box
|Jessi|Ramya|Sowntharya|Dharani|
|9857584575|9587577557|6678848438|8745775334|
And To click continue option
Then To close the chrome browser to close the application