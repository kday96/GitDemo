Feature: Application Login

Scenario: Homepage default login

Given User is on landing page
When User logs into application with "Jim" and "Jim2143"
Then Homepage is displayed
And User card is displayed