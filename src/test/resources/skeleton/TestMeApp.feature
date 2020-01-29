Feature: Login

In order to purches product from TestMeApp
As a user
I need to register

Bussiness Rule:
	-register can only do the  login with "Lalitha" and "Password123"
	- atleast one item in the cart

Questions:
	-can we purches product in TestMeApp as a guest user
	
#Scenario:  Successful Login
#Given User is on login page
# User enter username correct
#Then  user can go to login page

@UserLogin
Scenario Outline: The one where the user logins with given credentials
Given user is on login page
When user enter username as "<UserName>"
And user enter password as "<Password>"
And user clicks on login button
Then user can do successfully login
Examples:
|UserName|Password   |
|Lalitha |Password123|
|Admin   |Password456| 