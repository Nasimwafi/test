
Feature: Retail Page

  Background: 
    Given User is on Retail Website
    And User click on MyAccount
    When User click on login
    And user enter Username and password
    Then user should be loged in to MyAccount

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
    And User click on Continue button
    Then User should see a success message

@jahan
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
    And User click on Continue buttonn
    Then User should see a success message
