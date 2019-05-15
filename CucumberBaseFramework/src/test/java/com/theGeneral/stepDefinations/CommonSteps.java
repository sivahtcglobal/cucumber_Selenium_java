package com.theGeneral.stepDefinations;

import com.theGeneral.global.pageObjects.GlobalCommonObjects;
import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps extends BaseClass {

	public CommonSteps() {

		super();
	}

	GlobalCommonObjects globalComPageObj = new GlobalCommonObjects(dr);

	@Then("^user quits the browser$")
	public void closeBrowser() throws Exception {

		if (dr == null) {
			return;
		}
		dr.quit();
		dr = null;
	}

	@Given("user launches \"([^\"]*)\" URL$")
	public void launchUrl(String applicationType) throws InterruptedException, MyOwnException {
		initialization(applicationType);
	}

}
