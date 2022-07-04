@all
Feature: Home Page

  @tag1
  Scenario: User Verify currency values change
    Given User is on Retail Website
    When User clicks on Currency
    And User Chose Euro from dropdown
    Then currency value should chande to Euro

  @tag2
  Scenario: User empty Shopping cart message display
    Given User is on retail websitee
    When User clicks on shoppping cart
    Then message is desplayed
