Feature: Pay a bill
  As a user
  I want to pay my bills
  So that I can deliver money to the payee

  Scenario: Successful bill payment
    Given user is logged in
    And user is on the bill payment page
    When user enters valid payee information
    And clicks on send payment button
    Then bill payment confirmation appears