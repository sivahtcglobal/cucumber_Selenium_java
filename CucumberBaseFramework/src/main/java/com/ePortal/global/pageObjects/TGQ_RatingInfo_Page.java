package com.ePortal.global.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
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

public class TGQ_RatingInfo_Page extends EportalAllPages {

	private static final Logger log = LogManager.getLogger(TGQ_RatingInfo_Page.class.getName());

	// Page Factory
	@FindBy(how = How.XPATH, using = "//*[@id=\"quoteSummaryTable\"]/tbody/tr[1]/td[4]")
	public WebElement pol_type;
	@FindBy(how = How.ID, using = "quoteBean.insFirstName.value")
	public WebElement tgq_first_name;
	@FindBy(how = How.ID, using = "quoteBean.insLastName.value")
	public WebElement tgq_last_name;
	@FindBy(how = How.ID, using = "quoteBean.garagingAddress.address.value")
	public WebElement tgq_street;
	@FindBy(how = How.ID, using = "quoteBean.garagingAddress.city.value")
	public WebElement tgq_city;
	@FindBy(how = How.ID, using = "quoteBean.homePhone.area")
	public WebElement tgq_area;
	@FindBy(how = How.ID, using = "quoteBean.homePhone.exchange")
	public WebElement tgq_exchange;
	@FindBy(how = How.ID, using = "quoteBean.homePhone.station")
	public WebElement tgq_station;
	@FindBy(how = How.NAME, using = "quoteBean.addrDiffFlag.writableValue")
	public WebElement mailing_address_yes_no;
	@FindBy(how = How.NAME, using = "quoteBean.policyTerm.writableValue")
	public WebElement term;
	@FindBy(how = How.NAME, using = "quoteBean.payPlan.writableValue")
	public WebElement pay_plan;
	@FindBy(how = How.NAME, using = "quoteBean.otherPolicyType.writableValue")
	public WebElement type_policy;
	@FindBy(how = How.NAME, using = "quoteBean.enhancedTransferDiscount.writableValue")
	public WebElement liability_insurance_coverage;
	@FindBy(how = How.NAME, using = "quoteBean.priorBiLimit.writableValue")
	public WebElement prior_BILimits;
	@FindBy(how = How.NAME, using = "quoteBean.tenureDays.writableValue")
	public WebElement duration_of_insurance;
	@FindBy(how = How.NAME, using = "quoteBean.life.writableValue")
	public WebElement term_life_referral;
	@FindBy(how = How.NAME, using = "quoteBean.primaryInsuranceDiscount.writableValue")
	public WebElement primary_insurance;
	@FindBy(how = How.NAME, using = "quoteBean.roadsideAssistance.writableValue")
	public WebElement road_side_ast;
	@FindBy(how = How.NAME, using = "quoteBean.homeownerDiscount.writableValue")
	public WebElement homeOwner_disc;
	@FindBy(how = How.ID, using = "quoteBean.roadsideAssistanceQuestions[0].value")
	public WebElement road_side_ast_1;
	@FindBy(how = How.ID, using = "quoteBean.roadsideAssistanceQuestions[1].value")
	public WebElement road_side_ast_2;
	@FindBy(how = How.ID, using = "quoteBean.roadsideAssistanceQuestions[2].value")
	public WebElement road_side_ast_3;
	@FindBy(how = How.ID, using = "quoteBean.roadsideAssistanceQuestions[3].value")
	public WebElement road_side_ast_4;
	@FindBy(how = How.NAME, using = "quoteBean.bipdLimit.writableValue")
	public WebElement liability_bi_pd_cov;
	@FindBy(how = How.NAME, using = "quoteBean.umbiLimit.writableValue")
	public WebElement umbi_cov;
	@FindBy(how = How.ID, using = "quoteBean.umpdLimit.writableValue")
	public WebElement umpd_cov;
	@FindBy(how = How.NAME, using = "quoteBean.umpdDed.writableValue")
	public WebElement umpd_ded;
	@FindBy(how = How.NAME, using = "quoteBean.medPayLimit.writableValue")
	public WebElement medical_payments;
	@FindBy(how = How.ID, using = "quoteBean.rentalLimit.writableValue")
	public WebElement rental_reim;
	@FindBy(how = How.NAME, using = "quoteBean.userRatedCredit.writableValue")
	public WebElement est_credit;
	@FindBy(how = How.ID, using = "quoteBean.drivers[0].dateOfBirth.mo")
	public WebElement dob_mo;
	@FindBy(how = How.ID, using = "quoteBean.drivers[0].dateOfBirth.dy")
	public WebElement dob_dy;
	@FindBy(how = How.ID, using = "quoteBean.drivers[0].dateOfBirth.yr")
	public WebElement dob_yr;
	@FindBy(how = How.NAME, using = "quoteBean.drivers[0].gender.writableValue")
	public WebElement gender;
	@FindBy(how = How.NAME, using = "quoteBean.drivers[0].maritalStatus.writableValue")
	public WebElement marital_status;
	@FindBy(how = How.NAME, using = "quoteBean.drivers[0].sr22.writableValue")
	public WebElement sr22;
	@FindBy(how = How.ID, using = "quoteBean.drivers[0].dateLicensed.mo")
	public WebElement date_liscenced_mo;
	@FindBy(how = How.ID, using = "quoteBean.drivers[0].dateLicensed.dy")
	public WebElement date_liscenced_dy;
	@FindBy(how = How.ID, using = "quoteBean.drivers[0].dateLicensed.yr")
	public WebElement date_liscenced_yr;
	@FindBy(how = How.NAME, using = "quoteBean.drivers[0].licenseStatus.writableValue")
	public WebElement lic_status;
	@FindBy(how = How.NAME, using = "quoteBean.drivers[0].seniorDriver.writableValue")
	public WebElement sr_drvr;
	@FindBy(how = How.ID, using = "quoteBean.vehicles[0].vin.value")
	public WebElement vin;
	@FindBy(how = How.XPATH, using = "//*[@id='vlink0']")
	public WebElement get_vehicle;
	@FindBy(how = How.ID, using = "quoteBean.vehicles[0].modelYear.value")
	public WebElement year;
	@FindBy(how = How.NAME, using = "quoteBean.vehicles[0].make.writableValue")
	public WebElement make;
	@FindBy(how = How.NAME, using = "quoteBean.vehicles[0].model.writableValue")
	public WebElement model;
	@FindBy(how = How.NAME, using = "quoteBean.vehicles[0].type.writableValue")
	public WebElement type_vehicle;
	@FindBy(how = How.NAME, using = "quoteBean.vehicles[0].compDed.writableValue")
	public WebElement comp_ded;
	@FindBy(how = How.NAME, using = "quoteBean.vehicles[0].collDed.writableValue")
	public WebElement coll_ded;
	@FindBy(how = How.ID, using = "quoteBean.vehicles[0].businessUse.writableValue")
	public WebElement bus_use;
	@FindBy(how = How.ID, using = "quoteBean.vehicles[0].doubleDed.writableValue")
	public WebElement dbl_ded;
	@FindBy(how = How.ID, using = "quoteBean.vehicles[0].towingLimit.writableValue")
	public WebElement towing_labour;
	@FindBy(how = How.ID, using = "quoteBean.vehicles[0].additionalEquip.value")
	public WebElement custom_equip;
	@FindBy(how = How.LINK_TEXT, using = "Save")
	public WebElement save;
	@FindBy(how = How.LINK_TEXT, using = "Show Messages")
	public WebElement show_messages;
	@FindBy(how = How.LINK_TEXT, using = "Get Quote")
	public WebElement get_quote;

	WebDriver ldriver;

	public TGQ_RatingInfo_Page(WebDriver dr) {
		super(dr);
		this.ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public void ratinginfo(String applicationType) throws MyOwnException, InterruptedException {
		log.info("METHOD(login) STARTED SUCCESSFULLY");
		try {

			MyWebElement.enterText(tgq_first_name, randomNameString(7));
			MyWebElement.enterText(tgq_last_name, randomNameString(5));
			MyWebElement.enterText(tgq_street,randomAddressNumberString(3)+","+ prop.getProperty("tgq_street"));
			MyWebElement.enterText(tgq_city, prop.getProperty("tgq_city"));
			MyWebElement.enterText(tgq_area, prop.getProperty("tgq_area"));
			MyWebElement.enterText(tgq_exchange, prop.getProperty("tgq_exchange"));
			MyWebElement.enterText(tgq_station, prop.getProperty("tgq_station"));
			Select mailing_address = new Select(mailing_address_yes_no);
			mailing_address.selectByVisibleText(prop.getProperty("mailing_address_yes_no"));
			if (!currentHash.get("Term").equals("Nil")) {
				Select term_cov = new Select(term);
				term_cov.selectByVisibleText(currentHash.get("Term"));
			}
			Select pay_plan_cov = new Select(pay_plan);
			pay_plan_cov.selectByVisibleText(currentHash.get("PayPlan"));
			if (!currentHash.get("Type").equals("Nil")) {
				Select type_policy_cov = new Select(type_policy);
				type_policy_cov.selectByVisibleText(currentHash.get("Type"));
			}
			if (!currentHash.get("PreviousInsurance").equals("Nil")) {
				Select liability_insurance_cov = new Select(liability_insurance_coverage);
				liability_insurance_cov.selectByVisibleText(currentHash.get("PreviousInsurance"));
			}
			if (!currentHash.get("PriorBILimits").equals("Nil")) {
				Select prior_BILimits_cov = new Select(prior_BILimits);
				prior_BILimits_cov.selectByVisibleText(currentHash.get("PriorBILimits"));
			}
			if (!currentHash.get("DurationOfInsurance").equals("Nil")) {
				Select duration_of_insurance_cov = new Select(duration_of_insurance);
				duration_of_insurance_cov.selectByVisibleText(currentHash.get("DurationOfInsurance"));
			}
			Select term_life_referral_cov = new Select(term_life_referral);
			term_life_referral_cov.selectByVisibleText(currentHash.get("TimeLifeReferral"));
			Select primary_insurance_cov = new Select(primary_insurance);
			primary_insurance_cov.selectByVisibleText(currentHash.get("PrimaryInsurance"));
			if (!currentHash.get("RoadSideAst").equals("Nil")) {
				Select road_side_ast_cov = new Select(road_side_ast);
				road_side_ast_cov.selectByVisibleText(currentHash.get("RoadSideAst"));
				MyWebElement.clickOn(road_side_ast_1);
				MyWebElement.clickOn(road_side_ast_2);
				MyWebElement.clickOn(road_side_ast_3);
				MyWebElement.clickOn(road_side_ast_4);
			}
			if (!currentHash.get("HomeOwnerDisc").equals("Nil")) {
				Select homeOwner_disc_cov = new Select(homeOwner_disc);
				homeOwner_disc_cov.selectByVisibleText(currentHash.get("HomeOwnerDisc"));
			}
		
			if (!currentHash.get("LIBI").equals("Nil")) {
				Select liability_bi_pd_ = new Select(liability_bi_pd_cov);
				liability_bi_pd_.selectByVisibleText(currentHash.get("LIBI"));
			}
			if (!currentHash.get("UMBI").equals("Nil")) {
				Select umbi = new Select(umbi_cov);
				umbi.selectByVisibleText(currentHash.get("UMBI"));
			}
			if (!currentHash.get("UMPD").equals("Nil")) {
				Select umpd = new Select(umpd_cov);
				umpd.selectByVisibleText(currentHash.get("UMPD"));
			}
			if (!currentHash.get("UMPD Ded").equals("Nil")) {
				Select umpd_ded_cov = new Select(umpd_ded);
				umpd_ded_cov.selectByVisibleText(currentHash.get("UMPD Ded"));
			}
			if (!currentHash.get("MedicalPay").equals("Nil")) {
				Select medical_payments_cov = new Select(medical_payments);
				medical_payments_cov.selectByVisibleText(currentHash.get("MedicalPay"));
			}
			if (!currentHash.get("RentalReim").equals("Nil")) {
				Select rental_reim_cov = new Select(rental_reim);
				rental_reim_cov.selectByVisibleText(currentHash.get("RentalReim"));
			}
			if (!currentHash.get("EstimatedCredit").equals("Nil")) {
				Select est_credit_cov = new Select(est_credit);
				est_credit_cov.selectByVisibleText(currentHash.get("EstimatedCredit"));
			}
			MyWebElement.enterText(dob_mo, "01");
			MyWebElement.enterText(dob_dy, "01");
			MyWebElement.enterText(dob_yr, "1991");
			Select gender_dr = new Select(gender);
			gender_dr.selectByVisibleText("Female");
			Select marital_status_dr = new Select(marital_status);
			marital_status_dr.selectByVisibleText("Single");
			Select sr22_dr = new Select(sr22);
			sr22_dr.selectByVisibleText("No");
			// MyWebElement.enterText(date_liscenced_mo,
			// prop.getProperty("date_liscenced_mo"));
			// MyWebElement.enterText(date_liscenced_dy,
			// prop.getProperty("date_liscenced_dy"));
			// MyWebElement.enterText(date_liscenced_yr,
			// prop.getProperty("date_liscenced_yr"));
			Select lic_status_dr = new Select(lic_status);
			lic_status_dr.selectByVisibleText("Active");
			Select sr_driver = new Select(sr_drvr);
			sr_driver.selectByVisibleText("No");
			if (!pol_type.getText().equals("Bond") ) {
			MyWebElement.enterText(vin, "1FTSW21P97EB36008");
			MyWebElement.clickOn(get_vehicle);
			}
			// MyWebElement.enterText(year, prop.getProperty("year"));
			// Select make_veh = new Select(make);
			// make_veh.selectByVisibleText(prop.getProperty("make"));
			// Select model_veh = new Select(model);
			// model_veh.selectByVisibleText(prop.getProperty("model"));
			// Select type_veh = new Select(type_vehicle);
			// type_veh.selectByVisibleText(prop.getProperty("type_vehicle"));
			if (!currentHash.get("CompDed").equals("Nil")) {
				Select comp_ded_veh = new Select(comp_ded);
				comp_ded_veh.selectByVisibleText(currentHash.get("CompDed"));
			}
			if (!currentHash.get("CollDed").equals("Nil")) {
				Select coll_ded_veh = new Select(coll_ded);
				coll_ded_veh.selectByVisibleText(currentHash.get("CollDed"));
			}
			if (!currentHash.get("BusUse").equals("Nil")) {
				Select bus_use_veh = new Select(bus_use);
				bus_use_veh.selectByVisibleText(currentHash.get("BusUse"));
			}
			if (!currentHash.get("DblDed").equals("Nil")) {
				Select dbl_ded_veh = new Select(dbl_ded);
				dbl_ded_veh.selectByVisibleText(currentHash.get("DblDed"));
			}
			if (!currentHash.get("Towing&Labour").equals("Nil")) {
				Select towing_labour_veh = new Select(towing_labour);
				towing_labour_veh.selectByVisibleText(currentHash.get("Towing&Labour"));
			}
			// MyWebElement.enterText(custom_equip, prop.getProperty("custom_equip"));

			//MyWebElement.clickOn(save);
			MyWebElement.clickOn(get_quote);

			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Created_ratinginfo_" + applicationType + ".png");

			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
					"Successfully_Logged into '" + applicationType + "' application",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Created_ratinginfo_" + applicationType + ".png");

		} catch (Exception exp) {
			log.error(exp.getMessage());
			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Error_ratinginfo_" + applicationType + ".png");
			Report.logTestCaseStatusWithSnapShot(parentTestCase, "FAIL",
					"<font color=red><b>Error while Logging into '" + applicationType
							+ "' application: </b></font><br />" + exp.getMessage() + "<br />",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Error_ratinginfo_" + applicationType + ".png");
			throwException("Unable Create ratinginfo" + applicationType + "application \n" + exp.getMessage() + "\n");
		}
		log.info("METHOD(login) EXECUTED SUCCESSFULLY");

	}

}
