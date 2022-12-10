Feature: Disneyland android application basic functionality
  The user should be able to navigate correctly through the app.
  The user should be able to tap on buttons.
  The user should see list of options and categories.


  Background:
    Given The user is on the dashboard screen

  @mobile
  Scenario: See category list successful
    Given The user navigate to map screen
    When The user opens the category list
    Then The app should display a list of options included Hotels one

  @mobile
  Scenario: See Privacy & Legal list successful
    Given The user navigate to Menu screen
    When User navigate to Privacy & Legal
    Then The app should display a list of options included Privacy Policy one

  @mobile
  Scenario: Add Plans options
    Given The user navigate to add plans
    Then The Reserve dining option is on the list

