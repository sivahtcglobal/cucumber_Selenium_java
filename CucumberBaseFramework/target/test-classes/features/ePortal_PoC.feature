@Approved
Feature: Login to ePortal application 
	I want to log into ePortal as part of Cucumber PoC	
	
	
Scenario Outline: Login to ePortal
	Given user get the Test data "ePortal" and "<Application Number>" type
	When user launches "ePortal" URL	
	Then user login to "ePortal" application	 
	Then user logout from "ePortal"
	And user quits the browser
		
Examples:	
	|Application Number|
	|Application 1|