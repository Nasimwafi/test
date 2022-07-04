@all
Feature: laptop & NoteBooks

  @taga
  Scenario: Add and Remove a Mac book from cart
    Given User is on Retail Website
    When User click on laptop & notebook tab
    And User click on show all laptop & notebool option
    And User click on macbook item
    And user click add to cart button
    Then user should see a message "succes: you have added Macbook to your shopping cart!"
    And User should see "1 item(s)-602.00" showed to the cart
    And User click on cart option
    And User click on red X button to remove the item from cart
    Then item should be removed and cart should show "0 itmes(s)"

    @tagb
  Scenario: product Comparison
    Given User is on Retail Website
    When User click on laptop & notebook tab
    And User click on show all laptop & notebool option
    And User click on product comparison icon on MacBook
    And User click on product comparison icon on MacBook Air
    Then User should see a message "Success: You have added MacBook Air to your product comparison!"
    And User click on Product comparison link
    Then User should see Product Comparison Chart

  @tagc
  Scenario: Adding an item to Wish list
    Given User is on Retail Website
   When User click on laptop & notebook tab
    And User click on show all laptop & notebool option
    And User click on heart icon to add ‘Sony VaIO’ laptop to wish list
    Then User should get a message "You must login or create an account to save Sony VAIO to your wish list!"

  @tagd
  Scenario: Validate the price of MacBook Pro is 2000
    Given User is on Retail Website
    When User click on laptop & notebook tab
    And User click on show all laptop & notebool option
    And User click on ‘MacBook Pro’ item
    Then User should see  "$2,000.00" price tag is present on UI
  