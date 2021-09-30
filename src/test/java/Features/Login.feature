Feature: OrangeHRM Login Functionality

#Scenario: Test Login Functionality with Valid credentials
#Given User is on Login Page
#When user enters username
#And user enters password
#And user clicks on Login Button
#Then User should be able to login successfully

#Scenario: Test Login Functionality with InValid credentials
#Given User is on Login Page
#When user enters invalid username
#And user enters invalid password
#And user clicks on Login Button
#Then User should not be able to login successfully

#Scenario: Test Login using parameters
#Given User is on Login Page
#When User enters username as "Admin"
#And User enters password as "admin123"
#And user clicks on Login Button
#Then User should be able to login successfully

Scenario Outline: Login feature using scenario outline
Given User is on Login Page
When User enters <username> and <password>
And user clicks on Login Button
Then User should be able to login successfully
Examples:
	|username|password|
	|Admin|admin123|
	|test|test123|
	|abc|abc123|
