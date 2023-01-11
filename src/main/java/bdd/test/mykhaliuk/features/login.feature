# comment
Feature: login functionality test

  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @smoke
  Scenario: Check login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then error message is displayed - Invalid Credentials

  Scenario Outline: Login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples:
    |username|password|
    |user1|password1|
    |user2|password2|
    |user3|password3|
    |user4|password4|
    |user5|password5|
    |user6|password6|