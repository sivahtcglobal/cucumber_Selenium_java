package com.theGeneral.wrapperClasses;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

public class MyWebBrowser extends Report {

	private static final Logger log = LogManager.getLogger(MyWebBrowser.class.getName());

	static Alert alert;

	public static void close(WebDriver ldriver) throws MyOwnException {

		log.info("INTEND TO CLOSE BROWSER SESSION");
		try {
			if (ldriver != null) {
				ldriver.close();
			} else {
				log.error("WEBDRIVER INSTANCE SEEMS TO BE NULL");
				throwException("WEBDRIVER INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO CLOSE THE CURRENT BROWSER SESSION\n" + e.getMessage());
			throwException("UNABLE TO CLOSE THE CURRENT BROWSER SESSION\n" + e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY CLOSED THE CURRENT BROWSER SESSION");
	}

	public static void quit(WebDriver ldriver) throws MyOwnException {

		log.info("INTEND TO QUIT THE BROWSER SESSIONS");
		try {
			if (ldriver != null) {
				ldriver.quit();
			} else {
				log.error("WEBDRIVER INSTANCE SEEMS TO BE NULL");
				throwException("WEBDRIVER INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO CLOSE ALL THE ACTIVE BROWSER SESSIONS\n" + e.getMessage());
			throwException("UNABLE TO CLOSE ALL THE ACTIVE BROWSER SESSIONS\n" + e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY CLOSED ALL THE ACTIVE BROWSER SESSIONS");
	}


	public static void maximize(WebDriver ldriver) throws MyOwnException {

		log.info("INTEND TO MAXIMIZE CURRENT BROWSER SESSION");
		try {
			if (ldriver != null) {
				ldriver.manage().window().maximize();
			} else {
				log.error("WEBDRIVER INSTANCE SEEMS TO BE NULL");
				throwException("WEBDRIVER INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO MAXIMIZE CURRENT BROWSER SESSION\n" + e.getMessage());
			throwException("UNABLE TO MAXIMIZE CURRENT BROWSER SESSION\n" + e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY MAXIMIZED CURRENT BROWSER SESSION");
	}

	

	public static void navigateToUrl(WebDriver ldriver, String url) throws MyOwnException {

		log.info("INTEND TO NAVIGATE TO THE SPECIFIED URL IN CURRENT BROWSER SESSION");
		try {
			if (ldriver != null) {
				if (notEmpty(url)) {
					ldriver.navigate().to(url);
				} else {
					log.error("URL SEEMS TO BE EMPTY");
					throwException("URL SEEMS TO BE EMPTY" + "\n");
				}
			} else {
				log.error("WEBDRIVER INSTANCE SEEMS TO BE NULL");
				throwException("WEBDRIVER INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO NAVIGATE TO THE SPECIFIED URL(" + url + ")\n" + e.getMessage());
			throwException("UNABLE TO NAVIGATE TO THE SPECIFIED URL(" + url + ")\n" + e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY NAVIGATED TO SPCIFIED URL(" + url + ")");
	}



}