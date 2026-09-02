Feature: Loan Request

   Scenario: Request a loan
     Given user is logged in
     And user is on the loan request page
     When user enters loan amount "500" and down payment "0"
     And selects account "13344" for the loan
     And clicks on apply now button
     Then loan confirmation appears
     And user logs out