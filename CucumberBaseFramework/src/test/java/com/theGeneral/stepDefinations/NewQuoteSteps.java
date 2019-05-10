package com.theGeneral.stepDefinations;


import com.ePortal.global.pageObjects.TGQ_New_Quote_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewQuoteSteps extends BaseClass {

	TGQ_New_Quote_Page newQuote_page = new TGQ_New_Quote_Page(dr);
	Report getReports;

	public NewQuoteSteps() {
		super();
	}

	@When("Fill the mandatory fields in \"([^\"]*)\" page$")
	public void newQuote(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		newQuote_page.newquote(applicationType);

	}

}
