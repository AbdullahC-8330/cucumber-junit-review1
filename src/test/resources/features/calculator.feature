Feature: Calculator Tests

  Background:
    Given user is on calculator page

  @smoke
  Scenario: Test adding

    When User clicks "5" on calculator
    And User clicks "+" on calculator
    And User clicks "5" on calculator
    Then result "10" should be displayed

  @smoke
  Scenario: Test adding

    When User clicks "1" and "0" on calculator
    And User clicks "+" on calculator
    And User clicks "4" on calculator
    Then result "14" should be displayed


  @smoke
  Scenario Outline: Test adding

    When User clicks "<number1>" on calculator
    And User clicks "<operator>" on calculator
    And User clicks "<number2>" on calculator
    Then result "<result>" should be displayed

    Examples:
      | number1 | operator | number2 | result |
      | 9       | +        | 7       | 16     |
      | 9       | –        | 7       | 2      |
      | 9       | ×        | 7       | 72     |
      | 9       | /        | 3       | 4      |
      | 9       | +        | 7       | 16     |


