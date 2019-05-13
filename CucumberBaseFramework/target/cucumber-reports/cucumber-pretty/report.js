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
  "error_message": "com.theGeneral.utilities.MyOwnException: Unable To Edit in Vehicles tab vehiclesapplication \nCannot locate an element using link text\u003dNext\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NTISHTCD13\u0027, ip: \u002710.180.20.66\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: RemoteWebDriver\n\r\n\tat com.theGeneral.utilities.BaseClass.throwException(BaseClass.java:354)\r\n\tat com.theGeneral.global.pageObjects.TGQ_Vehicles_Edit_Page.vehiclesedit(TGQ_Vehicles_Edit_Page.java:73)\r\n\tat com.theGeneral.stepDefinations.VehiclesEditSteps.vehiclesEdit(VehiclesEditSteps.java:26)\r\n\tat ✽.Edit the required fields in the \"vehicles\" tab recalculate in the Vehicles Edit tab and click on Next button(src/test/resources/features/C_TGQ_New_Quote.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify the mandatory fields in \"CustomerQuestions\" tab",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerQuestionsSteps.consumerQuestions(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Answer the mandatory fields in \"ApplicationQuestions\" tab",
  "keyword": "Then "
});
formatter.match({
  "location": "ApplicationQuestionsSteps.applicationQue(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Provide the mandatory fields and \"validate\" the quote",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateQuoteSteps.validateQuote(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Provide the mandatory fields and proceed for \"payment\" for the quote",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentPageSteps.payment(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Get the \"PolicyNumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GetPolicyNumSteps.policy(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user quits the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});