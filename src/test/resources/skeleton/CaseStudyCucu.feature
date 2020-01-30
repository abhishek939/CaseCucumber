Feature: Search Engine

In order to purchase a product user must search the product in the search engine

Business rules:
 - User must be a registered user to add the product to the cart
 - If the user is the guest user he can search the product but when he click on add to card he should be redirected to login page
  - In search engine minimum atleast 4 characters should be entered.
 
  @Guestuser
 Scenario: The one where guest user can search the product through search engine

 Given guest user is on home page
 When  guest user enters minimum 4 characters in the search box
 And user clicks on search button
 Then user is redirected to the product page
 And user clicks on add to card
 Then user must be redirected to login page

 @RegisteredUser
 Scenario: The one where registered user can search the product through search engine
 Given register user is on signin page
When user enters the user name as "lalitha"
 And user enters password as "Password123"
 Then user clicks on login
 When  guest user enters minimum 4 characters in the search box
 And user clicks on search button
 Then user is redirected to the product page 
 And user clicks on add to card
 Then message is displayed as successful if the product is available

 @DirectCheckOutPage
 Scenario: The one where User directly cannot click checkout the product
 Given user is registered in test me app
When  guest user enters minimum 4 characters in the search box
And user clicks on search button
When user try to procees to pay without adding the items to the cart
Then test me app does not display the cart icon  
