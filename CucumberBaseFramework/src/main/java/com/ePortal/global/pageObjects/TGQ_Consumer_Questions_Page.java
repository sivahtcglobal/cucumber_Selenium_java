package com.ePortal.global.pageObjects;



import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;
import com.ePortal.wrapperClasses.MyWait;
import com.ePortal.wrapperClasses.MyWebElement;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.sym.Name;

public class TGQ_Consumer_Questions_Page extends EportalAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Consumer_Questions_Page.class.getName());

	// Page Factory

	@FindBy(how = How.LINK_TEXT, using = "Verify Address")
	public WebElement tgq_verify_address;
	@FindBy(how = How.XPATH, using = "//*[@id='qas_pending']/h2/span")
	public WebElement tqq_address_text;
	@FindBy(how = How.LINK_TEXT, using = "I am sure the address is correct as entered")
	public WebElement tgq_use_entered_address;
	@SuppressWarnings("rawtypes")
	@FindAll(value = { @FindBy (how= How.NAME,using= "orders.creditOrder.action.value") })
	public LinkedList tgq_action;
	@FindBy(how = How.LINK_TEXT, using = "Order Credit")
	public WebElement tgq_order_credit;
	@FindBy(how = How.LINK_TEXT, using = "Update Credit")
	public WebElement tgq_update_credit;
	@FindBy(how = How.LINK_TEXT, using = "Order Prior Insurance")
	public WebElement tgq_Order_Prior_Insurance;
	@FindBy(how = How.LINK_TEXT, using = "Order MVR")
	public WebElement tgq_order_mvr;
	@FindBy(how = How.LINK_TEXT, using = "Update MVR")
	public WebElement tgq_update_mvr;
	@FindBy(how = How.LINK_TEXT, using = "Order CLUE")
	public WebElement tgq_order_clue;
	@FindBy(how = How.LINK_TEXT, using = "Save")
	public WebElement tgq_save;
	@FindBy(how = How.LINK_TEXT, using = "Next")
	public WebElement tgq_next_btn;

	WebDriver ldriver;

	public TGQ_Consumer_Questions_Page(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void login(String applicationType) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {
			MyWebElement.clickOn(tgq_verify_address);
			MyWebElement.clickOn(tgq_use_entered_address);
			WebElement ele=(WebElement) tgq_action.getLast();
			MyWebElement.clickOn(ele);
			MyWebElement.clickOn(tgq_order_credit);
			MyWebElement.clickOn(tgq_update_credit);
			MyWebElement.clickOn(tgq_Order_Prior_Insurance);
			MyWebElement.clickOn(tgq_order_mvr);
			MyWebElement.clickOn(tgq_update_mvr);
			MyWebElement.clickOn(tgq_order_clue);
			MyWebElement.clickOn(tgq_save);
			MyWebElement.clickOn(tgq_next_btn);
			
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
