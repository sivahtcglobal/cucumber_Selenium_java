@Approved
Feature: New Quote in TGQ Application
  Scenario Outline: TGQ New Quote  As Agent
  Given user get the Test data "TGQ" and "<TestCaseId>" type
 		When user launches "TGQ" URL		
 		Then user login to "TGQ" application	 
 		Then Fill the mandatory fields in "New Quote" page
Examples:
	|TestCaseId|
	|TC001|
	|TC002|
	|TC003|
Scenario: Fill the Mandatory fields in ratinginfo tab in TGQ  As Agent
   Then Fill the mandatory fields in "Rating Info" tab

 Scenario: Clicking on Get Quote button and editing the quote tab
   When Clicking on Get Quote button on rating info tab
   Then Edit the required fields in the quote tab recalculate it and click on Next button
#
#
#    Scenario: Edit the drivers tab
#      Then Edit the required fields in the drivers tab recalculate it and click on Next button
#   Scenario: Edit the vehicles tab
#     Then  Edit the required fields in the vehicles tab recalculate it and click on Next button
#
#  Scenario: Verify the Mandatory fields in CustomerQuestions tab in TGQ  As Agent
#    Then Verify the mandatory fields in CustomerQuestions tab
#
#  Scenario: Verify the Mandatory fields in ApplicationQuestions tab in TGQ  As Agent
#    Then Verify the mandatory fields in ApplicationQuestions tab
#
#  Scenario: Validate the quote
#    Then Provide the mandatory fields and validate the quote
#  Scenario: Process payment for the quote
#    Then Provide the mandatory fields and proceed for payment for the quote
#  Scenario: Capture Policy Number
#    Then Get the Policy Number