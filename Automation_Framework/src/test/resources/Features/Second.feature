Feature: Test the login functinality of OrangeHRM Application Using Scenario Outline

  Scenario Outline: Login to OrangeHRM with valid credential
    Given User is on Login Page
    When User enter <username> and <password>
    And click login button
    Then User should login to OrangeHRM successfully

    Examples: 
      | username | password |
      | Kanha    | Kanha    |
      | Ankit    | Ankit    |
