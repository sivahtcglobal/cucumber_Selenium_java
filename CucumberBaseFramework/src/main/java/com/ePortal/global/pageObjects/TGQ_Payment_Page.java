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

public class TGQ_Payment_Page extends EportalAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Payment_Page.class.getName());

	// Page Factory

	@FindBy(how = How.ID, using = "cashPayment.paymentAmount.value")
	public WebElement cash_value;
	@FindBy(how = How.ID, using = "checkPayment.paymentAmount.value")
	public WebElement check_value;
	@FindBy(how = How.ID, using = "checkPayment.checkNumber.value")
	public WebElement check_number;
	@FindBy(how= How.ID,using= "moneyOrderPayment.paymentAmount.value")
	public WebElement money_order_value;
	@FindBy(how = How.ID, using = "moneyOrderPayment.moneyOrderNumber.value")
	public WebElement moneyorder_number;
	@FindBy(how = How.ID, using = "bankDraftPayment.paymentAmount.value")
	public WebElement ins_bank_draft;
	@FindBy(how = How.ID, using = "bankDraftPayment.accountType.writableValue")
	public WebElement act_type;
	@FindBy(how = How.ID, using = "bankDraftPayment.routingNumber.value")
	public WebElement routing_number;
	@FindBy(how = How.ID, using = "bankDraftPayment.accountNumber.value")
	public WebElement account_number;
	@FindBy(how = How.ID, using = "creditCardPayment.paymentAmount.value")
	public WebElement ins_debit_credit;
	@FindBy(how = How.ID, using = "creditCardPayment.accountNumber.value")
	public WebElement card_number;
	@FindBy(how = How.ID, using = "creditCardPayment.cardholderName.value")
	public WebElement name_on_card;
	@FindBy(how = How.ID, using = "creditCardPayment.expirationMonth.writableValue")
	public WebElement card_expiry_month;
	@FindBy(how = How.ID, using = "creditCardPayment.expirationYear.writableValue")
	public WebElement card_expiry_year;
	@FindBy(how = How.XPATH, using = "//*[@id='quoteSummaryTable']/tbody/tr[3]/td[4]")
	public WebElement downpayment_value;
	@FindBy(how = How.XPATH, using = "//*[@id='body']/form/table[3]/tbody/tr[3]/td[2]")
	public WebElement policy_num;
	@FindBy(how = How.XPATH, using = "//*[@id='quoteSummaryTable']/tbody/tr[3]/td[2]")
	public WebElement quote_num;
	@FindBy(how = How.LINK_TEXT, using = "Process Payment")
	public WebElement process_payment_button;


	WebDriver ldriver;

	public TGQ_Payment_Page(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void login(String applicationType) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {
			/*
			 * Select signup_paperless_val = new Select(signup_paperless);
			 * signup_paperless_val.selectByVisibleText( prop.getProperty("TGQPassword"));
			 * MyWebElement.enterText(prim_num1, prop.getProperty("TGQUserName"));
			 * MyWebElement.enterText(prim_num2, prop.getProperty("TGQUserName"));
			 * MyWebElement.enterText(prim_num3, prop.getProperty("TGQUserName")); Select
			 * account_alerts_val = new Select(account_alerts);
			 * account_alerts_val.selectByVisibleText( prop.getProperty("TGQPassword"));
			 * MyWebElement.enterText(alt_num1, prop.getProperty("TGQUserName"));
			 * MyWebElement.enterText(alt_num2, prop.getProperty("TGQUserName"));
			 * MyWebElement.enterText(alt_num3, prop.getProperty("TGQUserName")); Select
			 * closing_method_val = new Select(closing_method);
			 * closing_method_val.selectByVisibleText( prop.getProperty("TGQPassword"));
			 * MyWebElement.clickOn(tgq_next_btn);
			 */
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
