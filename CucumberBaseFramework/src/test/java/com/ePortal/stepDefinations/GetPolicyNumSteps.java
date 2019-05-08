package com.ePortal.stepDefinations;

import com.ePortal.global.pageObjects.TGQ_Final_Policy_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class GetPolicyNumSteps extends BaseClass {

	TGQ_Final_Policy_Page policy_page = new TGQ_Final_Policy_Page(dr);
	Report getReports;

	public GetPolicyNumSteps() {
		super();
	}

	@When("Get the \"([^\"]*)\"$")
	public void policy(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		policy_page.policy_page(applicationType);

	}

}
