Feature: Login
  As a user
  I want to login
  So that I can access dashboard page

  Scenario: As a user I can login with valid credentials
    Given I am on the login page
    When I input valid email for login
    And I input valid password for login
    And I click login button
    Then I redirected to the dashboard page

  Scenario: As a user I cannot login with invalid credentials
    Given I am on the login page
    When I input invalid email for login
    And I input invalid password for login
    And I click login button
    Then I see error message that email or password is invalid
