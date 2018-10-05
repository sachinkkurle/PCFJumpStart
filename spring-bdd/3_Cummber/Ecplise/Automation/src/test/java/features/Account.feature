Feature: Applciation Login



@SomkeTest
Scenario: Home page default login 

Given User is on net banking Landing Page
When User login into application with "jin" and "1234"
Then Home page is populated
And Cards diplayed are "true"

@MobileTest
Scenario: Home page default login 
Given User is on net banking Landing Page
When User login into application with "jhon" and "4321"
Then Home page is populated
And Cards diplayed are "true"
