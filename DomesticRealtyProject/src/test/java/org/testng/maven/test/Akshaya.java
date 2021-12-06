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

import org.apache.commons.io.FileUtils;
import org.maven.test.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
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
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Akshaya extends BaseClass {

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

	@BeforeClass
	public void browserLaunch() throws Exception {

		driver = getBrowser("chrome");
	}

	@AfterClass
	public void browserQuit() throws Exception {

		driverQuit();
	}
	
	@AfterMethod // AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult akshayaResult) {
		// using ITestResult.FAILURE is equals to result.getStatus then it enter into if
		// condition
		if (ITestResult.FAILURE == akshayaResult.getStatus()) {
			try {
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				// Call method to capture screenshot
				File src = screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location
				// result.getName() will return name of test case so that screenshot name will
				// be same as test case name
				FileUtils.copyFile(src, new File("C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\Reports\\" + akshayaResult.getName() + ".png"));
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
	}

	@Test
	public static void akshayaTest() throws Exception {

		AkshayaLoginPage alp = new AkshayaLoginPage(driver);
		AkshayaHomePage ahp = new AkshayaHomePage(driver);

		File companyDetails = new File(companyFilePath);
		Workbook companyDetailsWorkbook = Workbook.getWorkbook(companyDetails);
		Sheet companyDetailsWorksheet = companyDetailsWorkbook.getSheet(0);
		int companyDetailsTotalNoOfRows = companyDetailsWorksheet.getRows();

		File leadDetails = new File(leadsFilePath);
		Workbook leadDetailsWorkbook = Workbook.getWorkbook(leadDetails);
		Sheet leadDetailsWorksheet = leadDetailsWorkbook.getSheet(0);
		int leadDetailsTotalNoOfRows = leadDetailsWorksheet.getRows();

		outputExcelFile = "C:\\Users\\LAKSHMI SRI\\Desktop\\Domestic Reality\\Reports\\"
				.concat("AkshayaReport_" + dateFormat.format(date) + ".xls");
		WritableWorkbook outputFileWorkbook = Workbook.createWorkbook(new File(outputExcelFile));
		WritableSheet outputFileWorksheet = outputFileWorkbook.createSheet("Akshaya", 0);

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

			switch (companyName) {
			case "AKSHAYA":
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
					if (leadPhoneNumber.startsWith("5")||leadPhoneNumber.startsWith("1-5")) {
						System.out.println("Enter valid phone number");
					} else {
						inputValue(ahp.getPhoneNumberTextBox(), leadPhoneNumber);
					}
					enterRobotClass();
					elementClick(ahp.getSelectProjectsDropdown());
					//elementClick(ahp.getTodayText());
					elementClick(ahp.getRepublicText());
					inputValue(ahp.getCityTextBox(), leadCity);
					inputValue(ahp.getStateTextBox(), leadState);
					inputValue(ahp.getCountryTextBox(), leadCountry);
					inputValue(ahp.getCommentTextBox(), leadComments);
					scrollToBottomPage();
					elementClick(ahp.getSaveButton());
					statusMessage = getText(ahp.getPopupMsg());
					leadStatusList.add(statusMessage);
					System.out.println("statusMessage is : "+statusMessage);
					Thread.sleep(2000);
				}
				elementClick(alp.getSignoutDropdown());
				elementClick(alp.getSignOut());
				Thread.sleep(2000);

				/*
				 * Write the output by creating a new excel file
				 */

				int leadNameIndex = 0;
				int leadEmailIndex = 0;
				int leadPhoneNumberIndex = 0;
				int leadStatusIndex = 0;
				//statusMessage = "Added in Akshaya";
				Label outputFileLeadNameHeader = new Label(0, 0, "Names");
				outputFileWorksheet.addCell(outputFileLeadNameHeader);
				Label outputFileEmailIDHeader = new Label(1, 0, "Email ID");
				outputFileWorksheet.addCell(outputFileEmailIDHeader);
				Label outputFilePhoneNumberHeader = new Label(2, 0, "Phone Number");
				outputFileWorksheet.addCell(outputFilePhoneNumberHeader);
				Label outputFileLeadStatusHeader = new Label(3, 0, "Status");
				outputFileWorksheet.addCell(outputFileLeadStatusHeader);
				for (String value : leadNameList) {
					outputFileWorksheet.addCell(new Label(0, ++leadNameIndex, value));
				}
				for (String value : leadEmailIDList) {
					outputFileWorksheet.addCell(new Label(1, ++leadEmailIndex, value));
				}
				for (String value : leadPhoneNumberList) {
					outputFileWorksheet.addCell(new Label(2, ++leadPhoneNumberIndex, value));
				}

				for (String value : leadStatusList) {
					outputFileWorksheet.addCell(new Label(3, ++leadStatusIndex, value));
				}

				outputFileWorkbook.write();
				outputFileWorkbook.close();
				break;
			}
		}

	}
}
