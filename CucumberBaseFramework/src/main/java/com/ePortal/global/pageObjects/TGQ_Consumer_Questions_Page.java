package com.ePortal.global.pageObjects;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;
import com.ePortal.wrapperClasses.MyWait;
import com.ePortal.wrapperClasses.MyWebElement;

public class TGQ_Consumer_Questions_Page extends TheGeneralAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Consumer_Questions_Page.class.getName());

	// Page Factory

	@FindBy(how = How.LINK_TEXT, using = "Verify Address")
	public WebElement tgq_verify_address;
	@FindBy(how = How.XPATH, using = "//*[@id='qas_pending']/h2/span")
	public WebElement tqq_address_text;
	@FindBy(how = How.LINK_TEXT, using = "I am sure the address is correct as entered")
	public WebElement tgq_use_entered_address;
	@SuppressWarnings("rawtypes")
	@FindAll(value = { @FindBy(how = How.NAME, using = "orders.creditOrder.action.value") })
	public LinkedList tgq_action;
	@FindBy(how = How.LINK_TEXT, using = "Order Credit")
	public WebElement tgq_order_credit;
	@FindBy(how = How.LINK_TEXT, using = "Update Credit")
	public WebElement tgq_update_credit;
	@FindBy(how = How.LINK_TEXT, using = "Order Prior Insurance")
	public WebElement tgq_Order_Prior_Insurance;
	@FindBy(how = How.LINK_TEXT, using = "Order MVR")
	public WebElement tgq_order_mvr;

	@SuppressWarnings("rawtypes")
	@FindAll(value = { @FindBy(how = How.XPATH, using = "//*[@id='driver0Vios']/div/input[2]") })
	public LinkedList tgq_mvr_action;
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

	public void consumerquestions(String applicationType) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {
			if (currentHash.get("PolicyType").equals("Bond - No Credit")) {
				if (MyWebElement.isElementExist("Verify Address")) {
					if (tqq_address_text.getText().equals("Address verification will be attempted now")) {
						tgq_verify_address.click();
						;
					}
					MyWait.until(ldriver, "ELEMENT_VISIBLE", 10, tgq_use_entered_address);
					if (tqq_address_text.getText().equals("Address verification")) {
						tgq_use_entered_address.click();
						;
					}
				}
				if (MyWebElement.isElementExist("Order MVR")) {
					tgq_order_mvr.click();
					List<WebElement> rdBtn_mvr = dr.findElements(By.name("order[2].action.value"));
					rdBtn_mvr.get(1).click();
					tgq_update_mvr.click();
				}
				

			} else {
				if (tgq_verify_address.isDisplayed()) {
					if (tqq_address_text.getText().equals("Address verification will be attempted now")) {
						tgq_verify_address.click();
						;
					}
					MyWait.until(ldriver, "ELEMENT_VISIBLE", 10, tgq_use_entered_address);
					if (tqq_address_text.getText().equals("Address verification")) {
						tgq_use_entered_address.click();
						;
					}
				}
				WebElement ele = (WebElement) tgq_action.getLast();
				ele.click();
				tgq_order_credit.click();
				tgq_update_credit.click();

				tgq_Order_Prior_Insurance.click();

				tgq_order_mvr.click();

				tgq_update_mvr.click();

				tgq_order_clue.click();

			}

			tgq_save.click();
			;
			tgq_next_btn.click();
			;

			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_consumerquestions_" + applicationType + ".png");

//			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
//					"Successfully_answered_consumerquestions '" + applicationType + "' application",
//					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
//						+ "1_consumerquestions_" + applicationType + ".png");

		} catch (Exception exp) {
			log.error(exp.getMessage());
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Error_consumerquestions_" + applicationType + ".png");
			Report.logTestCaseStatusWithSnapShot(parentTestCase, "FAIL",
					"<font color=red><b>Error consumerquestions '" + applicationType
							+ "' application: </b></font><br />" + exp.getMessage() + "<br />",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Error_consumerquestions_" + applicationType + ".png");
			throwException(
					"Unable answer consumerquestions " + applicationType + "application \n" + exp.getMessage() + "\n");
		}
		log.info("METHOD(login) EXECUTED SUCCESSFULLY");

	}

}
