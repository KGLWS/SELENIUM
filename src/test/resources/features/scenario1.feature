@login
Feature: Scenario1

Scenario: guest explores Ports of Departure
Given a guest is on Homepage 
Then i navigated to Ports page
When i search for Honolulu port
Then map zoomed to show selected port
And port is on the middle of the map
And port displayed as Port of Departure

