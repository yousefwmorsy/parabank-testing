Feature: Account Creation

  Scenario: Successful account creation
    Given user is logged in
    And user is on the account creation page
    When user clicks create new account
    Then account creation confirmation appears
    And user logs out