@NewQuote
Feature: New Quote in TGQ Application 
Scenario: TGQ New Quote  As Agent 	
	Given login to "TGQ" application
	Then click on "New Quote" button 
	Then Fill the mandatory fields in "New Quote" page 
	Then Fill the mandatory fields in "Rating Info" tab 
	Then Edit the required fields in the "Quote Edit" tab recalculate it and click on Next button 
	Then Edit the required fields in the "drivers Edit" tab recalculate in drivers Edit tab and click on Next button 
	Then Edit the required fields in the "vehicles" tab recalculate in the Vehicles Edit tab and click on Next button 
	Then Verify the mandatory fields in "CustomerQuestions" tab 
	Then Answer the mandatory fields in "ApplicationQuestions" tab 
	Then Provide the mandatory fields and "validate" the quote 
	Then Provide the mandatory fields and proceed for "payment" for the quote 
	Then Get the "PolicyNumber" 
	And user quits the browser 
	
	
	
