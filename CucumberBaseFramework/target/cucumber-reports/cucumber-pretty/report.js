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
  "status": "passed"
});
formatter.step({
  "name": "user logout from \"ePortal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.logout(String)"
});
formatter.result({
  "error_message": "com.ePortal.utilities.MyOwnException: UNABLE TO Logout from  ePortal application \nUnable to find element with link text \u003d\u003d Logout\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027NTISHTCD13\u0027, ip: \u002710.180.20.66\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities {acceptInsecureCerts: false, browserName: internet explorer, browserVersion: 11, javascriptEnabled: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:ieOptions: {browserAttachTimeout: 0, elementScrollBehavior: 0, enablePersistentHover: false, ie.browserCommandLineSwitches: , ie.ensureCleanSession: false, ie.fileUploadDialogTimeout: 3000, ie.forceCreateProcessApi: false, ignoreProtectedModeSettings: true, ignoreZoomSetting: false, initialBrowserUrl: http://localhost, nativeEvents: true, requireWindowFocus: true}, setWindowRect: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: ignore}\nSession ID: 7ba44ab4-0c19-4eca-be6c-443c6ece9a0b\n*** Element info: {Using\u003dlink text, value\u003dLogout}\n\r\n\tat com.ePortal.utilities.BaseClass.throwException(BaseClass.java:330)\r\n\tat com.ePortal.global.pageObjects.GlobalCommonObjects.logOut_ePortal(GlobalCommonObjects.java:51)\r\n\tat com.ePortal.stepDefinations.CommonSteps.logout(CommonSteps.java:64)\r\n\tat ✽.user logout from \"ePortal\"(src/test/resources/features/ePortal_PoC.feature:10)\r\n",
  "status": "failed"
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