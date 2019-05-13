package com.theGeneral.stepDefinations;


import com.theGeneral.global.pageObjects.TGQ_Vehicles_Edit_Page;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

import cucumber.api.java.en.When;

public class VehiclesEditSteps extends BaseClass {

	TGQ_Vehicles_Edit_Page vehiclesEdit_page = new TGQ_Vehicles_Edit_Page(dr);
	Report getReports;

	public VehiclesEditSteps() {
		super();
	}

	@When("Edit the required fields in the \"([^\"]*)\" tab recalculate in the Vehicles Edit tab and click on Next button$")
	public void vehiclesEdit(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "VehiclesEdit");
		Report.assignCategoryToTestCase(parentTestCase, "VehiclesEdit");

		vehiclesEdit_page.vehiclesedit(applicationType);

	}

}
