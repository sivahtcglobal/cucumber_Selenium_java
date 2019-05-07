@Approved
Feature: Quote Search in TGQ Application
  Scenario: TGQ Quote Search As Agent
  	Given user get the Test data "TGQ" 
	When user launches "TGQ" URL 
	Then user login to "TGQ" application using "QuoteSearch" button
    Then The Quote number is provided in "TextField"
    
  