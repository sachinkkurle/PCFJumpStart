@Smoke @Sanity

Feature: Adding items to basket

Scenario Outline: No item selected in basket
Given I start the application
|Applicatio_Name|
|Flipkart       |
|Amazon         |
Then I should see a selection of products
When I browse "<Buying_Products>" buying product
|Product_Name|Product_Company|
|shoes       |Reebak         |
|shirt       |Zodiac         |
Then my basket "<Basket_status>" be empty
And I "<Buy_status>" buy an item


Examples:
|Buying_Products|Basket_status|Buy_status|
|without        |should       |cannot    |
|with           |shouldnot    |can       |
|xxx            |yyy          |zzz		 |



