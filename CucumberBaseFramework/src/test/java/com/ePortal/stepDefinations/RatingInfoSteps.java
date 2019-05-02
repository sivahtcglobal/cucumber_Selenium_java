package com.ePortal.stepDefinations;


import com.ePortal.global.pageObjects.TGQ_New_Quote_Page;
import com.ePortal.global.pageObjects.TGQ_RatingInfo_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

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

		parentTestCase = Report.makeTestCaseEntry(report, "ePortal_PoC");
		Report.assignCategoryToTestCase(parentTestCase, "ePortal_PoC");

		ratingInfo_Page.ratinginfo(applicationType);

	}

}
