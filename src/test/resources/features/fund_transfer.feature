Feature: Transfer Between Accounts

  Scenario: Successful transfer between user's own accounts
    Given user is logged in
    And user is on the transfer funds page
    When user enters a valid transfer amount of "-550"
    And user selects source account "13344" and destination account "13455"
    And clicks on transfer button
    Then transfer confirmation appears with amount "550.00", from account "13344", and to account "13455"
    And user logs out

