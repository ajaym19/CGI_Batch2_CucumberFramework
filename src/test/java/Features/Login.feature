Feature: OrangeHRM Login Functionality

Scenario: Test Login Functionality with Valid credentials
Given User is on Login Page
When user enters the username
And user enters password
And user clicks on Login Button
Then User should be able to login successfully

Scenario: Test Login Functionality with InValid credentials
Given User is on Login Page
When user enters invalid username
And user enters invalid password
And user clicks on Login Button
Then User should not be able to login successfully