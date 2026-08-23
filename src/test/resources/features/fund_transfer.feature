Feature: Transfer Between Accounts
  As a user
  I want to transfer money between two of my own accounts
  So that I can manage my funds

  Scenario: Successful transfer between user's own accounts
    Given user is logged in
    And user is on the transfer funds page
    When user enters a valid transfer amount of "550"
    And user selects source account "14121" and destination account "13344"
    And clicks on transfer button
    Then transfer confirmation appears with amount "550.00", from account "14121", and to account "13344"