Feature: User Registration

  Scenario: Successful registration with valid information
    Given user is on the registration page
    When user enters his personal details
    And clicks on register button
    Then welcome page appears
    And user logs out


