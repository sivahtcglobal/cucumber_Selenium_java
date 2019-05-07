package com.ePortal.stepDefinations;


import com.ePortal.global.pageObjects.TGQ_Payment_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class PaymentPageSteps extends BaseClass {

	TGQ_Payment_Page payment_page = new TGQ_Payment_Page(dr);
	Report getReports;

	public PaymentPageSteps() {
		super();
	}

	@When("Provide the mandatory fields and proceed for \"([^\"]*)\" for the quote$")
	public void payment(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		payment_page.paymentTab(applicationType);

	}

}
