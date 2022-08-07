Feature: Test the login functinality of OrangeHRM Application using DataTable

  Scenario: Login to OrangeHRM with valid credential using Data table
    Given User is on Login Page
    When User enter credential using DataTable
      | Kanha | Kanha |
    And click login button
    Then User should login to OrangeHRM successfully
