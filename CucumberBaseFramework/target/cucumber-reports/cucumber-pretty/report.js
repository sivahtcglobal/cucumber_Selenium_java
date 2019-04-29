$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ePortal_PoC.feature");
formatter.feature({
  "name": "Login to ePortal application",
  "description": "\tI want to log into ePortal as part of Cucumber PoC\t",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Approved"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login to ePortal",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user get the Test data \"ePortal\" and \"\u003cApplication Number\u003e\" type",
  "keyword": "Given "
});
formatter.step({
  "name": "user launches \"ePortal\" URL",
  "keyword": "When "
});
formatter.step({
  "name": "user login to \"ePortal\" application",
  "keyword": "Then "
});
formatter.step({
  "name": "user logout from \"ePortal\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user quits the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Application Number"
      ]
    },
    {
      "cells": [
        "Application 1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to ePortal",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Approved"
    }
  ]
});
formatter.step({
  "name": "user get the Test data \"ePortal\" and \"Application 1\" type",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.readTestData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user launches \"ePortal\" URL",
  "keyword": "When "
});
formatter.match({
  "location": "CommonSteps.launchUrl(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login to \"ePortal\" application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.login(String)"
});
formatter.result({
  "error_message": "com.ePortal.utilities.MyOwnException: Unable To login to the ePortalapplication \nUNABLE TO ENTER THE TEXT(NTVNDM31) INSIDE SPECIFIED WEBELEMENT(Proxy element for: DefaultElementLocator \u0027By.name: P101_USERNAME\u0027)\nUNABLE TO WAIT FOR (100) SECONDS UNTIL EXPECTED CONDITION(ELEMENT_VISIBLE) \nExpected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.name: P101_USERNAME\u0027 (tried for 100 second(s) with 500 milliseconds interval)\n\n\n\r\n\tat com.ePortal.utilities.BaseClass.throwException(BaseClass.java:330)\r\n\tat com.ePortal.global.pageObjects.LoginPage.login(LoginPage.java:68)\r\n\tat com.ePortal.stepDefinations.LoginPageSteps.login(LoginPageSteps.java:25)\r\n\tat ✽.user login to \"ePortal\" application(src/test/resources/features/ePortal_PoC.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user logout from \"ePortal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.logout(String)"
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