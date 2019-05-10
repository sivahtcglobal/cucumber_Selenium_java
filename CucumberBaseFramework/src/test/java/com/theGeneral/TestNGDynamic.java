package com.theGeneral;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.google.common.base.Splitter;

public class TestNGDynamic {
	private static final Logger log = LogManager.getLogger(TestNGDynamic.class.getName());

	static Row row;
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sh;
	static Cell cell;
	public static List<String> masterSheetList = new ArrayList<String>();
	public static Map<String, String> ePortalTestDataMap = new HashMap<String, String>();

	public static void main(String args[]) {

		readMasterData(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\ePortalTestData.xlsx");

		AppendApproveTagToFeature(System.getProperty("user.dir") + "\\src\\test\\resources\\features");

		
		log.info("METHOD(TestNGDynamic) EXECUTION STARTED SUCCESSFULLY");
		try {
			XmlSuite suite = new XmlSuite();
			suite.setName("RegressionSuite");
			XmlTest test = new XmlTest(suite);
			test.setName("Test");
			List<XmlClass> classes = new ArrayList<XmlClass>();
			classes.add(new XmlClass("com.ePortal.TestRunner"));
			test.setXmlClasses(classes);
			List<XmlSuite> suites = new ArrayList<XmlSuite>();
			suites.add(suite);
			TestNG tng = new TestNG();
			tng.setXmlSuites(suites);
			tng.run();

		} catch (Exception exp) {
			log.error(exp.getMessage());
		}
	}

	

	public static Map<String, String> splitToMap(String data) {

		log.info("METHOD(splitToMap) EXECUTION STARTED SUCCESSFULLY");

		try {
			ePortalTestDataMap = Splitter.on("\n").withKeyValueSeparator("~").split(data);

		} catch (Exception exp) {
			log.error(exp.getMessage());

			exp.printStackTrace();

		}

		log.info("METHOD(splitToMap) EXECUTED SUCCESSFULLY");

		return ePortalTestDataMap;

	}

	public static void readSpecificTestData(String fileName, String sheetName, String testDataType) throws IOException {

		StringBuffer testDataBeforeSplit = new StringBuffer();
		File file = new File(fileName);

		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String extension = fileName.substring(fileName.indexOf("."));
		if (extension.equalsIgnoreCase(".xlsx")) {
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				wb = new HSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
		main: for (int i = 1; i <= rowCount; i++) {

			Row row = sh.getRow(i);

			if (row.getCell(0).toString().equals(testDataType) && row.getCell(1).toString().equals("Yes")) {

				for (int j = 2; j < row.getPhysicalNumberOfCells() - 1; j++) {
					if (j + 1 == row.getPhysicalNumberOfCells() - 1) {
						testDataBeforeSplit.append(row.getCell(j).toString());

					} else {
						testDataBeforeSplit.append(row.getCell(j).toString() + "\n");
					}

				}

				ePortalTestDataMap = splitToMap(testDataBeforeSplit.toString());
				break main;
			}
		}

		log.info("End of updating the excel sheet with values of actual result and step status");

		fis.close();

	}

	public static void AppendApproveTagToFeature(String filename) {

		try {

			File folder = new File(filename);
			File[] listOfFiles = folder.listFiles();

			for (File file : listOfFiles) {
				boolean fileFound = false;
				if (file.isFile()) {
					FileInputStream fis = new FileInputStream(file);
					BufferedReader br = new BufferedReader(new InputStreamReader(fis));
					String result = "";
					String line = "";

					main: for (int i = 0; i < masterSheetList.size(); i++) {
						if (file.getName().equals(masterSheetList.get(i))) {
							fileFound = true;

							// start of 11262018
							line = br.readLine();

							if (line.contains("Ignore")) {
								line = br.readLine();

								result = result + "\n" + line;
								while ((line = br.readLine()) != null) {
									result = result + "\n" + line;
								}
								result = "@Approved" + result;
								FileOutputStream fos = new FileOutputStream(file);
								fos.write(result.getBytes());
								fos.flush();

							} else if (!(line).contains("Approved")) {
								result = result + "\n" + line;
								while ((line = br.readLine()) != null) {
									result = result + "\n" + line;
								}
								result = "@Approved" + result;
								FileOutputStream fos = new FileOutputStream(file);
								fos.write(result.getBytes());
								fos.flush();

							}

							break main;
						}

					}
					if (!fileFound) {
						line = br.readLine();
						if (line.contains("Approved")) {
							line = br.readLine();
							result = result + "\n" + line;
							while ((line = br.readLine()) != null) {
								result = result + "\n" + line;
							}
							result = "@Ignore" + result;
							FileOutputStream fos = new FileOutputStream(file);
							fos.write(result.getBytes());
							fos.flush();

						} else if (!(line).contains("Ignore")) {
							result = result + "\n" + line;
							while ((line = br.readLine()) != null) {
								result = result + "\n" + line;
							}
							result = "@Ignore" + result;
							FileOutputStream fos = new FileOutputStream(file);
							fos.write(result.getBytes());
							fos.flush();
						}

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readMasterData(String fileName) {
		log.info("Start of Executing method name: excelwrite");
		try {

			File file = new File(fileName);

			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			String extension = fileName.substring(fileName.indexOf("."));
			if (extension.equalsIgnoreCase(".xlsx")) {
				try {
					wb = new XSSFWorkbook(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					wb = new HSSFWorkbook(fis);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			sh = wb.getSheet("MasterSheet");
			int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
			for (int i = 1; i <= rowCount; i++) {

				Row row = sh.getRow(i);

				if (row.getCell(1).toString().equals("Yes")) {
					masterSheetList.add(row.getCell(0).toString() + ".feature");
				}
			}

			for (int i = 0; i < masterSheetList.size(); i++) {
			}

			log.info("End of updating the test rail excel sheet with values of actual result and step status");

			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}
		log.info("End of Executing method name: excelwrite");

	}


}
