Feature: Account Creation
  As a logged in user
  I want to create a new account
  So that I can deposit money

  Scenario: Successful account creation
    Given user is logged in
    And user is on the account creation page
    When user clicks create new account
    Then account creation confirmation appears