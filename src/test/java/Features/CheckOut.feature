
Feature: Search and Place the order for Products
  
  @PlaceOrder
  Scenario Outline: Search Experience for product serach in both home and offers page
  
  
    Given User is on GreenCart Landing page
    When user searched with shortname <Name> and extract actual result name of product
    And Added "3" items of the selected product to cart
    Then User proceeds to checkout and validate the <Name> items in checkout page
    And Verify user has ability to enter promo code and place the order
 
Examples: 
|Name |
|Tom  |

