Feature: Login1

  Background: common Steps for all scenario
    Given User Launch Chrome Web Browser
    When User Open "https://www.nopcommerce.com/" page
    And User NavigteTo Login Page

  Scenario: Login Functionality Test1
    And User enter "KanhaAA"
    And User enters "Kanha@2005"
    And User click Login button
    Then User should login successfully
    And Close the browser

  Scenario: Login Functionality Test1
    And User enter "KanhaAA"
    And User enters "Kanha@2005"
    And User click Login button
    Then User should login successfully
    And Close the browser
