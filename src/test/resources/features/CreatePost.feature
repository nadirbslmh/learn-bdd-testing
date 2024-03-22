Feature: Create Post
  As a user
  I want to create a post
  So that my post is published

  Scenario: As a user I can create a new post with valid inputs
    Given I am on the create post page
    When I enter valid post title
    And I enter valid post content
    And I click create button
    Then I redirected to my posts page

  Scenario: As a user I cannot create a new post with empty inputs
    Given I am on the create post page
    When I click create button
    Then I get error message that all fields are required