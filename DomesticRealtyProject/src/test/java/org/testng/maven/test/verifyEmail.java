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

public class verifyEmail extends BaseClass {
	
	static String emailID = "domesticreality82@gmail.com";
	static String password = "shrewin@26";
	
	
	
	public verifyEmail() throws Exception {
		Message email = getEmail(emailID, password, "Advertisement Response");
		System.out.println(email.getAllRecipients());
		System.out.println(email.getContent());
		System.out.println(email.getSubject());

		    }

	@Test
	public Message getEmail(String emailID, String password, String subjectToBeSearched) throws Exception {
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");

		Session session = Session.getDefaultInstance(props, null);
		Store store = session.getStore("imaps");
		store.connect("imap.gmail.com", emailID, password);

		Folder folder = store.getFolder("INBOX");
		folder.open(Folder.READ_WRITE);

		Message[] messages = null;
		boolean mailFound = false;
		Message email = null;

		for (int i = 0; i < 30; i++) {
		    messages = folder.search(new SubjectTerm(subjectToBeSearched), folder.getMessages());
		    if (messages.length == 0) {
		        Thread.sleep(10000);
		    }
		}

		for (Message mail : messages) {
		    if (!mail.isSet(Flags.Flag.SEEN)) {
		        email = mail;
		        mailFound = true;
		    }
		}

		if (!mailFound) {
		    throw new Exception("Could not found Email");
		}

		return email;
		}
}
