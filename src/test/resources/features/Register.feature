Feature: Register
  As a user
  I want to register
  So that I can login

  Scenario: As a user I can register with valid inputs
    Given I am on the register page
    When I input valid email
    And I input valid password
    And I input valid phone number
    Then I redirected to the login page

  Scenario: As a user I cannot register with invalid inputs
    Given I am on the register page
    When I input invalid email
    And I input invalid password
    And I input invalid phone number
    Then I get error message