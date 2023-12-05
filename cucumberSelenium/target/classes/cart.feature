Feature: Add to Cart
Scenario: User adds an iPhone to the cart
Given User is on the Amazon.in homepage
When User searches for iPhone
And User selects the first search result
Then User adds the selected item to the cart