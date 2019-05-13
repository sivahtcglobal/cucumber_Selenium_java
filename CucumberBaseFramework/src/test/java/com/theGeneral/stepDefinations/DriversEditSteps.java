package com.theGeneral.stepDefinations;

import com.theGeneral.global.pageObjects.TGQ_Drivers_Edit_Page;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class DriversEditSteps extends BaseClass {

	TGQ_Drivers_Edit_Page driversEdit_page = new TGQ_Drivers_Edit_Page(dr);
	Report getReports;

	public DriversEditSteps() {
		super();
	}

	@When("Edit the required fields in the \"([^\"]*)\" tab recalculate in drivers Edit tab and click on Next button$")
	public void driversEdit(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "DriversEdit");
		Report.assignCategoryToTestCase(parentTestCase, "DriversEdit");

		driversEdit_page.driversedit(applicationType);

	}

}
