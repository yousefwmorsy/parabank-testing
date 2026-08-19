# Test Plan — ParaBank Automation Suite

## 1. Document Control

| Field | Value |
|---|---|
| Project | ParaBank Web Automation Testing |
| Application Under Test (AUT) | ParaBank Demo Site — https://parabank.parasoft.com/parabank/index.htm |
| Automation Stack | Java, Selenium WebDriver, Cucumber (BDD), Allure Reports |
| Build Tool | Maven |
| Test Runner | TestNG (via Cucumber runner) |
| Reporting | Allure |

---

## 2. Introduction

### 2.1 Purpose
This document defines the scope, approach, resources, and schedule of testing activities for the automated test suite covering core ParaBank banking workflows. 

### 2.2 Scope

**In Scope:**
- User registration
- Account creation
- Fund transfer between accounts
- Bill payment
- Transaction search by date
- Loan request
- Profile update
- Logout
- 
---

## 3. Test Objectives

- Validate that core end-to-end banking workflows function correctly from a UI perspective
- Establish a maintainable, reusable BDD automation framework (Page Object Model + Cucumber)
- Produce traceable, stakeholder-readable Allure reports mapping features → scenarios → steps
- Catch UI-breaking regressions on the ParaBank demo environment

---

## 4. Test Strategy

- **Pattern:** Page Object Model (POM) with Cucumber step definitions delegating to page classes
- **Layering:**
  - `features/` — Gherkin `.feature` files (business-readable scenarios)
  - `stepdefinitions/` — Java glue code implementing steps
  - `pages/` — Page Object classes encapsulating locators and actions
  - `runners/` — Cucumber-JUnit/TestNG runner classes with tag filters
  - `utils/` — Driver factory, config reader, test data generator, waits
  - `hooks/` — `@Before`/`@After` for setup, teardown, screenshot-on-failure
---

## 5. Test Scenarios

---

### TC-01 — User Registration

- **Objective:** Verify a new user can successfully register for a ParaBank account
- **Preconditions:** None (fresh/anonymous session)

---

### TC-02 — Create Account

- **Objective:** Verify a logged-in customer can open a new account
- **Preconditions:** User is registered and logged in

---

### TC-03 — Transfer Between Accounts

- **Objective:** Verify funds can be transferred between two of the user's own accounts
- **Preconditions:** User is logged in and owns at least two accounts

---

### TC-04 — Pay Bill

- **Objective:** Verify a customer can pay a bill to a payee from a selected account
- **Preconditions:** User is logged in and owns at least one funded account

---

### TC-05 — Search for Transaction/Transfer by Date

- **Objective:** Verify a customer can locate transactions within an account using date-based search
- **Preconditions:** User is logged in and the selected account has at least one historical transaction

---

### TC-06 — Request Loan

- **Objective:** Verify a customer can submit a loan request and receive an approval/denial outcome
- **Preconditions:** User is logged in and owns at least one account (for down payment)
  
---

### TC-07 — Update Profile Information

- **Objective:** Verify a customer can update their personal contact information
- **Preconditions:** User is logged in

---

### TC-08 — Logout

- **Objective:** Verify a logged-in user can log out and that the session is properly terminated
- **Preconditions:** User is logged in
