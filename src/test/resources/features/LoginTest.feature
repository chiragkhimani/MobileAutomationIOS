Feature: Test Login Functionality

  Scenario: Verify user can login with valid credentials
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen