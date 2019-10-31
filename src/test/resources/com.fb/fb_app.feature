Feature: FB App (Wayfinding & Workflow)

  Scenario: As a FB App user I want to find my indoor position
    Given I open FB App
    When I am inside a FB supported location
    Then I should see my position in the current location

  Scenario: As a FB App user I want to be guided in indoor location
    Given I open FB App
    When I am inside a FB supported location
    And I moved around
    Then I should see my updated position in the current location

