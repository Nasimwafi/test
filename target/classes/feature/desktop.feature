Feature: Desktop

	@gat1
  Scenario: User verify all items are present in Desktops tab
    Given User is on Retail Website
    When User click on Desktop tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page
