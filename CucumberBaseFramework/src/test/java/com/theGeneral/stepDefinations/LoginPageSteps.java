package com.theGeneral.stepDefinations;

import com.theGeneral.global.pageObjects.MarsApplicationLoginPage;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass {

	MarsApplicationLoginPage login = new MarsApplicationLoginPage(dr);
	Report getReports;

	public LoginPageSteps() {
		super();
	}

	@When("user login to \"([^\"]*)\" application using \"([^\"]*)\" button$")
	public void login(String applicationType,String operation) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "LoginPage");
		Report.assignCategoryToTestCase(parentTestCase, "LoginPage");

		login.login(applicationType,operation);

	}

}
