Feature: User Registration
  As a user
  I want to register a new account
  So that I can access the bank system

  Scenario: Successful registration with valid information
    Given user is on the registration page
    When user enters his personal details
    And clicks on register button
    Then welcome page appears


