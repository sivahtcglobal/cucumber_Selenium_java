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

public class TGQ_Application_Questions_Page extends EportalAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Application_Questions_Page.class.getName());

	// Page Factory

	@FindBy(how = How.NAME, using = "quoteBean.appQuestions[0].writableValue")
	public WebElement appQuestions_1;
	@FindBy(how = How.NAME, using = "quoteBean.appQuestions[1].writableValue")
	public WebElement appQuestions_2;
	@FindBy(how = How.NAME, using = "quoteBean.appQuestions[2].writableValue")
	public WebElement appQuestions_3;
	@FindBy(how = How.NAME, using = "quoteBean.appQuestions[3].writableValue")
	public WebElement appQuestions_4;
	@FindBy(how = How.NAME, using = "quoteBean.appQuestions[4].writableValue")
	public WebElement appQuestions_5;
	@FindBy(how = How.NAME, using = "quoteBean.appQuestions[5].writableValue")
	public WebElement appQuestions_6;
	@FindBy(how = How.LINK_TEXT, using = "Next")
	public WebElement next_button;

	WebDriver ldriver;

	public TGQ_Application_Questions_Page(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void login(String applicationType) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {

			Select appQue_1 = new Select(appQuestions_1);
			appQue_1.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select appQue_2 = new Select(appQuestions_2);
			appQue_2.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select appQue_3 = new Select(appQuestions_3);
			appQue_3.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select appQue_4 = new Select(appQuestions_4);
			appQue_4.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select appQue_5 = new Select(appQuestions_5);
			appQue_5.selectByVisibleText( prop.getProperty("TGQPassword"));
			Select appQue_6 = new Select(appQuestions_6);
			appQue_6.selectByVisibleText( prop.getProperty("TGQPassword"));
			
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
