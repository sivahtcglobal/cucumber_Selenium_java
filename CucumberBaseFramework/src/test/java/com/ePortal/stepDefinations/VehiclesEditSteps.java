package com.ePortal.stepDefinations;


import com.ePortal.global.pageObjects.TGQ_Vehicles_Edit_Page;
import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;

import cucumber.api.java.en.When;

public class VehiclesEditSteps extends BaseClass {

	TGQ_Vehicles_Edit_Page vehiclesEdit_page = new TGQ_Vehicles_Edit_Page(dr);
	Report getReports;

	public VehiclesEditSteps() {
		super();
	}

	@When("Edit the required fields in the \"([^\"]*)\" tab recalculate in the Vehicles Edit tab and click on Next button$")
	public void vehiclesEdit(String applicationType) throws InterruptedException, MyOwnException {

		parentTestCase = Report.makeTestCaseEntry(report, "TheGeneral");
		Report.assignCategoryToTestCase(parentTestCase, "TheGeneral");

		vehiclesEdit_page.vehiclesedit(applicationType);

	}

}
