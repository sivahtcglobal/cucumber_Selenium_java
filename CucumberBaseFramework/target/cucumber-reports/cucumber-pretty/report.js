$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/B2_TGQ_Quote_search_using_quoteno.feature");
formatter.feature({
  "name": "Quote Search in TGQ Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Approved"
    }
  ]
});
formatter.scenario({
  "name": "TGQ Quote Search As Agent",
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
  "name": "user login to \"TGQ\" application using \"QuoteSearch\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Quote number is provided in \"TextField\"",
  "keyword": "Then "
});
formatter.match({
  "location": "QuoteSearchUsingQuoteNumber.enterQuote(String)"
});
formatter.result({
  "status": "passed"
});
});