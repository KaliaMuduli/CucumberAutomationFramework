Feature: Login2

  Scenario: Login Functionality Test1
    Given User Launch Chrome Web Browser
    When User Open "https://www.nopcommerce.com/" page
    And User NavigteTo Login Page
    And User enter ""
    And User enters "Kanha@2005"
    And User click Login button
    Then User should login successfully
    And Close the browser