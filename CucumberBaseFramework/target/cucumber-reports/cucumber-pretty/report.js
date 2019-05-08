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
  "error_message": "org.openqa.selenium.UnhandledAlertException: Modal dialog present with text: Your browser session has timed out.\nPlease close this browser window and enter iPub again.: Your browser session has timed out.\nPlease close this browser window and enter iPub again.\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NTISHTCD13\u0027, ip: \u002710.180.20.66\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities {acceptInsecureCerts: false, browserName: internet explorer, browserVersion: 11, javascriptEnabled: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:ieOptions: {browserAttachTimeout: 0, elementScrollBehavior: 0, enablePersistentHover: false, ie.browserCommandLineSwitches: , ie.ensureCleanSession: false, ie.fileUploadDialogTimeout: 3000, ie.forceCreateProcessApi: false, ignoreProtectedModeSettings: true, ignoreZoomSetting: false, initialBrowserUrl: http://localhost, nativeEvents: true, requireWindowFocus: true}, setWindowRect: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: ignore}\nSession ID: 95b8dc35-7842-44ae-bbca-635a190b7eb6\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.ePortal.utilities.BaseClass.screenShot(BaseClass.java:361)\r\n\tat com.ePortal.global.pageObjects.TGQ_RatingInfo_Page.ratinginfo(TGQ_RatingInfo_Page.java:273)\r\n\tat com.ePortal.stepDefinations.RatingInfoSteps.ratingInfo(RatingInfoSteps.java:28)\r\n\tat ✽.Fill the mandatory fields in \"Rating Info\" tab(src/test/resources/features/C_TGQ_New_Quote.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Edit the required fields in the \"Quote Edit\" tab recalculate it and click on Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "QuoteEditSteps.quoteEdit(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Edit the required fields in the \"drivers Edit\" tab recalculate in drivers Edit tab and click on Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "DriversEditSteps.driversEdit(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Edit the required fields in the \"vehicles\" tab recalculate in the Vehicles Edit tab and click on Next button",
  "keyword": "Then "
});
formatter.match({
  "location": "VehiclesEditSteps.vehiclesEdit(String)"
});
formatter.result({
  "status": "skipped"
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