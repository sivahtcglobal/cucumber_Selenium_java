package com.theGeneral.stepDefinations;

import com.ePortal.global.pageObjects.TGQ_Application_Questions_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class ApplicationQuestionsSteps extends BaseClass {

	TGQ_Application_Questions_Page applicationQue_page = new TGQ_Application_Questions_Page(dr);
	Report getReports;

	public ApplicationQuestionsSteps() {
		super();
	}

	@When("Answer the mandatory fields in \"([^\"]*)\" tab$")
	public void applicationQue(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "ePortal_PoC");
		Report.assignCategoryToTestCase(parentTestCase, "ePortal_PoC");

		applicationQue_page.applicationQuestions(applicationType);

	}

}
