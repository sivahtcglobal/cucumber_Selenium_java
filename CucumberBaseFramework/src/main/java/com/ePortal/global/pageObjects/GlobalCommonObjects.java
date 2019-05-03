package com.ePortal.global.pageObjects;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How; 
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ePortal.utilities.BaseClass;
import com.ePortal.utilities.MyOwnException;
import com.ePortal.utilities.Report;
import com.ePortal.wrapperClasses.MyWait;
import com.ePortal.wrapperClasses.MyWebElement;

public class GlobalCommonObjects extends BaseClass {

	private static final Logger log = LogManager.getLogger(GlobalCommonObjects.class.getName());
	public static int count = 0;

	WebDriver ldriver;

	public GlobalCommonObjects(WebDriver dr) {

		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	public WebElement Logout_Link;

	public void logOut_ePortal(String appType) throws MyOwnException, InterruptedException, AWTException {
		try {
			MyWait.until(dr, "ELEMENT_CLICKABLE", 30, dr.findElement(By.linkText("Logout")));
			dr.findElement(By.linkText("Logout")).click();

		} catch (Exception exp) {
			{
				throwException("UNABLE TO Logout from  " + appType + " application \n" + exp.getMessage() + "\n");
			}

		}
	}

	public void verifyPageTitle(String screenName) throws MyOwnException, InterruptedException {

		try {

			String actual = dr.getTitle();
			String expected;
			if (screenName.equalsIgnoreCase("Homepage")) {
				expected = prop.getProperty("TGQHomeTitle");
				assertEquals(actual, expected);
			}

			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "Verify_Title_" + screenName + ".png");

			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
					"User Successfully Redirected to '" + screenName + "' screen",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "Verify_Title_" + screenName + ".png");
		} catch (Exception exp) {

			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "Error_Verify_Title_" + screenName + ".png");

			Report.logTestCaseStatusWithSnapShot(parentTestCase, "FAIL", "Error redirecting user to '" + screenName,
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "Error_Verify_Title_" + screenName + ".png");

			throwException("UNABLE TO verify page title in " + screenName + " screen \n" + exp.getMessage() + "\n");
		}

	}
}
