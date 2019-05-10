package com.theGeneral.stepDefinations;

import com.ePortal.global.pageObjects.MarsApplicationLoginPage;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass {

	MarsApplicationLoginPage login = new MarsApplicationLoginPage(dr);
	Report getReports;

	public LoginPageSteps() {
		super();
	}

	@When("user login to \"([^\"]*)\" application using \"([^\"]*)\" button$")
	public void login(String applicationType,String operation) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		login.login(applicationType,operation);

	}

}
