package com.selenium.methods;

import java.util.*;  

import javax.mail.*;  
import javax.mail.internet.*;  
import javax.mail.internet.MimeMessage.RecipientType;
import javax.activation.*;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendMessage {

	public static final String ACCOUNT_SID = "ACc0349f2709d1cd9575f647ebdb9fdcba";
	public static final String AUTH_TOKEN = "48d77b44573fa75e49dadd280f2ba3fd";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//		Message message = Message.creator(
//				new com.twilio.type.PhoneNumber("+918985483162"), 
//				new com.twilio.type.PhoneNumber("+12056193328"), 
//				"Test Message")
//				.create();

		String to = "marpu.bhargav@gmail.com";//change accordingly  
	      String from = "marpu.bhargav@gmail.com";
	      String host = "127.0.0.1";//or IP address  
	  
	     //Get the session object  
	      Properties properties = System.getProperties();  
	      properties.setProperty("mail.smtp.host", "smtp.gmail.com");  
	      properties.put("mail.smtp.starttls.enable", "true");
	      properties.put("mail.smtp.port", "587");
	      properties.put("mail.smtp.auth", "true");
	      
	      Session session = Session.getDefaultInstance(properties);  
	  
	     //compose the message  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));
	         
	         message.addRecipient(RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("Ping");  
	         message.setText("Hello, this is example of sending email  ");  
	  
	         // Send message  
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   }  
	
		
	}
