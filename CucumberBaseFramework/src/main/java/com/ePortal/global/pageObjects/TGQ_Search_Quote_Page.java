package com.ePortal.global.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
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

public class TGQ_Search_Quote_Page extends TheGeneralAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Search_Quote_Page.class.getName());

	// Page Factory

	@FindBy(how = How.NAME, using = "quoteNumber")
	public WebElement quote_number;
	@FindBy(how = How.LINK_TEXT, using = "Search")
	public WebElement search;
	@FindBy(how = How.LINK_TEXT, using = "11531304")
	public WebElement quote_number_intable;
	@FindBy(how = How.XPATH, using = "//*[@id='body']/form/div[12]/table/tbody/tr/td[3]/a")
	public WebElement get_quote;
	WebDriver ldriver;

	public TGQ_Search_Quote_Page(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void enterquote(String applicationType) throws MyOwnException, InterruptedException {
		
		try {
			 for (String handle1 : ldriver.getWindowHandles()) {
		          ldriver.switchTo().window(handle1);
		          }
		         ldriver.manage().window().maximize() ;
			MyWebElement.enterText(quote_number, "11531304");
			search.click();;
			quote_number_intable.click();
			get_quote.click();
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_ " + applicationType + ".png");

//			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
//					"Successfully_Logged_into_ '" + applicationType + "' application",
//					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
//							+ "1_Created_quote_" + applicationType + ".png");

		} catch (Exception exp) {
			log.error(exp.getMessage());
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Error_" + applicationType + ".png");
			Report.logTestCaseStatusWithSnapShot(parentTestCase, "FAIL",
					"<font color=red><b>Error while Logging into '" + applicationType
							+ "' application: </b></font><br />" + exp.getMessage() + "<br />",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Error_" + applicationType + ".png");
			throwException("Unable To   " + applicationType + "application \n" + exp.getMessage() + "\n");
		}
		log.info("METHOD(login) EXECUTED SUCCESSFULLY");

	}

}
