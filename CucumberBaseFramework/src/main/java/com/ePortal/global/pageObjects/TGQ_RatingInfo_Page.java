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
			if (!prop.getProperty("term").equals("Nil")) {
				Select term_cov = new Select(term);
				term_cov.selectByVisibleText(prop.getProperty("term"));
			}
			Select pay_plan_cov = new Select(pay_plan);
			pay_plan_cov.selectByVisibleText(prop.getProperty("pay_plan"));
			if (!prop.getProperty("type_policy").equals("Nil")) {
				Select type_policy_cov = new Select(type_policy);
				type_policy_cov.selectByVisibleText(prop.getProperty("type_policy"));
			}
			if (!prop.getProperty("type_policy").equals("Nil")) {
				Select liability_insurance_cov = new Select(liability_insurance_coverage);
				liability_insurance_cov.selectByVisibleText(prop.getProperty("liability_insurance_coverage"));
			}
			if (!prop.getProperty("prior_BILimits").equals("Nil")) {
				Select prior_BILimits_cov = new Select(prior_BILimits);
				prior_BILimits_cov.selectByVisibleText(prop.getProperty("prior_BILimits"));
			}
			if (!prop.getProperty("duration_of_insurance").equals("Nil")) {
				Select duration_of_insurance_cov = new Select(duration_of_insurance);
				duration_of_insurance_cov.selectByVisibleText(prop.getProperty("duration_of_insurance"));
			}
			Select term_life_referral_cov = new Select(term_life_referral);
			term_life_referral_cov.selectByVisibleText(prop.getProperty("term_life_referral"));
			Select primary_insurance_cov = new Select(primary_insurance);
			primary_insurance_cov.selectByVisibleText(prop.getProperty("primary_insurance"));
			if (!prop.getProperty("road_side_ast").equals("Nil")) {
				Select road_side_ast_cov = new Select(road_side_ast);
				road_side_ast_cov.selectByVisibleText(prop.getProperty("road_side_ast"));
				MyWebElement.clickOn(road_side_ast_1);
				MyWebElement.clickOn(road_side_ast_2);
				MyWebElement.clickOn(road_side_ast_3);
				MyWebElement.clickOn(road_side_ast_4);
			}
			if (!prop.getProperty("homeOwner_disc").equals("Nil")) {
				Select homeOwner_disc_cov = new Select(homeOwner_disc);
				homeOwner_disc_cov.selectByVisibleText(prop.getProperty("homeOwner_disc"));
			}
		
			if (!prop.getProperty("liability_bi_pd_cov").equals("Nil")) {
				Select liability_bi_pd_ = new Select(liability_bi_pd_cov);
				liability_bi_pd_.selectByVisibleText(prop.getProperty("liability_bi_pd_cov"));
			}
			if (!prop.getProperty("umbi_cov").equals("Nil")) {
				Select umbi = new Select(umbi_cov);
				umbi.selectByVisibleText(prop.getProperty("umbi_cov"));
			}
			if (!prop.getProperty("umpd_cov").equals("Nil")) {
				Select umpd = new Select(umpd_cov);
				umpd.selectByVisibleText(prop.getProperty("umpd_cov"));
			}
			if (!prop.getProperty("umpd_ded").equals("Nil")) {
				Select umpd_ded_cov = new Select(umpd_ded);
				umpd_ded_cov.selectByVisibleText(prop.getProperty("umpd_ded"));
			}
			if (!prop.getProperty("medical_payments").equals("Nil")) {
				Select medical_payments_cov = new Select(medical_payments);
				medical_payments_cov.selectByVisibleText(prop.getProperty("medical_payments"));
			}
			if (!prop.getProperty("rental_reim").equals("Nil")) {
				Select rental_reim_cov = new Select(rental_reim);
				rental_reim_cov.selectByVisibleText(prop.getProperty("rental_reim"));
			}
			if (!prop.getProperty("est_credit").equals("Nil")) {
				Select est_credit_cov = new Select(est_credit);
				est_credit_cov.selectByVisibleText(prop.getProperty("est_credit"));
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
			if (!prop.getProperty("comp_ded").equals("Nil")) {
				Select comp_ded_veh = new Select(comp_ded);
				comp_ded_veh.selectByVisibleText(prop.getProperty("comp_ded"));
			}
			if (!prop.getProperty("coll_ded").equals("Nil")) {
				Select coll_ded_veh = new Select(coll_ded);
				coll_ded_veh.selectByVisibleText(prop.getProperty("coll_ded"));
			}
			if (!prop.getProperty("bus_use").equals("Nil")) {
				Select bus_use_veh = new Select(bus_use);
				bus_use_veh.selectByVisibleText(prop.getProperty("bus_use"));
			}
			if (!prop.getProperty("dbl_ded").equals("Nil")) {
				Select dbl_ded_veh = new Select(dbl_ded);
				dbl_ded_veh.selectByVisibleText(prop.getProperty("dbl_ded"));
			}
			if (!prop.getProperty("towing_labour").equals("Nil")) {
				Select towing_labour_veh = new Select(towing_labour);
				towing_labour_veh.selectByVisibleText(prop.getProperty("towing_labour"));
			}
			// MyWebElement.enterText(custom_equip, prop.getProperty("custom_equip"));

			//MyWebElement.clickOn(save);
			MyWebElement.clickOn(get_quote);

			BaseClass.screenShot(System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp
					+ "\\" + "1_Login_to_" + applicationType + ".png");

			Report.logTestCaseStatusWithSnapShot(parentTestCase, "PASS",
					"Successfully_Logged into '" + applicationType + "' application",
					System.getProperty("user.dir") + "\\Results\\Screenshots" + "_" + testRunTimeStamp + "\\"
							+ "1_Login_to_" + applicationType + ".png");

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
