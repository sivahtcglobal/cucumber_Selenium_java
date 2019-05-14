package com.theGeneral.wrapperClasses;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.theGeneral.utilities.MyOwnException;
import com.theGeneral.utilities.Report;

public class MyWebElement extends Report {

	private static final Logger log = LogManager.getLogger(MyWebElement.class.getName());
	public static int count = 0;

	public static void clickOn(WebElement element) throws MyOwnException {

		log.info("INTEND TO CLICK SPECIFIED WEBELEMENT");

		try {

			Thread.sleep(1000);
			if (element != null) {
				MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
				MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);

				if (isDisplayedOrNot(element) == true) {
					if (isEnabledOrNot(element) == true) {
						MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
						MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);

						element.click();

						if (!element.isSelected()) {
							MyWebElement.clickOn(element);
						}

					} else {
						log.error("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE");
						throwException("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE" + "\n");
					}
				} else {
					log.error("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE");
					throwException("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE" + "\n");
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
			count = 0;
		} catch (StaleElementReferenceException e) {
			count++;
			if (count > 2) {
				count = 0;
				log.error("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage());
				throwException("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage() + "\n");
			}
			clickOn(element);
		} catch (NoSuchElementException e) {
			count++;
			if (count > 2) {
				count = 0;
				log.error("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage());
				throwException("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage() + "\n");
			}
			clickOn(element);
		} catch (Exception e) {
			count++;
			if (count > 2) {
				count = 0;
				log.error("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage());
				throwException("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage() + "\n");
			}
			clickOn(element);
		}
		log.info("SUCCESSFULLY CLICKED THE SPECIFIED WEBELEMENT(" + element + ")");
	}

	public static void clickOnButton(WebElement element) throws MyOwnException {

		log.info("INTEND TO CLICK SPECIFIED WEBELEMENT");

		try {

			Thread.sleep(1000);
			if (element != null) {
				MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
				MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);

				if (isDisplayedOrNot(element) == true) {
					if (isEnabledOrNot(element) == true) {
						MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
						MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);

						element.click();
					} else {
						log.error("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE");
						throwException("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE" + "\n");
					}
				} else {
					log.error("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE");
					throwException("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE" + "\n");
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
			count = 0;
		} catch (StaleElementReferenceException e) {
			count++;
			if (count > 2) {
				count = 0;
				log.error("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage());
				throwException("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage() + "\n");
			}
			clickOnButton(element);
		} catch (NoSuchElementException e) {
			count++;
			if (count > 2) {
				count = 0;
				log.error("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage());
				throwException("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage() + "\n");
			}
			clickOnButton(element);
		} catch (Exception e) {
			count++;
			if (count > 2) {
				count = 0;
				log.error("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage());
				throwException("UNABLE TO CLICK ON SPECIFIED WEBELEMENT(" + element + ")\n" + e.getMessage() + "\n");
			}
			clickOnButton(element);

		}
		log.info("SUCCESSFULLY CLICKED THE SPECIFIED WEBELEMENT(" + element + ")");
	}

	public static void enterText(WebElement element, String textToType) throws MyOwnException {

		log.info("INTEND TO ENTER TEXT INSIDE SPECIFIED WEBELEMENT");
		try {
			Thread.sleep(1000);
			if (element != null) {
				MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
				// MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);
				if (isDisplayedOrNot(element) == true) {
					if (isEnabledOrNot(element) == true) {
						if (notEmpty(textToType)) {
							element.click();
							element.clear();
							MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
							// MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);
							element.sendKeys(textToType);
						} else {
							log.error("TEXT TO BE ENTERED SEEMS TO BE EMPTY");
							throwException("TEXT TO BE ENTERED SEEMS TO BE EMPTY" + "\n");
						}
					} else {
						log.error("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE");
						throwException("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE" + "\n");
					}
				} else {
					log.error("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE");
					throwException("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE" + "\n");
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (StaleElementReferenceException e) {
			count++;
			if (count > 2) {
				count = 0;
				throwException("UNABLE TO ENTER THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element
						+ ")\n" + e.getMessage() + "\n");
			}
			enterText(element, textToType);
		} catch (NoSuchElementException ele) {
			count++;
			if (count > 2) {
				count = 0;
				throwException("UNABLE TO ENTER THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element
						+ ")\n" + ele.getMessage() + "\n");
			}
			enterText(element, textToType);
		} catch (Exception e) {
			count++;
			if (count > 2) {
				count = 0;
				log.error("UNABLE TO ENTER THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element + ")\n"
						+ e.getMessage());
				throwException("UNABLE TO ENTER THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element
						+ ")\n" + e.getMessage() + "\n");
			}

			enterText(element, textToType);
		}
		log.info("SUCCESSFULLY ENTERED THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element + ")");
	}

	public static void uploadFile(WebElement element, String textToType) throws MyOwnException {

		log.info("INTEND TO ENTER TEXT INSIDE SPECIFIED WEBELEMENT");
		try {
			if (element != null) {
				MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
				MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);
				if (isDisplayedOrNot(element) == true) {
					if (isEnabledOrNot(element) == true) {
						if (notEmpty(textToType)) {
							MyWait.until(dr, "ELEMENT_VISIBLE", 100, element);
							MyWait.until(dr, "ELEMENT_CLICKABLE", 100, element);
							element.sendKeys(textToType);
						} else {
							log.error("TEXT TO BE ENTERED SEEMS TO BE EMPTY");
							throwException("TEXT TO BE ENTERED SEEMS TO BE EMPTY" + "\n");
						}
					} else {
						log.error("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE");
						throwException("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE" + "\n");
					}
				} else {
					log.error("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE");
					throwException("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE" + "\n");
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (StaleElementReferenceException e) {
			uploadFile(element, textToType);
		} catch (NoSuchElementException ele) {
			uploadFile(element, textToType);
		} catch (Exception e) {
			log.error("UNABLE TO ENTER THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element + ")\n"
					+ e.getMessage());
			throwException("UNABLE TO ENTER THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element + ")\n"
					+ e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY ENTERED THE TEXT(" + textToType + ") INSIDE SPECIFIED WEBELEMENT(" + element + ")");
	}

	public static Boolean isDisplayedOrNot(WebElement element) throws MyOwnException {

		log.info("INTEND TO VERIFY WHETHER SPECIFIED WEBELEMENT IS DISPLAYED OR NOT");
		try {
			if (element != null) {
				if (element.isDisplayed()) {
					log.info("WEBELEMENT(" + element + ") IS DISPLAYED");
					result = true;
				} else {
					log.error("WEBELEMENT(" + element + ") IS NOT DISPLAYED");
					result = false;
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO CHECK WHETHER THE SPECIFIED WEBELEMENT(" + element + ") IS DISPLAYED OR NOT\n"
					+ e.getMessage());
			throwException("UNABLE TO CHECK WHETHER THE SPECIFIED WEBELEMENT(" + element + ") IS DISPLAYED OR NOT\n"
					+ e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY VERIFIED WETHER THE SPECIFIED WEBELEMENT(" + element + ") IS DISPLAYED OR NOT");
		return result;
	}

	public static Boolean isEnabledOrNot(WebElement element) throws MyOwnException {

		log.info("INTEND TO VERIFY WHETHER SPECIFIED WEBELEMENT IS ENABLED OR NOT");
		try {
			if (element != null) {
				if (element.isEnabled()) {
					log.info("WEBELEMENT(" + element + ") IS ENABLED");
					result = true;
				} else {
					log.error("WEBELEMENT(" + element + ") IS NOT ENABLED");
					result = false;
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO CHECK WHETHER THE SPECIFIED WEBELEMENT(" + element + ") IS ENABLED OR NOT\n"
					+ e.getMessage());
			throwException("UNABLE TO CHECK WHETHER THE SPECIFIED WEBELEMENT(" + element + ") IS ENABLED OR NOT\n"
					+ e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY VERIFIED WETHER THE SPECIFIED WEBELEMENT(" + element + ") IS ENABLED OR NOT");
		return result;
	}

	public static Boolean isSelectedOrNot(WebElement element) throws MyOwnException {

		log.info("INTEND TO VERIFY WHETHER SPECIFIED WEBELEMENT IS SELECTED OR NOT");
		try {
			if (element != null) {
				if (element.isSelected()) {
					log.info("WEBELEMENT(" + element + ") IS SELECTED");
					result = true;
				} else {
					log.error("WEBELEMENT(" + element + ") IS NOT SELECTED");
					result = false;
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (Exception e) {
			log.error("UNABLE TO CHECK WHETHER THE SPECIFIED WEBELEMENT(" + element + ") IS SELECTED OR NOT\n"
					+ e.getMessage());
			throwException("UNABLE TO CHECK WHETHER THE SPECIFIED WEBELEMENT(" + element + ") IS SELECTED OR NOT\n"
					+ e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY VERIFIED WETHER THE SPECIFIED WEBELEMENT(" + element + ") IS SELECTED OR NOT");
		return result;
	}

	public static String getTextFrom(WebElement element) throws MyOwnException {

		String text = null;
		try {
			log.info("Fetching the text from the specified webelement");
			MyWait.until(dr, "ELEMENT_CLICKABLE", 30, element);
			text = element.getText();
		} catch (Exception exp) {
			throwException("UNABLE TO GET TEXT FROM SPECIFIED WEBELEMENT : " + exp.getMessage());
			log.error("UNABLE TO GET TEXT FROM SPECIFIED WEBELEMENT");
		}
		return text;
	}

	public static void setDropDownBy(String setMethodType, String value, WebElement dropDownElement)
			throws MyOwnException {

		log.info("INTEND TO SELECT SPECIFIED DROP DOWN VALUE IN A WEBELEMENT");
		Select action;
		try {
			if (dropDownElement != null) {
				MyWait.until(dr, "ELEMENT_VISIBLE", 100, dropDownElement);
				MyWait.until(dr, "ELEMENT_CLICKABLE", 100, dropDownElement);
				action = new Select(dropDownElement);
				if (isDisplayedOrNot(dropDownElement) == true) {
					if (isEnabledOrNot(dropDownElement) == true) {
						if (notEmpty(setMethodType)) {
							if (notEmpty(value)) {
								MyWait.until(dr, "ELEMENT_VISIBLE", 100, dropDownElement);
								MyWait.until(dr, "ELEMENT_CLICKABLE", 100, dropDownElement);
								if (setMethodType.equalsIgnoreCase("VISIBLE TEXT")) {
									action.selectByVisibleText(value);
								} else if (setMethodType.equalsIgnoreCase("VALUE")) {
									action.selectByValue(value);
								} else if (setMethodType.equalsIgnoreCase("INDEX")) {
									int index = Integer.valueOf(value);
									action.selectByIndex(index);
								} else {
									log.error("SELECT BY METHOD TYPE SEEMS TO BE INCORRECT");
									throwException("SELECT BY METHOD TYPE SEEMS TO BE INCORRECT" + "\n");
								}
							} else {
								log.error("VALUE TO BE SELECTED SEEMS TO BE EMPTY");
								throwException("VALUE TO BE SELECTED SEEMS TO BE EMPTY" + "\n");
							}
						} else {
							log.error("SELECT BY METHOD TYPE SEEMS TO BE EMPTY");
							throwException("SELECT BY METHOD TYPE SEEMS TO BE EMPTY" + "\n");
						}
					} else {
						log.error("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE");
						throwException("WEBELEMENT IS NOT ENABLED ON THE WEBPAGE" + "\n");
					}
				} else {
					log.error("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE");
					throwException("WEBELEMENT IS NOT DISPLAYED ON THE WEBPAGE" + "\n");
				}
			} else {
				log.error("WEBELEMENT INSTANCE SEEMS TO BE NULL");
				throwException("WEBELEMENT INSTANCE SEEMS TO BE NULL" + "\n");
			}
		} catch (StaleElementReferenceException e) {
			setDropDownBy(setMethodType, value, dropDownElement);
		} catch (NoSuchElementException ele) {
			setDropDownBy(setMethodType, value, dropDownElement);
		} catch (Exception e) {
			log.error("UNABLE TO SET SPECIFIED DROP DOWN VALUE(" + value + ") USING : " + setMethodType
					+ " METHOD TYPE\n" + e.getMessage());
			throwException("UNABLE TO SET SPECIFIED DROP DOWN VALUE(" + value + ") USING : " + setMethodType
					+ " METHOD TYPE\n" + e.getMessage() + "\n");
		}
		log.info("SUCCESSFULLY SELECTED SPECIFIED DROP DOWN VALUE(" + value + ") USING : " + setMethodType
				+ " METHOD TYPE");
	}

	public static boolean isElementExist(String linkText) {

		List<WebElement> ele = dr.findElements(By.linkText(linkText));
		if (ele.size() > 0) {
			return true;
		} else
			return false;
	}
	

	public static boolean isAlertPresent(String className) {
		List<WebElement> ele = dr.findElements(By.className(className));
		if (ele.size() > 0) {
			return true;
		} else
			return false;
	}
	public static boolean isCloseButtonExist(String xpath) {
		List<WebElement> ele = dr.findElements(By.xpath(xpath));
		if (ele.size() > 0) {
			return true;
		} else
			return false;
	}
	public static boolean isDropdownExist(String name) {
		List<WebElement> ele = dr.findElements(By.name(name));
		if (ele.size() > 0) {
			return true;
		} else
			return false;
	}

}