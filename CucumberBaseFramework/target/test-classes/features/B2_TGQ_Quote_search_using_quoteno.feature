@thegeneral @searchquote
Feature: Quote Search in TGQ Application
  Scenario: TGQ Quote Search As Agent
    Given login with Valid username and password in Mars Application
    And Click on the QuoteSearch button
    Then The Quote number is provided in Quote Search page
    #Then Click on the Quote number for details
  Scenario: Capture Policy Number
    Then Get the Policy Number