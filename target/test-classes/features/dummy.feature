@smoke
Feature: Login Functionality
  As a standard user I am able to login to the application
  
  @c1
  Scenario Outline: Scenario c1 of dummy
    Given "<url>" as the application
    When I enter "<username>" and "<password>"
    Then I am able to login successfully
    
    Examples:
    |url| username | password |
    |https://www.saucedemo.com/v1/ |  standard_user |  secret_sauce |
    
# Given user has launched url "https://www.saucedemo.com/v1/"
# And user has entered username "standard_user" and password "secret_sauce"
# And user click on login
# When User add "Sauce Labs Backpack" item to cart
# Then user remove item from cart
# And user verify the item is removed from cart