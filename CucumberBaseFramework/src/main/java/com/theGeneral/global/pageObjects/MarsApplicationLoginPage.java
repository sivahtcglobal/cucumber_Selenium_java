package com.theGeneral.global.pageObjects;

import java.util.Iterator;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.theGeneral.utilities.BaseClass;
import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;
import com.theGeneral.wrapperClasses.MyWait;
import com.theGeneral.wrapperClasses.MyWebElement;

public class MarsApplicationLoginPage extends TheGeneralAllPages {

	private static final Logger log = LogManager.getLogger(MarsApplicationLoginPage.class.getName());

	// Page Factory

	@FindBy(how = How.CLASS_NAME, using = "OrangeGradientButton")
	public WebElement signin_button;

	@FindBy(how = How.NAME, using = "agencyid")
	public WebElement mars_agencyid;

	@FindBy(how = How.NAME, using = "pwd")
	public WebElement mars_password;

	@FindBy(how = How.XPATH, using = "//*[@id='maincontent']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div[1]/div/div/div/div/div/div/div/div/div/table/tbody/tr[3]/td/input")
	public WebElement new_Quote;
	@FindBy(how = How.XPATH, using = "//*[@id='maincontent']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/div[1]/div/div/div/div/div/div/div/div/div/table/tbody/tr[5]/td/input")
	public WebElement quote_Search;
	WebDriver ldriver;

	public MarsApplicationLoginPage(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void login(String applicationType, String operation) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {
//			for(int i = 0; i < BaseClass.mydata.size(); i++)
//		    {
//
//		         Iterator it = (Iterator)BaseClass.mydata.get(i).entrySet().iterator();
//
//		         while (it.hasNext()) {
//		            Map.Entry pairs = (Map.Entry)it.next();
//		            System.out.println(pairs.getKey() + " = " + pairs.getValue());
//		            it.remove(); // avoids a ConcurrentModificationException
//		        }
//
//		    }

			MyWebElement.enterText(mars_agencyid, currentHash.get("Username"));
			MyWebElement.enterText(mars_password, currentHash.get("Password"));
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Login_to_" + applicationType + ".png");
			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
					"Successfully_Logged into '" + applicationType + "' application",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Login_to_" + applicationType + ".png");
			MyWait.until(dr, "ELEMENT_CLICKABLE", 30, signin_button);
			MyWebElement.clickOnButton(signin_button);
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_HomePage_" + applicationType + ".png");
			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
					"Successfully_Logged into '" + applicationType + "' application",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_HomePage_" + applicationType + ".png");
			if (operation.equals("New Quote")) {
				MyWebElement.clickOnButton(new_Quote);
			} else if (operation.equals("QuoteSearch")) {
				MyWebElement.clickOnButton(quote_Search);

			}

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
