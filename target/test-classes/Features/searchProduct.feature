
Feature: Search and Place the order for Products
  @OffersPage
  Scenario Outline: Search Experience for product serach in both home and offers page
  
  
    Given User is on GreenCart Landing page
    When user searched with shortname <Name> and extract actual result name of product
    Then user searched for same <Name> in offers page
    And validate product name in offer page matches with landing page 
 
Examples: 
|Name |
|Tom  |
|beet |
