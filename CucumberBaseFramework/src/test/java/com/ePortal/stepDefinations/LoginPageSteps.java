package com.ePortal.stepDefinations;

import com.ePortal.global.pageObjects.LoginPage;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass {

	LoginPage login = new LoginPage(dr);
	Report getReports;

	public LoginPageSteps() {
		super();
	}

	@When("user login to \"([^\"]*)\" application$")
	public void login(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "ePortal_PoC");
		Report.assignCategoryToTestCase(parentTestCase, "ePortal_PoC");

		login.login(applicationType);

	}

}
