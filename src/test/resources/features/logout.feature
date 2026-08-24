Feature: Logout
  As a logged in user
  I want to be able to logout from my account
  So that unauthorised users cannot access my account

  Scenario: User logs out and is returned to the login page
    Given user is logged in
    When user logs out
    Then login fields are visible
