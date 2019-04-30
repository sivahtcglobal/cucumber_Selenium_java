package com.ePortal.global.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;
import com.ePortal.wrapperClasses.MyWait;
import com.ePortal.wrapperClasses.MyWebElement;

public class TGQ_Drivers_Edit_Page extends EportalAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Drivers_Edit_Page.class.getName());

	// Page Factory

	@FindBy(how = How.ID, using = "drivers[0].stateLicensed.writableValue")
	public WebElement state_lic;
	@FindBy(how = How.ID, using = "drivers[0].socialSecurityNumber.value")
	public WebElement ssn;
	@FindBy(how = How.ID, using = "drivers[0].driverLicenseNumber.value")
	public WebElement dl;
	@FindBy(how = How.LINK_TEXT, using = "Recalculate")
	public WebElement recalculate_button;
	@FindBy(how = How.LINK_TEXT, using = "Next")
	public WebElement next_button;

	WebDriver ldriver;

	public TGQ_Drivers_Edit_Page(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void login(String applicationType) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {

			Select state_lic_dr = new Select(state_lic);
			state_lic_dr.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select ssn_dr = new Select(ssn);
			ssn_dr.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select dl_dr = new Select(dl);
			dl_dr.selectByVisibleText( prop.getProperty("TGQPassword"));
			MyWebElement.clickOn(recalculate_button);
			MyWebElement.clickOn(next_button);
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Login_to_" + applicationType + ".png");

			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
					"Successfully_Logged into '" + applicationType + "' application",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Login_to_" + applicationType + ".png");

		} catch (Exception exp) {
			log.error(exp.getMessage());
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Error_Logging_into_" + applicationType + ".png");
			Report.logTestCaseStatusWithSnapShot(parentTestCase, "FAIL",
					"<font color=red><b>Error while Logging into '" + applicationType
							+ "' application: </b></font><br />" + exp.getMessage() + "<br />",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Error_Logging_into_" + applicationType + ".png");
			throwException("Unable To login to the " + applicationType + "application \n" + exp.getMessage() + "\n");
		}
		log.info("METHOD(login) EXECUTED SUCCESSFULLY");

	}

}
