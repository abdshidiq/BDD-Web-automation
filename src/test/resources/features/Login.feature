@Login
Feature: Login
  As a user i want to login website sauce demo

  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page



  Scenario Outline: Invalid Login
    Given User open the website sauce demo
    When User input "<userName>" as userName and input "<password>" as password
    Then User see error "<errorMessage>" on login page
    Examples:
      | userName | password | errorMessage                                                              |
      | shidiq1  | hello    | Epic sadface: Username and password do not match any user in this service |
      | shidiq2  |          | Epic sadface: Password is required                                        |
      |          | hellooo  | Epic sadface: Username is required                                        |
