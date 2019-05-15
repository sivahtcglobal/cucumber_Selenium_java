package com.theGeneral.stepDefinations;

import com.theGeneral.global.pageObjects.MarsHomePage;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class CreateQuoteSteps extends BaseClass {

	MarsHomePage marsHomePage = new MarsHomePage(dr);
	Report getReports;

	public CreateQuoteSteps() {
		super();
	}
	
	@When("click on \"([^\"]*)\" button$")
	public void quoteSearch(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "quoteSearchPage");
		Report.assignCategoryToTestCase(parentTestCase, "quoteSearchPage");

		marsHomePage.homePage(applicationType);

	}

}
