@create
Feature: login user in webpage

  Scenario: Create a new Professional Account with valid credentials
    Given user is on the home page
    When user clicks on Create Account
    And user clicks on Create Professional Account
    And user enters <username>
    And user enters <password>
    And user enters coupon code if received
    And user click on Lets get started
    And user selects business account category
    And user clicks Next1
    And user selects Country
    And user enters Business Name
    And user enters Business URL
    And user enters Address1
    And user enters Address2
    And user selects if address can be listed publically
    And user enters City
    And user selects State
    And user enters Zip
    And user enters Phone
    And user selects if its a cell
    And user clicks Next
    And user enters First Name
    And user enters Last Name
    And user selects past schedule type
    And user selects terms of use
    And user clicks Get Started
    Then user is navigated to profile dashboard

 # @Signin
  Scenario: User Successfully on webpage
    Given user is on the home page
    When User clicks on sign in
    And user enters <username>
    And user enters <password>
    Then User successfully signin
