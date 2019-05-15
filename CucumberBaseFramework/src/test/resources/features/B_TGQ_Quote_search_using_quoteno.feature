@SearchQuote
Feature: Quote Search in TGQ Application
  Scenario: TGQ Quote Search As Agent
  	#Given user get the Test data "TGQ" 
	When user launches "TGQ" URL 
	Then login to "TGQ" application
	Then click on "QuoteSearch" button
    Then The Quote number is provided in "TextField"
    Then Verify the mandatory fields in "CustomerQuestions" tab 
	Then Answer the mandatory fields in "ApplicationQuestions" tab 
	Then Provide the mandatory fields and "validate" the quote 
	Then Provide the mandatory fields and proceed for "payment" for the quote 
	Then Get the "PolicyNumber" 
	And user quits the browser 
    
  