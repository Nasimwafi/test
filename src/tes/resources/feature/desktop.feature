Feature: Desktop

  Background: 
    Given User is on Retail Website
    When User click on Desktop tab
    And User click on Show all desktops

  @gat1
  Scenario: User verify all items are present in Desktops tab
    Then User should see all items are present in Desktop page

  @gat2
  Scenario: User add HP LP    from Desktops tab to the cart
    And User click  ADD TO CART option on HP LP3065item
    And User select quantity1
    And User click add to Cart button
    Then User should see a messagee "Success: you have added HP LP 3065 to your Shopping cart!"
	
	@gat3
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click  ADD TO CART option on Canon EOS 5Ditem
    And User select color from dropdown Red
    And User select quantityy one
    And User click add to Cart buttont
    Then User should see a messaget "Success: You have added Canon EOS 5D to your shopping cart!"
