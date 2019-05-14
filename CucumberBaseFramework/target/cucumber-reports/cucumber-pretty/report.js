$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/C_TGQ_New_Quote.feature");
formatter.feature({
  "name": "New Quote in TGQ Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Approved"
    }
  ]
});
formatter.scenario({
  "name": "TGQ New Quote  As Agent",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Approved"
    }
  ]
});
formatter.step({
  "name": "user get the Test data \"TGQ\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.readTestData(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user launches \"TGQ\" URL",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.launchUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login to \"TGQ\" application using \"New Quote\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the mandatory fields in \"New Quote\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewQuoteSteps.newQuote(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill the mandatory fields in \"Rating Info\" tab",
  "keyword": "Then "
});
formatter.match({
  "location": "RatingInfoSteps.ratingInfo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit the required fields in the \"Quote Edit\" tab recalculate it and click on Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "QuoteEditSteps.quoteEdit(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit the required fields in the \"drivers Edit\" tab recalculate in drivers Edit tab and click on Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "DriversEditSteps.driversEdit(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit the required fields in the \"vehicles\" tab recalculate in the Vehicles Edit tab and click on Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "VehiclesEditSteps.vehiclesEdit(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the mandatory fields in \"CustomerQuestions\" tab",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerQuestionsSteps.consumerQuestions(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Answer the mandatory fields in \"ApplicationQuestions\" tab",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationQuestionsSteps.applicationQue(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide the mandatory fields and \"validate\" the quote",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateQuoteSteps.validateQuote(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide the mandatory fields and proceed for \"payment\" for the quote",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentPageSteps.payment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the \"PolicyNumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GetPolicyNumSteps.policy(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user quits the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.closeBrowser()"
});
formatter.result({
  "status": "passed"
});
});