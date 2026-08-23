Feature: Update Profile

  Scenario: User updates contact information
    Given user is logged in
    And user is on the update profile page
    When user updates contact information
    And clicks update profile
    Then the updated information is saved
