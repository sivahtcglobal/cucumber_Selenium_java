package com.ePortal.stepDefinations;


import com.ePortal.global.pageObjects.TGQ_Consumer_Questions_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class CustomerQuestionsSteps extends BaseClass {

	TGQ_Consumer_Questions_Page consumerQuestions_page = new TGQ_Consumer_Questions_Page(dr);
	Report getReports;

	public CustomerQuestionsSteps() {
		super();
	}

	@When("Verify the mandatory fields in \"([^\"]*)\" tab$")
	public void consumerQuestions(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		consumerQuestions_page.consumerquestions(applicationType);

	}

}
