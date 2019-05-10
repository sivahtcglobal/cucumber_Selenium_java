package com.theGeneral.stepDefinations;


import com.theGeneral.global.pageObjects.TGQ_New_Quote_Page;
import com.theGeneral.global.pageObjects.TGQ_RatingInfo_Page;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RatingInfoSteps extends BaseClass {

	TGQ_RatingInfo_Page ratingInfo_Page = new TGQ_RatingInfo_Page(dr);
	Report getReports;

	public RatingInfoSteps() {
		super();
	}

	@When("Fill the mandatory fields in \"([^\"]*)\" tab$")
	public void ratingInfo(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		ratingInfo_Page.ratinginfo(applicationType);

	}

}
