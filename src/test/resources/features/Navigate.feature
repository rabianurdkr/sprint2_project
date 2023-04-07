Feature: Navigating to the Dashboard page
  As a user, I  can navigate to the Dashboard page whenever clicking the Ceallo icon at the top left corner on the page

  @Navigate
  Scenario: Navigating to the Dashboard page
   Given The user logged into the Dashboard
    And The user clicks on any link
    When The user clicks through the Ceallo icon at the top left corner on the page
    Then The user should navigate to the Dashboard page
