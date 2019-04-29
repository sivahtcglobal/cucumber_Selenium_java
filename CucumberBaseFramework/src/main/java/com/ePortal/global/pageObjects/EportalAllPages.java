package com.ePortal.global.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ePortal.utilities.BaseClass;

public class EportalAllPages extends BaseClass {

	static WebDriver ldriver;

	public EportalAllPages(WebDriver dr) {

		ldriver = dr;
		PageFactory.initElements(dr, this);
	}

	public GlobalCommonObjects GlobalCommonObjects() {
		return new GlobalCommonObjects(ldriver);
	}

	

	public LoginPage loginPage() {
		return new LoginPage(ldriver);
	}

}