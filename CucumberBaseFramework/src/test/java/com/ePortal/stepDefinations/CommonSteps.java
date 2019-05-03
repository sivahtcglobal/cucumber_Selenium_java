package com.ePortal.stepDefinations;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.ePortal.global.pageObjects.GlobalCommonObjects;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.Excel;
import com.ePortal.utilities.MyOwnException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonSteps extends BaseClass {

	public CommonSteps() {

		super();
	}

	GlobalCommonObjects globalComPageObj = new GlobalCommonObjects(dr);

	@Then("^verify the page title$")
	public String getPageTitle() {
		return dr.getTitle();
	}

	@Then("^user quits the browser$")
	public void closeBrowser() throws Exception {

		if (dr == null) {
			return;
		}
		dr.quit();
		dr = null;
	}

	// @Then("^verify the page title$")
	public String switchWindow() {
		return dr.getWindowHandle();
	}

	@Then("I validate the \"([^\"]*)\" title")
	public void verifyHomePageTitle(String screenName) throws Throwable {

		globalComPageObj.verifyPageTitle(screenName);
	}

	@Given("user launches \"([^\"]*)\" URL$")
	public void launchUrl(String applicationType) throws InterruptedException, MyOwnException {
		initialization(applicationType);
	}

	@Given("user get the Test data \"([^\"]*)\" and \"([^\"]*)\" type")
	public void readTestData(String appType, String testCaseId)
			throws MyOwnException, InterruptedException, AWTException, IOException {

		readSpecificTestData(testCaseId);

	}

	@Then("user logout from \"([^\"]*)\"")
	public void logout(String appType) throws MyOwnException, InterruptedException, AWTException {

		globalComPageObj.logOut_ePortal(appType);

	}

}
