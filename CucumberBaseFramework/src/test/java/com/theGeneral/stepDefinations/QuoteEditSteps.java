package com.theGeneral.stepDefinations;


import com.theGeneral.global.pageObjects.TGQ_Quote_Edit_Page;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class QuoteEditSteps extends BaseClass {

	TGQ_Quote_Edit_Page quoteEdit_page = new TGQ_Quote_Edit_Page(dr);
	Report getReports;

	public QuoteEditSteps() {
		super();
	}

	@When("Edit the required fields in the \"([^\"]*)\" tab recalculate it and click on Next button$")
	public void quoteEdit(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");
System.out.println("IN THE QUOTE EDIT STEP");
		quoteEdit_page.quotedit(applicationType);

	}

}
