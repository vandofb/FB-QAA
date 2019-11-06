Feature: Open functionality of the Web Application

  Scenario Outline: Verification of initial state
    Given Open the brower and launch the application
    When Enter the Username <username>and Password <password>
    Then Check the initial state

    Examples:
      |username  |password         |
      |User1     |password1        |
      |User2     |password2        |
      |User3     |password3        |