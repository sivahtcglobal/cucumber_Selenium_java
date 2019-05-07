package com.ePortal.stepDefinations;


import com.ePortal.global.pageObjects.TGQ_Validate_Quote_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class ValidateQuoteSteps extends BaseClass {

	TGQ_Validate_Quote_Page validateQuote_page = new TGQ_Validate_Quote_Page(dr);
	Report getReports;

	public ValidateQuoteSteps() {
		super();
	}

	@When("Provide the mandatory fields and \"([^\"]*)\" the quote$")
	public void validateQuote(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		validateQuote_page.validatequote(applicationType);

	}

}
