package com.theGeneral.stepDefinations;


import com.ePortal.global.pageObjects.MarsApplicationLoginPage;
import com.ePortal.global.pageObjects.TGQ_Search_Quote_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuoteSearchUsingQuoteNumber extends BaseClass {

	MarsApplicationLoginPage quoteSearch_page = new MarsApplicationLoginPage(dr);
	TGQ_Search_Quote_Page search_page = new TGQ_Search_Quote_Page(dr);
	Report getReports;

	public QuoteSearchUsingQuoteNumber() {
		super();
	}

	@When("Click on the \"([^\"]*)\" button$")
	public void quoteSearch(String applicationType,String operation) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		quoteSearch_page.login(applicationType,operation);

	}
	@Then("The Quote number is provided in \"([^\"]*)\"$")
	public void enterQuote(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		search_page.enterquote(applicationType);

	}

}
