Feature: Fund Transfer Request
  As a user
  I want to request for a loan
  So that  I take a loan

   Scenario: Approved loan request
     Given user is logged in
     And user is on the loan request page
     When user enters loan amount "500" and down payment "0"
     And selects account "15120" for the loan
     And clicks on apply now button
     Then loan confirmation appears