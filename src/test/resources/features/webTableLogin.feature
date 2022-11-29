Feature: User should be able to login using correct credentials


#  Scenario: Positive login scenario
#    Given user is o the login page of web table app - "https://web-table-2.cydeo.com/login"
#    When user enters username "Test"
#    And user enters password "Tester"
#    And user clicks to login button
#    Then user should see url ends with "orders"


  Scenario: Positive login scenario
    Given user is on the login page of web table app
      | url | https://web-table-2.cydeo.com/login |
    When user enters username
      | username | Test |
    And user enters password
      | password | Tester |
    And user clicks to login button
    Then user should see url ends with orders
      | expectedValue | orders |


#  Scenario Outline: Positive login scenario
#    Given user is o the login page of web table app - "<url>"
#    When user enters username "<username>"
#    And user enters password "<password>"
#    And user clicks to login button
#    Then user should see url ends with "<value>"
#
#    Examples:
#      | url                                 | username | password | value  |
#      | https://web-table-2.cydeo.com/login | Test     | Tester   | orders |
#



