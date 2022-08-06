Feature: Test the login functinality of OrangeHRM Application

  Scenario: Login to OrangeHRM with valid credential
    Given User is on Login Page
    When User enter UserName and password
    And click login button
    Then User should login to OrangeHRM successfully
