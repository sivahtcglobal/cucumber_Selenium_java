package com.theGeneral.stepDefinations;

import com.theGeneral.global.pageObjects.TGQ_Application_Questions_Page;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class ApplicationQuestionsSteps extends BaseClass {

	TGQ_Application_Questions_Page applicationQue_page = new TGQ_Application_Questions_Page(dr);
	Report getReports;

	public ApplicationQuestionsSteps() {
		super();
	}

	@When("Answer the mandatory fields in \"([^\"]*)\" tab$")
	public void applicationQue(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "ApplicationQuestions");
		Report.assignCategoryToTestCase(parentTestCase, "ApplicationQuestions");

		applicationQue_page.applicationQuestions(applicationType);

	}

}
