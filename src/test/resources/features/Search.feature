Feature: Searching file
  As a user, I can search file typing its name through the magnifying glass icon and see the details side page of the file when clicked on it.

  @wip
  Scenario Outline: Searching file
    Given user logged into the Dashboard
    And user clicks through the magnifying glass icon
    When user types "<files>" and click on it
    Then user sees the details side page of the file
   Examples:
      |files|
      |Readme|
      |omer  |
      |test  |










