Feature: Update Profile
  As a logged in user
  I want to update my profile
  So that I could keep my information up to date

  Scenario: User updates contact information
    Given user is logged in
    And user is on the update profile page
    When user updates contact information with first name "Jane", last name "Smith", address "456 Oak Ave", city "Portland", state "OR", zip "97201", and phone "503-555-6789"
    And clicks update profile
    Then the updated information is saved