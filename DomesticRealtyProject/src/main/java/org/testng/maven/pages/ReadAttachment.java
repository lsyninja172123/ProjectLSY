package org.testng.maven.pages;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;

public class ReadAttachment {

	public static void check(String host, String storeType, String user,
	      String password) 
	   {
	      try {

	      //create properties field
	      Properties properties = new Properties();

	      properties.put("mail.pop3.host", host);
	      properties.put("mail.pop3.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");
	      Session emailSession = Session.getDefaultInstance(properties);
	  
	      //create the POP3 store object and connect with the pop server
	      Store store = emailSession.getStore("pop3s");

	      store.connect(host, user, password);

	      //create the folder object and open it
	      Folder emailFolder = store.getFolder("INBOX");
	      emailFolder.open(Folder.READ_ONLY);
	      
	      Date date = new Date();
	      int idate = (int) new Date().getTime();
	  	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	  	String dateString = dateFormat.format(date).toString();
	  	System.out.println(date);

	      // retrieve the messages from the folder in an array and print it
	      Message[] messages = emailFolder.getMessages();
	      System.out.println("messages.length---" + messages.length);
	      
	      
	      for (int i = 0, n = messages.length; i < 2; i++) {
	         Message message = messages[i];
	         
	         System.out.println("---------------------------------");
	         System.out.println("Email Number " + (i + 1));
	         
	         System.out.println("Sent Date: " + message.getSentDate());
	         System.out.println("Received Date: " + message.getReceivedDate());
	         System.out.println("Subject: " + message.getSubject());
	         System.out.println("From: " + message.getFrom()[0]);
	         System.out.println("Text: " + message.getContent().toString());
	         
	         writePart(message);
	         
	         /*BufferedReader reader = new BufferedReader(new InputStreamReader(
				      System.in));
	         String line = reader.readLine();
	            if ("YES".equals(line)) {
	               message.writeTo(System.out);
	            } else if ("QUIT".equals(line)) {
	               break;
	            }
	         }*/
	         
	         /*Multipart multipart = (Multipart) message.getContent();  
	         
	         for (int j = 0; j < multipart.getCount(); j++) {  
	          BodyPart bodyPart = multipart.getBodyPart(j);  
	          InputStream stream = bodyPart.getInputStream();  
	          BufferedReader br = new BufferedReader(new InputStreamReader(stream));  
	       
	           while (br.ready()) {  
	            System.out.println(br.readLine());  
	           }  
	          System.out.println();  
	         }  
*/
	      }
	      //close the store and folder objects
	      emailFolder.close(false);
	      store.close();

	      } catch (NoSuchProviderException e) {
	         e.printStackTrace();
	      } catch (MessagingException e) {
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

	 public static void writePart(Part p) throws Exception {
	      if (p instanceof Message)

	      System.out.println("----------------------------");
	      System.out.println("CONTENT-TYPE: " + p.getContentType());

	      //check if the content is plain text
	      if (p.isMimeType("text/plain")) {
	         System.out.println("This is plain text");
	         System.out.println("---------------------------");
	         System.out.println((String) p.getContent());
	         
	      } 
	      //check if the content has attachment
	      else if (p.isMimeType("multipart/*")) {
	         System.out.println("This is a Multipart");
	         System.out.println("---------------------------");
	         Multipart mp = (Multipart) p.getContent();
	         int count = mp.getCount();
	         for (int i = 0; i < count; i++)
	            writePart(mp.getBodyPart(i));
	      } 
	      //check if the content is a nested message
	      else if (p.isMimeType("message/rfc822")) {
	         System.out.println("This is a Nested Message");
	         System.out.println("---------------------------");
	         writePart((Part) p.getContent());
	      } 
	     	     
	      else {
	         Object o = p.getContent();
	         if (o instanceof String) {
	            System.out.println("This is a string");
	            System.out.println("---------------------------");
	            System.out.println((String) o);
	         } 
	        
	         else {
	            System.out.println("This is an unknown type");
	            System.out.println("---------------------------");
	            System.out.println(o.toString());
	         }
	      }

	   }

	
	public static void main(String[] args) {

		String host = "pop.gmail.com";// change accordingly
		String mailStoreType = "pop3";
		String username = "domesticreality82@gmail.com";// change accordingly
		String password = "sherwin@26";// change accordingly

		check(host, mailStoreType, username, password);

	}

}
