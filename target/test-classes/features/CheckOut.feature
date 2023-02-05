@CheckOut
Feature: CheckOut
  As a user i want to checkout item from the website

  Scenario: User wants to checkout one item from the website saucedemo
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    And User sort product list by "Name (Z to A)"
    When User choice 2 product from the list
    And User click item To Chart
    Then User already on checkout page
    Then User verify that "Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)" as products in a list
    When User remove "Test.allTheThings() T-Shirt (Red)" as products in a list
    And User checkout the selected product
    And User input the checkout information with first name "Abdul Rohman" and last name "Shidiq" then postal code "16417"
    And User click the checkout button
    Then User verify item total, tax, total on checkout summary page
    And User click button finish
    Then User already in checkout complete page