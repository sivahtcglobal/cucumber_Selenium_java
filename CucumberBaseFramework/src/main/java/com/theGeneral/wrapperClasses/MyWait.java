package com.theGeneral.wrapperClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

public class MyWait extends Report {

	private static final Logger log = LogManager.getLogger(MyWait.class.getName());

	static WebDriverWait wait;


	

	public static void until(WebDriver ldriver, String expectedCondition, int duration, WebElement element)
			throws MyOwnException {

		log.info("INTEND TO PAUSE THE EXECUTION EXPLICITLY");
		try {
			if (ldriver != null) {
				wait = new WebDriverWait(ldriver, duration);
				if (notEmpty(expectedCondition)) {
					if (duration > 0) {
						if (expectedCondition.equalsIgnoreCase("ELEMENT_CLICKABLE")) {
							wait.until(ExpectedConditions.elementToBeClickable(element));
						} else if (expectedCondition.equalsIgnoreCase("ELEMENT_SELECTED")) {
							wait.until(ExpectedConditions.elementToBeSelected(element));
						} else if (expectedCondition.equalsIgnoreCase("FRAME_AVAILABLE")) {
							wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
						} else if (expectedCondition.equalsIgnoreCase("ELEMENT_INVISIBLE")) {
							//wait.until(ExpectedConditions.invisibilityOf(element));
						} else if (expectedCondition.equalsIgnoreCase("ELEMENT_STALENESS")) {
							wait.until(ExpectedConditions.stalenessOf(element));
						} else if (expectedCondition.equalsIgnoreCase("ELEMENT_VISIBLE")) {
							wait.until(ExpectedConditions.visibilityOf(element));
						} else {
							log.error("EXPECTED CONDITION SEEMS TO BE INCORRECT");
							throwException("EXPECTED CONDITION SEEMS TO BE INCORRECT" + "\n");
						}
					} else {
						log.error("WAIT DURATION CANNOT BE IN NEGATIVE");
						throwException("WAIT DURATION CANNOT BE IN NEGATIVE" + "\n");
					}
				} else {
					log.error("EXPECTED CONDITION SEEMS TO BE EMPTY");
					throwException("EXPECTED CONDITION SEEMS TO BE EMPTY" + "\n");
				}
			} else {
				log.error("WEBDRIVER INSTANCE EEMS TO BE NULL");
				throwException("WEBDRIVER INSTANCE EEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO WAIT FOR (" + duration + ") SECONDS UNTIL EXPECTED CONDITION(" + expectedCondition
					+ ") \n" + e.getMessage());
			throwException("UNABLE TO WAIT FOR (" + duration + ") SECONDS UNTIL EXPECTED CONDITION(" + expectedCondition
					+ ") \n" + e.getMessage() + "\n");
		}
		log.info("PAUSED THE EXECUTION EXPLICITLY UNTIL (" + expectedCondition + ") FOR (" + duration + ") SECONDS");
	}

	
}