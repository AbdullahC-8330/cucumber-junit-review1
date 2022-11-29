@Regression
Feature: Log in functionalities

  User story: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page

  Scenario: Librarian log in with correct credentials

    When Librarian types the correct name and password
    And librarian click the login button
    Then librarian should log in and be on dashboard

  Scenario: Student log in with correct credentials

    When Student types the correct name and password
    And Student click the login button
    Then Student should log in and be on dashboard

  Scenario: Admin log in with correct credentials

    When Admin types the correct name and password
    And Admin click the login button
    Then Admin should log in and be on dashboard