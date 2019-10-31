Feature: FB Website

  Scenario: As a FB customer I want see FB website homepage
    Given I am on web browser
    When I go to "www.forkbeardtech.com"
    Then I should see FB homepage

  Scenario: As a FB customer I want to navigate on the website
    Given I am on FB Website main page
    When I navigate on the main menu
    Then I should be able to see all related pages

  Scenario: As a FB customer I want to see FB social media accounts
    Given I am on FB Website main page
    When I scroll down all the way
    Then I should be able to check all FB social media accounts
