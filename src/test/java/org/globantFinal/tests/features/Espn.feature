Feature: espn web page basic functionality
  The user should be able to navigate correctly through the web page.
  The user should be able to do Sign up, Login and Logout.
  The user should click and interact normally with carrousels.

  Background:
    Given User navigate to the Website

  @web
  Scenario: Sing up successful
    Given The user opens Login modal
    When The user navigate to Sign up form
    And The user fill the form with valid information
    Then The page should display in logged state

  @web
  Scenario: Watch page working
    Given The user navigate to watch page
    When The user interacts with carousels
    Then The user navigates back to home page

  @web
  Scenario: Logout successful
    Given The user is logged in
    When The user opens the user options menu
    And  The user clicks logout button
    Then The page should display in not logged state

