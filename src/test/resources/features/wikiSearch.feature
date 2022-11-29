Feature: Wikipedia Search Functionality

  Background:
    Given User is on Wikipedia home page


  Scenario: Wikipedia Search Functionality Title Verification
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header


  Scenario: Wikipedia Search Functionality Image Header Verification
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steven Paul Jobs" is in the image header


  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality and Verification
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values and expected results

      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Anthony Hopkins   | Anthony Hopkins   | Anthony Hopkins    |









