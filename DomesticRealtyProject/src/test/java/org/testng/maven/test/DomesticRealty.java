package org.testng.maven.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.maven.test.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.maven.pages.AkshayaHomePage;
import org.testng.maven.pages.AkshayaLoginPage;
import org.testng.maven.pages.CasaGrandeHomePage;
import org.testng.maven.pages.CasaGrandeLoginPage;
import org.testng.maven.pages.RadianceHomePage;
import org.testng.maven.pages.RadianceLoginPage;

import jxl.Sheet;
import jxl.Workbook;

public class DomesticRealty extends BaseClass {

	public static WebDriver driver;
	static String companyFilePath = "C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\CompanyWebsites.xls";
	static String leadsFilePath = "C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\Leads.xls";
	static String companyName;
	static String name;
	static String designation;
	static String mobileNumber;
	static String emailID;
	static String websiteUrl;
	static String userName;
	static String password;
	static String leadName;
	static String leadEmailID;
	static String leadPhoneNumber;
	static String leadCity;
	static String leadState;
	static String leadCountry;
	static String leadComments;

	@BeforeClass
	public void browserLaunch() throws Exception {

		driver = getBrowser("chrome");
	}

	/*
	 * @AfterClass public void browserQuit() throws Exception {
	 * 
	 * driverQuit(); }
	 */

	@Test
	public void test() throws Exception {

		CasaGrandeLoginPage clp = new CasaGrandeLoginPage(driver);
		AkshayaLoginPage alp = new AkshayaLoginPage(driver);
		RadianceLoginPage rlp = new RadianceLoginPage(driver);
		CasaGrandeHomePage chp = new CasaGrandeHomePage(driver);
		AkshayaHomePage ahp = new AkshayaHomePage(driver);
		RadianceHomePage rhp = new RadianceHomePage(driver);

		File companyDetails = new File(companyFilePath);
		Workbook companyDetailsWorkbook = Workbook.getWorkbook(companyDetails);
		Sheet companyDetailsWorksheet = companyDetailsWorkbook.getSheet(0);
		int companyDetailsTotalNoOfRows = companyDetailsWorksheet.getRows();

		File leadDetails = new File(leadsFilePath);
		Workbook leadDetailsWorkbook = Workbook.getWorkbook(leadDetails);
		Sheet leadDetailsWorksheet = leadDetailsWorkbook.getSheet(0);
		int leadDetailsTotalNoOfRows = leadDetailsWorksheet.getRows();

		for (int row = 1; row < companyDetailsTotalNoOfRows; row++) {
			companyName = companyDetailsWorksheet.getCell(0, row).getContents().trim();
			name = companyDetailsWorksheet.getCell(1, row).getContents().trim();
			designation = companyDetailsWorksheet.getCell(2, row).getContents().trim();
			mobileNumber = companyDetailsWorksheet.getCell(4, row).getContents().trim();
			emailID = companyDetailsWorksheet.getCell(5, row).getContents().trim();
			websiteUrl = companyDetailsWorksheet.getCell(6, row).getContents().trim();
			userName = companyDetailsWorksheet.getCell(7, row).getContents().trim();
			password = companyDetailsWorksheet.getCell(8, row).getContents().trim();

			List<String> companyNameList = new ArrayList<String>();
			List<String> nameList = new ArrayList<String>();
			List<String> designationList = new ArrayList<String>();
			List<String> mobileNumberList = new ArrayList<String>();
			List<String> emailIDList = new ArrayList<String>();
			List<String> websiteUrlList = new ArrayList<String>();
			List<String> userNameList = new ArrayList<String>();
			List<String> passwordList = new ArrayList<String>();

			companyNameList.add(companyName);
			nameList.add(name);
			designationList.add(designation);
			mobileNumberList.add(mobileNumber);
			emailIDList.add(emailID);
			websiteUrlList.add(websiteUrl);
			userNameList.add(userName);
			passwordList.add(password);

			for (int rows = 1; rows < leadDetailsTotalNoOfRows; rows++) {

				leadName = leadDetailsWorksheet.getCell(0, row).getContents().trim();
				leadEmailID = leadDetailsWorksheet.getCell(1, row).getContents().trim();
				leadPhoneNumber = leadDetailsWorksheet.getCell(2, row).getContents().trim();
				leadCity = leadDetailsWorksheet.getCell(3, row).getContents().trim();
				leadState = leadDetailsWorksheet.getCell(4, row).getContents().trim();
				leadCountry = leadDetailsWorksheet.getCell(5, row).getContents().trim();
				leadComments = leadDetailsWorksheet.getCell(6, row).getContents().trim();

				List<String> leadNameList = new ArrayList<String>();
				List<String> leadEmailIDList = new ArrayList<String>();
				List<String> leadPhoneNumberList = new ArrayList<String>();
				List<String> leadCityList = new ArrayList<String>();
				List<String> leadStateList = new ArrayList<String>();
				List<String> leadCountryList = new ArrayList<String>();
				List<String> leadCommentsList = new ArrayList<String>();

				leadNameList.add(leadName);
				leadEmailIDList.add(leadEmailID);
				leadPhoneNumberList.add(leadPhoneNumber);
				leadPhoneNumberList.add(leadCity);
				leadPhoneNumberList.add(leadState);
				leadPhoneNumberList.add(leadCountry);
				leadCommentsList.add(leadComments);

				switch (companyName) {
				case "CASA GRANDE":
					getUrl(websiteUrl);
					inputValue(clp.getUserName(), userName);
					inputValue(clp.getPassWord(), password);
					elementClick(clp.getSignInButton());
					Thread.sleep(1000);

					elementClick(chp.getLeadsLink());
					elementClick(chp.getAddLead());
					inputValue(chp.getFirstName(), leadName);
					Thread.sleep(2000);
					elementClick(chp.getEmailDropdown());
					inputValue(chp.getEmailTextBox(), leadEmailID);
					enterRobotClass();
					Thread.sleep(2000);
					elementClick(chp.getPhoneNumberTextBox());
					inputValue(chp.getPhoneNumberTextBox(), leadPhoneNumber);
					enterRobotClass();
					Thread.sleep(2000);
					elementClick(chp.getSelectProjectsDropdown());
					elementClick(chp.getCgAstaText());
					Thread.sleep(2000);
					inputValue(chp.getCityTextBox(), leadCity);
					Thread.sleep(2000);
					inputValue(chp.getStateTextBox(), leadState);
					Thread.sleep(2000);
					inputValue(chp.getCountryTextBox(), leadCountry);
					Thread.sleep(2000);
					inputValue(chp.getCommentTextBox(), leadComments);
					Thread.sleep(2000);
					scrollToBottomPage();
					elementClick(chp.getSaveButton());
					Thread.sleep(2000);

					// elementClick(clp.getSignoutDropdown());
					// elementClick(clp.getSignOut());
					// Thread.sleep(2000);
					break;

				case "AKSHAYA":
					getUrl(websiteUrl);
					inputValue(alp.getUserName(), userName);
					inputValue(alp.getPassWord(), password);
					elementClick(alp.getSignInButton());
					Thread.sleep(1000);
					elementClick(alp.getSignoutDropdown());
					elementClick(alp.getSignOut());
					Thread.sleep(2000);
					break;

				case "RADIANCE":
					getUrl(websiteUrl);
					inputValue(rlp.getUserName(), userName);
					inputValue(rlp.getPassWord(), password);
					elementClick(rlp.getSignInButton());
					Thread.sleep(1000);
					elementClick(rlp.getSignoutDropdown());
					elementClick(rlp.getSignOut());
					Thread.sleep(2000);
					break;

				case "TVS Emarald":
					getUrl(websiteUrl);
					Thread.sleep(1000);
					break;

				default:
					break;
				}
			}
		}
	}
}
