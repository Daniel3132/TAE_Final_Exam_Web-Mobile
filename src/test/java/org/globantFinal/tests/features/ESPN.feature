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
