@Login
Feature: Login
  As a user i want to login website sauce demo

  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    And User sort product list by "Name (Z to A)"
    And User choice 2 product from the list
    And User click item To Chart
    And User remove 1 item




#  Scenario Outline: Invalid Login
#    Given User open the website sauce demo
#    When User input "<userName>" as userName and input "<password>" as password
#    Then User see error "<errorMessage>" on login page
#    Examples:
#      | userName | password | errorMessage                                                              |
#      | shidiq1  | hello    | Epic sadface: Username and password do not match any user in this service |
#      | shidiq2  |          | Epic sadface: Password is required                                        |
#      |          | hellooo  | Epic sadface: Username is required                                        |
