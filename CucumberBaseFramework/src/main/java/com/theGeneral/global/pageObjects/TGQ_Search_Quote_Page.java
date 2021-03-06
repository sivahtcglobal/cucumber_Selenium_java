package com.theGeneral.global.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;
import com.theGeneral.wrapperClasses.MyWait;
import com.theGeneral.wrapperClasses.MyWebElement;

public class TGQ_Search_Quote_Page extends TheGeneralAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_Search_Quote_Page.class.getName());

	// Page Factory

	@FindBy(how = How.NAME, using = "quoteNumber")
	public WebElement quote_number;
	@FindBy(how = How.LINK_TEXT, using = "Search")
	public WebElement search;
	@FindBy(how = How.LINK_TEXT, using = "11536115")
	public WebElement quote_number_intable;
	@FindBy(how = How.XPATH, using = "//*[@id='body']/form/div[12]/table/tbody/tr/td[3]/a")
	public WebElement get_quote;
	@FindBy(how = How.XPATH, using = "//*[@id=\"n6\"]/a")
	public WebElement consumerTab;

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
			ldriver.manage().window().maximize();
			MyWebElement.enterText(quote_number, "11536115");
			search.click();
			
			BaseClass.screenShot("./Results/Screenshots_" + testRunTimeStamp + "/" + "1_Searched_quote_" + applicationType + ".png");

			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
					"Successfully_Logged_into_ '" + applicationType + "' application",
					"./Results/Screenshots_"+ testRunTimeStamp + "/"
							+ "1_Searched_quote_" + applicationType + ".png");
			quote_number_intable.click();
			get_quote.click();
			consumerTab.click();

		} catch (Exception exp) {
			log.error(exp.getMessage());
			BaseClass.screenShot("./Results/Screenshots_" + testRunTimeStamp + "/" + "1_Error_" + applicationType + ".png");
			Report.logTestCaseStatusWithSnapShot(parentTestCase, "FAIL",
					"<font color=red><b>Error while Logging into '" + applicationType
							+ "' application: </b></font><br />" + exp.getMessage() + "<br />",
							"./Results/Screenshots_"+ testRunTimeStamp + "/"
							+ "1_Error_" + applicationType + ".png");
			throwException("Unable To   " + applicationType + "application \n" + exp.getMessage() + "\n");
		}
		log.info("METHOD(login) EXECUTED SUCCESSFULLY");

	}

}
