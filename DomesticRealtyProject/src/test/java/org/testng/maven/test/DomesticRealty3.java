package org.testng.maven.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

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
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DomesticRealty3 extends BaseClass {

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
	static String statusMessage;
	static String outputExcelFile;
	static Date date = new Date();
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	static List<String> leadNameList;
	static List<String> leadEmailIDList;
	static List<String> leadPhoneNumberList;
	static List<String> leadCityList;
	static List<String> leadStateList;
	static List<String> leadCountryList;
	static List<String> leadCommentsList;
	static List<String> leadStatusList;
	static File leadDetails;
	static Workbook leadDetailsWorkbook;
	static Sheet leadDetailsWorksheet;
	static int leadDetailsTotalNoOfRows;

	/*
	 * Reading the Leads excel file and iterating to the last row number
	 */
	public static void readingLeadExcelSheet() throws Exception, IOException {

		leadDetails = new File(leadsFilePath);
		leadDetailsWorkbook = Workbook.getWorkbook(leadDetails);
		leadDetailsWorksheet = leadDetailsWorkbook.getSheet(0);
		leadDetailsTotalNoOfRows = leadDetailsWorksheet.getRows();

		/*
		 * leadNameList = new ArrayList<String>(); leadEmailIDList = new
		 * ArrayList<String>(); leadPhoneNumberList = new ArrayList<String>();
		 * leadCityList = new ArrayList<String>(); leadStateList = new
		 * ArrayList<String>(); leadCountryList = new ArrayList<String>();
		 * leadCommentsList = new ArrayList<String>(); leadStatusList = new
		 * ArrayList<String>();
		 */
	}

	/*
	 * Write the output by creating a new excel file
	 */
	public static void writeOutputExcel() throws Exception {

		outputExcelFile = "C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\Reports\\"
				.concat("DomesticRealityReport_" + dateFormat.format(date) + ".xls");
		WritableWorkbook outputFileWorkbook = Workbook.createWorkbook(new File(outputExcelFile));
		WritableSheet outputFileWorksheet = outputFileWorkbook.createSheet("Report", 0);

		int leadNameIndex = 0;
		int leadEmailIndex = 0;
		int leadPhoneNumberIndex = 0;
		int leadStatusIndex = 0;
		statusMessage = "Added in Casa Grande";
		Label outputFileLeadNameHeader = new Label(0, 0, "Names");
		outputFileWorksheet.addCell(outputFileLeadNameHeader);
		Label outputFileEmailIDHeader = new Label(1, 0, "Email ID");
		outputFileWorksheet.addCell(outputFileEmailIDHeader);
		Label outputFilePhoneNumberHeader = new Label(2, 0, "Phone Number");
		outputFileWorksheet.addCell(outputFilePhoneNumberHeader);
		Label outputFileLeadStatusHeader = new Label(3, 0, "Status");
		outputFileWorksheet.addCell(outputFileLeadStatusHeader);
		for (String value : leadNameList) {
			System.out.println("****************OUTPUT*******************");
			System.out.println(value);
			outputFileWorksheet.addCell(new Label(0, ++leadNameIndex, value));
		}
		for (String value : leadEmailIDList) {
			outputFileWorksheet.addCell(new Label(1, ++leadEmailIndex, value));
		}
		for (String value : leadPhoneNumberList) {
			outputFileWorksheet.addCell(new Label(2, ++leadPhoneNumberIndex, value));
		}

		for (String value : leadPhoneNumberList) {
			outputFileWorksheet.addCell(new Label(3, ++leadStatusIndex, statusMessage));
		}

		outputFileWorkbook.write();
		outputFileWorkbook.close();
	}

	@BeforeClass
	public void browserLaunch() throws Exception {

		driver = getBrowser("chrome");
	}

	@AfterClass
	public void browserQuit() throws Exception {

		driverQuit();
	}

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

		outputExcelFile = "C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\Reports\\"
				.concat("DomesticRealityReport_" + dateFormat.format(date) + ".xls");
		WritableWorkbook outputFileWorkbook = Workbook.createWorkbook(new File(outputExcelFile));
		WritableSheet outputFileWorksheet = outputFileWorkbook.createSheet("Report", 0);

		List<String> companyNameList = new ArrayList<String>();
		List<String> nameList = new ArrayList<String>();
		List<String> designationList = new ArrayList<String>();
		List<String> mobileNumberList = new ArrayList<String>();
		List<String> emailIDList = new ArrayList<String>();
		List<String> websiteUrlList = new ArrayList<String>();
		List<String> userNameList = new ArrayList<String>();
		List<String> passwordList = new ArrayList<String>();

		List<String> leadNameList = new ArrayList<String>();
		List<String> leadEmailIDList = new ArrayList<String>();
		List<String> leadPhoneNumberList = new ArrayList<String>();
		List<String> leadCityList = new ArrayList<String>();
		List<String> leadStateList = new ArrayList<String>();
		List<String> leadCountryList = new ArrayList<String>();
		List<String> leadCommentsList = new ArrayList<String>();
		List<String> leadStatusList = new ArrayList<String>();

		for (int row = 1; row < companyDetailsTotalNoOfRows; row++) {
			companyName = companyDetailsWorksheet.getCell(0, row).getContents().trim();
			name = companyDetailsWorksheet.getCell(1, row).getContents().trim();
			designation = companyDetailsWorksheet.getCell(2, row).getContents().trim();
			mobileNumber = companyDetailsWorksheet.getCell(4, row).getContents().trim();
			emailID = companyDetailsWorksheet.getCell(5, row).getContents().trim();
			websiteUrl = companyDetailsWorksheet.getCell(6, row).getContents().trim();
			userName = companyDetailsWorksheet.getCell(7, row).getContents().trim();
			password = companyDetailsWorksheet.getCell(8, row).getContents().trim();

			companyNameList.add(companyName);
			nameList.add(name);
			designationList.add(designation);
			mobileNumberList.add(mobileNumber);
			emailIDList.add(emailID);
			websiteUrlList.add(websiteUrl);
			userNameList.add(userName);
			passwordList.add(password);

			// switch (companyName) {
			// case "CASA GRANDE":
			if (companyName.equalsIgnoreCase("casa grande")) {

				getUrl(websiteUrl);
				inputValue(clp.getUserName(), userName);
				inputValue(clp.getPassWord(), password);
				elementClick(clp.getSignInButton());
				Thread.sleep(1000);
				elementClick(chp.getLeadsLink());

				for (int rows = 1; rows < leadDetailsTotalNoOfRows; rows++) {

					leadName = leadDetailsWorksheet.getCell(0, rows).getContents().trim();
					leadEmailID = leadDetailsWorksheet.getCell(1, rows).getContents().trim();
					leadPhoneNumber = leadDetailsWorksheet.getCell(2, rows).getContents().trim();
					leadCity = leadDetailsWorksheet.getCell(3, rows).getContents().trim();
					leadState = leadDetailsWorksheet.getCell(4, rows).getContents().trim();
					leadCountry = leadDetailsWorksheet.getCell(5, rows).getContents().trim();
					leadComments = leadDetailsWorksheet.getCell(6, rows).getContents().trim();

					leadNameList.add(leadName);
					leadEmailIDList.add(leadEmailID);
					leadPhoneNumberList.add(leadPhoneNumber);
					leadCityList.add(leadCity);
					leadStateList.add(leadState);
					leadCountryList.add(leadCountry);
					leadCommentsList.add(leadComments);

					elementClick(chp.getAddLead());
					inputValue(chp.getFirstName(), leadName);
					elementClick(chp.getEmailDropdown());
					inputValue(chp.getEmailTextBox(), leadEmailID);
					enterRobotClass();
					elementClick(chp.getPhoneNumberTextBox());
					inputValue(chp.getPhoneNumberTextBox(), leadPhoneNumber);
					enterRobotClass();
					elementClick(chp.getSelectProjectsDropdown());
					elementClick(chp.getCgAstaText());
					inputValue(chp.getCityTextBox(), leadCity);
					inputValue(chp.getStateTextBox(), leadState);
					inputValue(chp.getCountryTextBox(), leadCountry);
					inputValue(chp.getCommentTextBox(), leadComments);
					scrollToBottomPage();
					elementClick(chp.getSaveButton());
					Thread.sleep(2000);
					elementClick(clp.getSignoutDropdown());
					elementClick(clp.getSignOut());
					Thread.sleep(2000);

					// break;
				}
			} else if (companyName.equalsIgnoreCase("akshaya")) {

				// case "AKSHAYA":
				getUrl(websiteUrl);
				inputValue(alp.getUserName(), userName);
				inputValue(alp.getPassWord(), password);
				elementClick(alp.getSignInButton());
				Thread.sleep(1000);
				elementClick(ahp.getLeadsLink());
				for (int rows = 1; rows < leadDetailsTotalNoOfRows; rows++) {

					leadName = leadDetailsWorksheet.getCell(0, rows).getContents().trim();
					leadEmailID = leadDetailsWorksheet.getCell(1, rows).getContents().trim();
					leadPhoneNumber = leadDetailsWorksheet.getCell(2, rows).getContents().trim();
					leadCity = leadDetailsWorksheet.getCell(3, rows).getContents().trim();
					leadState = leadDetailsWorksheet.getCell(4, rows).getContents().trim();
					leadCountry = leadDetailsWorksheet.getCell(5, rows).getContents().trim();
					leadComments = leadDetailsWorksheet.getCell(6, rows).getContents().trim();

					leadNameList.add(leadName);
					leadEmailIDList.add(leadEmailID);
					leadPhoneNumberList.add(leadPhoneNumber);
					leadCityList.add(leadCity);
					leadStateList.add(leadState);
					leadCountryList.add(leadCountry);
					leadCommentsList.add(leadComments);
					elementClick(ahp.getAddLead());
					inputValue(ahp.getFirstName(), leadName);
					elementClick(ahp.getEmailDropdown());
					inputValue(ahp.getEmailTextBox(), leadEmailID);
					enterRobotClass();
					elementClick(ahp.getPhoneNumberTextBox());
					inputValue(ahp.getPhoneNumberTextBox(), leadPhoneNumber);
					enterRobotClass();
					elementClick(ahp.getSelectProjectsDropdown());
					elementClick(ahp.getTodayText());
					inputValue(ahp.getCityTextBox(), leadCity);
					inputValue(ahp.getStateTextBox(), leadState);
					inputValue(ahp.getCountryTextBox(), leadCountry);
					inputValue(ahp.getCommentTextBox(), leadComments);
					scrollToBottomPage();
					elementClick(ahp.getSaveButton());
					Thread.sleep(2000);
					elementClick(alp.getSignoutDropdown());
					elementClick(alp.getSignOut());
					Thread.sleep(2000);
					// break;
				}
			}
			writeOutputExcel();
		}

	}
}
