Feature: Transfer Between Accounts
  As a user
  I want to transfer money between two of my own accounts
  So that I can manage my funds

  Scenario: Successful transfer between user's own accounts
    Given user is logged in
    And user is on the transfer funds page
    When user enters a valid transfer amount
    And user selects different source and destination accounts
    And clicks on transfer button
    Then transfer confirmation appears