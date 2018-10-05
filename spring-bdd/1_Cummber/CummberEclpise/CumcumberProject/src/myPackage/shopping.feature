@Smoke @Sanity

Feature: Adding items to basket

Scenario: No item selected in basket
Given I start the application
Then I should see a selection of products
When I browse "without" buying product
Then my basket "should" be empty
And I "cannot" buy an item

Scenario: No item selected in basket
Given I start the application
Then I should see a selection of products
When I browse "with" buying product
Then my basket "shouldnot" be empty
And I "can" buy an item	