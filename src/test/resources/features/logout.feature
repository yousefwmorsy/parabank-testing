Feature: Logout

  Scenario: User logs out and is returned to the login page
    Given user is logged in
    When user logs out
    Then login fields are visible
