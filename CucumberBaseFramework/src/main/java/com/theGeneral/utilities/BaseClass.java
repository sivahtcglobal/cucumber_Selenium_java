package com.theGeneral.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.base.Splitter;
import com.theGeneral.global.pageObjects.TheGeneralAllPages;

public class BaseClass {

	private static final Logger log = LogManager.getLogger(BaseClass.class.getName());

	public static WebDriver dr;
	public static Properties prop;
	public static Actions act;

	public static String fileFormat = "";
	public static File file;
	public static FileInputStream fs;
	public static FileOutputStream os;
	public static boolean result;
	public static List<HashMap<String, String>> mydata = new ArrayList<HashMap<String, String>>();
	public static String testRunTimeStamp;
	public static String screenShotFolderPath;
	public static ExtentReports report;
	public static ExtentTest parentTestCase;
	public static TheGeneralAllPages ePortalAllPages;
	private static final String Name_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String Addres_Number_STRING = "1234567890";
	public static Row row;
	public static Workbook wb;
	public static Sheet sh;
	public static Cell cell;
	public static HashMap<String, String> currentHash = new HashMap<String, String>();
	public static List<String> masterSheetList = new ArrayList<String>();
	public static Map<String, String> ePortalTestDataMap = new HashMap<String, String>();

	public static boolean testExecutionStatus = false;
	public static String browserName;
	public static int count = 0;

	public BaseClass() {

		File file = new File("./src/test/resources/Configuration/Config.property");

		try {
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	public static ExpectedCondition<Boolean> waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		return expectation;
	}

	public static List<HashMap<String, String>> readSpecificTestData( String testCaseId)
			throws IOException, MyOwnException {
	    String fileName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\" + prop.getProperty("TestDataFileName");
	    String sheetName= prop.getProperty("InitAppSheetName");
		File file = new File(fileName);
		wb = new XSSFWorkbook(new FileInputStream(file));
	
		sh = wb.getSheet(sheetName);

		Row HeaderRow = sh.getRow(0);

		for (int i = 1; i < sh.getPhysicalNumberOfRows(); i++) {
			Row currentRow = sh.getRow(i);
			
			if (testCaseId.equalsIgnoreCase(currentRow.getCell(0).getStringCellValue())) {
				
				for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell = currentRow.getCell(j);
					switch (currentCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						currentHash.put(HeaderRow.getCell(j).getStringCellValue(),
								String.valueOf(currentCell.getNumericCellValue()));
						break;
					}

				}
				mydata.add(currentHash);
				System.out.println("Username" + currentHash.get("Username"));

			}
		}
		return mydata;
	}

	public static String randomNameString(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * Name_STRING.length());
			builder.append(Name_STRING.charAt(character));
		}
		return builder.toString();
	}

	public static String randomAddressNumberString(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * Addres_Number_STRING.length());
			builder.append(Addres_Number_STRING.charAt(character));
		}
		return builder.toString();
	}

	public static void initialization() throws MyOwnException {

		log.info("METHOD(initialization) EXECUTION STARTED SUCCESSFULLY");
		browserName = System.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");

			DesiredCapabilities caps = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			caps.setCapability(ChromeOptions.CAPABILITY, options);

			dr = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\geckodriver.exe");
			dr = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\IEDriverServer.exe");

			InternetExplorerOptions caps = new InternetExplorerOptions();
			caps.requireWindowFocus();			
			caps.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
			caps.introduceFlakinessByIgnoringSecurityDomains();
			caps.enablePersistentHovering();
			dr = new InternetExplorerDriver(caps);
		} else if (browserName.equalsIgnoreCase("gecko")) {
			FirefoxOptions options = new FirefoxOptions();
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\geckodriver.exe");
			dr = new FirefoxDriver(options);
		}

		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();		
		dr.navigate().to("https://"+System.getProperty("TestEnvironment")+".pgactest.com/mars/");
		ePortalAllPages = new TheGeneralAllPages(dr);
		log.info("METHOD(initialization) EXECUTION ENDED SUCCESSFULLY");
	}

	public static void initiateReport() throws MyOwnException {

		java.util.Date today = new java.util.Date();
		testRunTimeStamp = new java.sql.Timestamp(today.getTime()).toString();
		testRunTimeStamp = testRunTimeStamp.replace(" ", "_").replace(":", "_").replace(".", "_");
		screenShotFolderPath = System.getProperty("user.dir") + "\\src\\test\\resources\\Results\\Screenshots" + "_"
				+ testRunTimeStamp;		
		report = Report.initialize("TG_Extend_Report.html", false);
		Report.recordSystemInfo(report, "Operating System", "WINDOWS OS");
		Report.recordSystemInfo(report, "Java", "1.8");
		Report.recordSystemInfo(report, "Selenium Version", "3.4");

	}


	public String getChromePath() {
		String path = prop.getProperty("chromePath");
		return path;
	}

	public String getChrome() {
		String chromeBrowser = prop.getProperty("chromeDriver");
		return chromeBrowser;
	}

	public String getIE() {
		String ieBrowser = prop.getProperty("IEDriver");
		return ieBrowser;
	}

	public String getFirefox() {
		String firefoxBrowser = prop.getProperty("firefoxDriver");
		return firefoxBrowser;
	}

	public String getTestUrlQ2() {
		String url = prop.getProperty("lmaQ2TestUrl");
		return url;
	}

	public static boolean notEmpty(String string) {

		log.info("INTENDED TO CHECK IF THE STRING IS EMPTY");
		if (string != "") {
			log.info("STRING IS NOT EMPTY");
			result = true;
		} else {
			log.error("STRING IS EMPTY");
			result = false;
		}
		log.info("SUCCESSFULLY CHECKED IF THE STRING IS EMPTY");
		return result;
	}

	public static boolean formatGiven(String fileName) {

		log.info("INTENDED TO CHECK IF THE FILE NAME HAS THE FILE EXTENSION");
		int position = fileName.indexOf(".");
		if (position >= 0) {
			log.info("FILE FORMAT IS PROVIDED WITH THE FILE NAME(" + fileName + ")");
			result = true;
		} else {
			log.error("FILE FORMAT IS NOT PROVIDED WITH THE FILE NAME(" + fileName + ")");
			result = false;
		}
		log.info("SUCCESSFULLY CHECKED IF THE FILE NAME HAS THE FILE EXTENSION");
		return result;
	}

	public static File createFileInstance(String name) throws MyOwnException {

		log.info("INTENDED TO CREATE THE FILE INSTANCE");
		try {
			file = new File(name);
			log.info("FILE INSTANCE CREATED");
		} catch (Exception e) {
			log.error("UNABLE TO CREATE AN INSTANCE OF THE FILE(" + name + ")");
			throwException("UNABLE TO CREATE AN INSTANCE OF THE FILE(" + name + ")" + "\n");
		}
		log.info("SUCCESSFULLY CREATED THE FILE INSTANCE");
		return file;
	}

	public static String getFileFormat(String fileName) throws MyOwnException {

		log.info("INTENDED TO RETRIEVE THE FORMAT OF THE FILE");
		try {
			fileFormat = fileName.substring(fileName.indexOf("."));
			log.info(
					"SUCCESSFULLY GOT THE FILE FORMAT(" + fileFormat + ") FROM THE FILE NAME(" + fileName + ")" + "\n");
		} catch (Exception e) {
			log.error("UNABLE TO GET THE FILE FORMAT(" + fileFormat + ") FROM THE FILE NAME(" + fileName + ")");
			throwException(
					"UNABLE TO GET THE FILE FORMAT(" + fileFormat + ") FROM THE FILE NAME(" + fileName + ")" + "\n");
		}
		log.info("SUCCESSFULLY RETRIEVED THE FORMAT OF THE FILE");
		return fileFormat;
	}

	public static boolean fileFormatIs(String expectedExtension) {

		log.info("INTENDED TO CHECK IF THE FILE BELONGS TO THE GIVEN FORMAT");
		if (fileFormat.equalsIgnoreCase(expectedExtension)) {
			log.info("EXPECTED AND ACTUAL FILE FORMATS ARE THE SAME");
			result = true;
		} else {
			log.error("EXPECTED AND ACTUAL FILE FORMATS ARE DIFFERENT");
			result = false;
		}
		log.info("SUCCESSFULLY CHECKED IF THE FILE BELONGS TO THE GIVEN FORMAT");
		return result;
	}

	public static FileInputStream readFile(File file) throws MyOwnException {

		log.info("INTENDED TO READ THE GIVEN FILE");
		try {
			fs = new FileInputStream(file);
			log.info("SUCCESSFULLY READ THE FILE(" + file + ") SPECIFIED");
		} catch (FileNotFoundException e) {
			log.error("UNABLE TO READ THE FILE(" + file + ") SPECIFIED, PLEASE CHECK NAME OR LOCATION OR EXTENSION");
			throwException("UNABLE TO READ THE FILE(" + file + ") SPECIFIED, PLEASE CHECK NAME OR LOCATION OR EXTENSION"
					+ "\n");
		}
		log.info("READING THE FILE IS SUCCESSFUL");
		return fs;
	}

	public static FileOutputStream writeFile(File file) throws MyOwnException {

		log.info("INTENDED TO WRITE TO THE GIVEN FILE");
		try {
			os = new FileOutputStream(file);
			log.info("READY TO WRITE CONTENTS IN THE FILE(" + file + ") SPECIFIED");
		} catch (FileNotFoundException e) {
			log.error("UNABLE TO WRITE CONTENTS TO THE FILE(" + file
					+ ") SPECIFIED, PLEASE CHECK NAME OR LOCATION OR EXTENSION");
			throwException("UNABLE TO WRITE CONTENTS TO THE FILE(" + file
					+ ") SPECIFIED, PLEASE CHECK NAME OR LOCATION OR EXTENSION" + "\n");
		}
		log.info("WRITE TO THE GIVEN FILE IS SUCCESSFUL");
		return os;
	}

	public static void screenShot(String fileName) throws MyOwnException, InterruptedException {
		Thread.sleep(1000);
		if (prop.getProperty("PositiveScreenshot").equalsIgnoreCase("True")) {
			File scrFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(fileName));
			} catch (IOException exp) {

				throwException("UNABLE TO TAKE THE SCREEN SHOT OF THE SCREEN FROM THE METHOD screenShot.\n"
						+ exp.getMessage() + "\n");
			}
		}

	}

	public static void throwException(String message) throws MyOwnException {
		throw new MyOwnException(message);
	}


	

}
