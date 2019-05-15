package com.theGeneral;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//{"classpath:multicolumn.feature","classpath:outline.feature"},



@CucumberOptions(features = "src/test/resources/features",monochrome=false,strict=true, glue = { "com.theGeneral.stepDefinations" }, tags = {
				"@NewQuote" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
						"json:target/cucumber-reports/CucumberTestReport.json",
						"rerun:target/cucumber-reports/rerun.txt" })
public class TestRunner extends BaseClass {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		readSpecificTestData(System.getProperty("TestCaseId"));
		initiateReport();
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void runScenario(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
		// the 'featureWrapper' parameter solely exists to display the feature file in a
		// test report
		testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
	}

	/**
	 * Returns two dimensional array of PickleEventWrapper scenarios with their
	 * associated CucumberFeatureWrapper feature.
	 *
	 * @return a two dimensional array of scenarios features.
	 */
	@DataProvider
	public Object[][] scenarios() {
		if (testNGCucumberRunner == null) {
			return new Object[0][0];
		}
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {

		Report.writeContents(report);
		// sendEmail();

		// if (dr == null) {
		// return;
		// }
		// dr.quit();
		// dr = null;

		if (testNGCucumberRunner == null) {
			return;
		}
		testNGCucumberRunner.finish();

	}
}