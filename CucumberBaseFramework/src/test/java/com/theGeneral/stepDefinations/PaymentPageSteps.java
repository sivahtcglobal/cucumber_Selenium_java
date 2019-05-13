package com.theGeneral.stepDefinations;


import com.theGeneral.global.pageObjects.TGQ_Payment_Page;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class PaymentPageSteps extends BaseClass {

	TGQ_Payment_Page payment_page = new TGQ_Payment_Page(dr);
	Report getReports;

	public PaymentPageSteps() {
		super();
	}

	@When("Provide the mandatory fields and proceed for \"([^\"]*)\" for the quote$")
	public void payment(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "PaymentPage");
		Report.assignCategoryToTestCase(parentTestCase, "PaymentPage");

		payment_page.paymentTab(applicationType);

	}

}
