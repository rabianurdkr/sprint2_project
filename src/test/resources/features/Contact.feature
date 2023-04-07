Feature: Searching Contacts
  As a user, I can search contacts by clicking on the contacts icon and typing its name

  @SearchContact
  Scenario Outline: Searching contacts
    Given The user logged into the Dashboard
    And The user clicks through the contacts icon
    When The user search contacts by clicking on the contacts icon and typing its name
    Then The user should see the contacts
    Examples:
    | |
    | |
