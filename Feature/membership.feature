@createMembers
Feature: Create a new membership
Scenario: Business owner creates a new membership in dashboard
Given user is on dashboard page
When user is able to enter username
And user is able to enter password
And user clicks on sign in
And user clicks on Setup
And user selects service menu
And user clicks on memberships
And user clicks on add new membership 
And user enters a membership name
And user enters description
And user enters price
And user clicks allow unused sessions
And user selects months before expiring
And user enters number of services included 
And user clicks on select services 
And user clicks on select All
And user clicks on select
Then user clicks on save


Scenario: Business owner assigns a new membership to client 
Given user is on dashboard page
When user is able to enter username
And user is able to enter password
And user clicks on sign in
And User clicks on cleint 
And User enter First name
And User enters last name 
And User enters phone number 
And User enters email address
And User enter street address
And User enter address2
And User enter city
And User selects State 
And User enters Zip

