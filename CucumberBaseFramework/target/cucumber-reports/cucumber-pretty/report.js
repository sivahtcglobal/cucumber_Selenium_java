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
formatter.step({
  "name": "Fill the mandatory fields in \"Rating Info\" tab",
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
  "error_message": "org.openqa.selenium.NoSuchWindowException: Unable to get browser\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NTISHTCD13\u0027, ip: \u002710.180.20.66\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities {acceptInsecureCerts: false, browserName: internet explorer, browserVersion: 11, javascriptEnabled: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:ieOptions: {browserAttachTimeout: 0, elementScrollBehavior: 0, enablePersistentHover: false, ie.browserCommandLineSwitches: , ie.ensureCleanSession: false, ie.fileUploadDialogTimeout: 3000, ie.forceCreateProcessApi: false, ignoreProtectedModeSettings: true, ignoreZoomSetting: false, initialBrowserUrl: http://localhost, nativeEvents: true, requireWindowFocus: true}, setWindowRect: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: ignore}\nSession ID: e2dcffcd-c3e4-45b3-b8c7-f1c7c154cb4e\r\n\tat sun.reflect.GeneratedConstructorAccessor28.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.ePortal.utilities.BaseClass.screenShot(BaseClass.java:360)\r\n\tat com.ePortal.global.pageObjects.TGQ_RatingInfo_Page.ratinginfo(TGQ_RatingInfo_Page.java:289)\r\n\tat com.ePortal.stepDefinations.RatingInfoSteps.ratingInfo(RatingInfoSteps.java:28)\r\n\tat ✽.Fill the mandatory fields in \"Rating Info\" tab(src/test/resources/features/C_TGQ_New_Quote.feature:8)\r\n",
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
  "name": "user get the Test data \"TGQ\" and \"TC002\" type",
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
