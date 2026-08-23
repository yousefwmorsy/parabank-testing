Feature: Pay a bill
  As a user
  I want to pay my bills
  So that I can deliver money to the payee

  Scenario: Successful bill payment
    Given user is logged in
    And user is on the bill payment page
    When user enters valid payee information with name "John Doe", address "123 Main Street", city "New York", state "NY", zip "10001", and phone "555-1234"
    And user enters payee account "13344" and amount "100.00" from account "13677"
    And clicks on send payment button
    Then bill payment confirmation appears