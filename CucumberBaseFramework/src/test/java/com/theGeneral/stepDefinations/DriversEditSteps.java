package com.theGeneral.stepDefinations;

import com.ePortal.global.pageObjects.TGQ_Drivers_Edit_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class DriversEditSteps extends BaseClass {

	TGQ_Drivers_Edit_Page driversEdit_page = new TGQ_Drivers_Edit_Page(dr);
	Report getReports;

	public DriversEditSteps() {
		super();
	}

	@When("Edit the required fields in the \"([^\"]*)\" tab recalculate in drivers Edit tab and click on Next button$")
	public void driversEdit(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		driversEdit_page.driversedit(applicationType);

	}

}
