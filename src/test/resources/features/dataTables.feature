Feature: Examples of Cucumber data table implementations


  Scenario: List of fruits I like
    Then User should see fruits I like
      | elma    |
      | armut   |
      | seftali |
      | kiraz   |
      | erik    |
      | kavun   |
      | muz     |


  Scenario: User should be able to see all 12 months in months
  dropdown

    Given User is on the dropdowns page of practice tool-"https://practice.cydeo.com/dropdown"
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

