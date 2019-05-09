package com.theGeneral.stepDefinations;

import java.awt.AWTException;
import java.io.IOException;

import com.theGeneral.global.pageObjects.GlobalCommonObjects;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

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

	@Given("user get the Test data \"([^\"]*)\"$")
	public void readTestData(String appType)
			throws MyOwnException, InterruptedException, AWTException, IOException {

		readSpecificTestData(prop.getProperty("TestCaseId"));

	}

	@Then("user logout from \"([^\"]*)\"")
	public void logout(String appType) throws MyOwnException, InterruptedException, AWTException {

		globalComPageObj.logOut_ePortal(appType);

	}

}
