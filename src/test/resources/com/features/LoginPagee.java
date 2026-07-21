Feature: Login page feature

@smoke
Scenario: Verify Login page
Given User is on the login page
#Then Title of login page displayed as "actiTIME -Login  "
Then Username field is displayed
And Password field is displayed
And keep me logged in checkbox is displayed
And login button is displayed
And login logos is displayed 

@smoke @Regression
Scenario: Validate Login Functionality
Given User is on the login page
When User enters username
And User enters password
And User clicks on login button
#Then page title displayed as "actiTime -  Enter Time-Track   "
Then Dashboard page is displayed

Automation changes
