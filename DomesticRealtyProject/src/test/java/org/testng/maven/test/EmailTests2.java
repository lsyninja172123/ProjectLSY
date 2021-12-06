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

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.SubjectTerm;

import org.maven.test.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.maven.pages.EmailUtils2;

import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class EmailTests2 extends BaseClass {

	private static EmailUtils2 emailUtils;

	@BeforeClass
	public static void connectToEmail() {
		try {
			emailUtils = new EmailUtils2("domesticreality82@gmail.com", "sherwin@26", "smtp.gmail.com",
					EmailUtils2.EmailFolder.INBOX);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	/*
	 * @Test public void testVerificationCode() { try { //TODO: Execute actions to
	 * send verification code to email
	 * 
	 * String verificationCode = emailUtils.getAuthorizationCode();
	 * 
	 * //TODO: Enter verification code on screen and submit
	 * 
	 * //TODO: add assertions
	 * 
	 * } catch (Exception e) { e.printStackTrace(); Assert.fail(e.getMessage()); } }
	 */

	@Test
	public void testTextContained() {
		try {
			System.out.println("hi welcome");
			Message email = emailUtils.getMessagesBySubject("lead", true, 1)[0];
			System.out.println("Message email by subject is : " + email);
			boolean textInMessage = emailUtils.isTextInMessage(email, "Advertisement Response");
			System.out.println("Boolean value is : " + textInMessage);
			// Assert.assertTrue("Approval message is not in email",
			// emailUtils.isTextInMessage(email, "Advertisement Response"));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	/*
	 * @Test public void testLink() {
	 * 
	 * //TODO: apply for a loan using criteria that will result in the application
	 * being rejected
	 * 
	 * try{ Message email = emailUtils.
	 * getMessagesBySubject("Advertisement Response for Rs. 72 Lac, 3 BHK, Residential Apartment in Shriram New perungalathur"
	 * , true, 1)[0]; System.out.println("Message email by subject is : "+email);
	 * //String link = emailUtils.getUrlsFromMessage(email,
	 * "Click here to view the reason").get(0);
	 * 
	 * // driver.get(link);
	 * 
	 * //TODO: continue testing } catch (Exception e) { e.printStackTrace();
	 * Assert.fail(e.getMessage()); } }
	 */
}
