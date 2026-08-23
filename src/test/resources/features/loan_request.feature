Feature: Fund Transfer Request
  As a user
  I want to request for a loan
  So that  I take a loan

   Scenario: Approved loan request
     Given user is logged in
     And user is on the loan request page
     When user enters a loan and down payment amount
     And selects from a valid account
     And clicks on apply now button
     Then loan confirmation appears