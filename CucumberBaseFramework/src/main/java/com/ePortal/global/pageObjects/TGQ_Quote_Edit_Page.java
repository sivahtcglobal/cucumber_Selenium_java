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

public class TGQ_Quote_Edit_Page extends EportalAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Quote_Edit_Page.class.getName());

	// Page Factory

	@FindBy(how = How.NAME, using = "quoteBean.vehicles[0].compDed.writableValue")
	public WebElement comp_ded;
	@FindBy(how = How.NAME, using = "quoteBean.vehicles[0].collDed.writableValue")
	public WebElement coll_ded;
	@FindBy(how = How.ID, using = "quoteBean.vehicles[0].towingLimit.writableValue")
	public WebElement towing;
	@FindBy(how = How.LINK_TEXT, using = "Recalculate")
	public WebElement recalculate_button;
	@FindBy(how = How.LINK_TEXT, using = "Next")
	public WebElement next_button;

	WebDriver ldriver;

	public TGQ_Quote_Edit_Page(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void login(String applicationType) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {

			Select comp_ded_q = new Select(comp_ded);
			comp_ded_q.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select coll_ded_q = new Select(coll_ded);
			coll_ded_q.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select towing_q = new Select(towing);
			towing_q.selectByVisibleText( prop.getProperty("TGQPassword"));
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
