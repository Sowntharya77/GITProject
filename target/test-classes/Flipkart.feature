Feature:To verify the login functionality of flipkart application


Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the chrome browser and maximize window
When User has to give the url of the flipkart application
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click login button
Then User has to close the browser

Examples:
|emaildatas            |passworddatas|
|sowtharya23@gmail.com |SSF43@Ds     |
|dharshini60@gmail.com |hfC543vdgd   |
|deepthi23@gmail.com   |fhsf4fsw     |
