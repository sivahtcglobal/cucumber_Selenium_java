package com.theGeneral.stepDefinations;

import com.theGeneral.global.pageObjects.GlobalCommonObjects;
import com.theGeneral.utilities.BaseClass;

import cucumber.api.java.en.And;

public class CommonSteps extends BaseClass {

	public CommonSteps() {

		super();
	}

	GlobalCommonObjects globalComPageObj = new GlobalCommonObjects(dr);

	@And("^user quits the browser$")
	public void closeBrowser() throws Exception {

		if (dr == null) {
			return;
		}
		dr.quit();
		dr = null;
	}
	

}
