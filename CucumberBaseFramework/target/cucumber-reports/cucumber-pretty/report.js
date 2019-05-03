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
formatter.scenarioOutline({
  "name": "TGQ New Quote  As Agent",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user get the Test data \"TGQ\" and \"\u003cTestCaseId\u003e\" type",
  "keyword": "Given "
});
formatter.step({
  "name": "user launches \"TGQ\" URL",
  "keyword": "When "
});
formatter.step({
  "name": "user login to \"TGQ\" application",
  "keyword": "Then "
});
formatter.step({
  "name": "Fill the mandatory fields in \"New Quote\" page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TestCaseId"
      ]
    },
    {
      "cells": [
        "TC001"
      ]
    },
    {
      "cells": [
        "TC002"
      ]
    },
    {
      "cells": [
        "TC003"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TGQ New Quote  As Agent",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Approved"
    }
  ]
});
formatter.step({
  "name": "user get the Test data \"TGQ\" and \"TC001\" type",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.readTestData(String,String)"
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
  "name": "user login to \"TGQ\" application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.login(String)"
});
