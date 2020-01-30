Feature: Register for TestMeApp
 In order to login in TestMe App
As a user
I need to register first

Business rules:
 - Ony registered users can do the login
 - user should provide all the necessary details on registration page
 
To Do:
 -  password should have more than 8 characters 
 

  @register
  Scenario: The one where the user create login account for TestMeApp
    Given User is on Register page
    When User enter username as "Pooja"
    And User enter first name as "Pooja"
    And User enter last name as "More"
    And User enter password as "Pooja"
    And User enter confirmpassword as "Pooja"
    And User select gender as "Female"
    And User enter Email Address as "pooja@gmail.com"
    And User enter Mobile number as "6783452851"
    And user enter date of birth as "2/3/97"
    And user enter Address as "Solapur"
    And user select security question as "What is your favour color?"
    And user Enter answer as "Pink"
    And user click on register button
    Then user can do successfull register
   