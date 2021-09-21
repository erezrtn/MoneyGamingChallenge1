Feature: JoinNow Gaming feature


  Scenario: Register a new customer to MoneyGaming.com
    Given The user should be able to navigate to https://moneygaming.qa.gameaccount.com
    When The user click on JOIN NOW! button
    Then The user select the title value
    And The user provide credentials

      | FirstName      | Tahsin         |
      | SurName        | Koyuncu        |
      | DateOfBirth    | 12/12/1990     |
      | EmailAddress   | fake@gmail.com |
      | Telephone      | 5526633132     |
      | Mobile         | 5526633131     |
      | AddressLine1   | 86 Canal St    |
      | AddressLine2   | #323           |
      | City           | Brooklyn       |
      | County         | Kings          |
      | PostCode       | 11201          |
      | Country        | US             |
      | ChooseUserName | BlackBear      |
      | ChoosePassword | 999999         |
      | ReTypePassword | 999999         |
      | SecQuestion1   | favorite city  |
      | Answer         | Miami          |
      | SecQuestion2   | first date     |
      | Answer         | Toronto        |
      | Currency       | US Dollar      |

    Then The user should be able to click JOIN NOW! button
    And The user should be able to see "This field is required"
    Then The user should be agree the terms and conditions
    And The user should be able to click JOIN NOW! button with agree on terms and conditions



