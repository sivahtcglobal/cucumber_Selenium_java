package com.theGeneral.stepDefinations;


import com.theGeneral.global.pageObjects.TGQ_Validate_Quote_Page;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class ValidateQuoteSteps extends BaseClass {

	TGQ_Validate_Quote_Page validateQuote_page = new TGQ_Validate_Quote_Page(dr);
	Report getReports;

	public ValidateQuoteSteps() {
		super();
	}

	@When("Provide the mandatory fields and \"([^\"]*)\" the quote$")
	public void validateQuote(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "ValidateQuote");
		Report.assignCategoryToTestCase(parentTestCase, "ValidateQuote");

		validateQuote_page.validatequote(applicationType);

	}

}
