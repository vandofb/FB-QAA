Feature: FB App Warehouse (TBD)

  Scenario: scenario 1
    Given I open FB App
    When I am inside a FB supported location
    Then I should see my position in the current location

  Scenario: scenario 2
    Given I open FB App
    When I am inside a FB supported location
    And I moved around
    Then I should see my updated position in the current location
