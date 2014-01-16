package com.miracle.sharebazar.mailandsms;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {


	private String HOST_NAME = "smtp.gmail.com";
	private String USER_MAIL_ID = "deliverybazaar";  // username
	private String AUTH_PWD = "jayintech";      // passwd
	public boolean sendMessageToMail(String mailid,String subject , String msg)
	{

		try {
			String port=null;
			Properties props = System.getProperties();
			props.put("mail.smtp.host", HOST_NAME);
			props.put("mail.smtp.user", USER_MAIL_ID);
			props.put("mail.smtp.password", AUTH_PWD);
			String[] s2=mailid.split("@");
			for(int i=0;i<s2.length;i++)
			{

				port=s2[i];
				System.out.println(port);
			}
			String s3[]=port.split("\\.");
			port=s3[0];	

			if(port.equals("gmail"))
			{
				System.out.println("gmail");
				props.put("mail.smtp.port", "587");
			}
			else
			{
				System.out.println("yahoo");
				props.put("mail.smtp.port", "465");
			}
			//props.put("mail.smtp.port", "587"); // gmail HTTPS port , in case you need to use yahoo or other , 
			//in that case you need to change it for the same.
			props.put("mail.smtp.auth", "true");

			String[] to = {mailid}; // Put id of the receiver here

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(USER_MAIL_ID));
			InternetAddress[] toAddress = new InternetAddress[to.length];

			for( int i=0; i < to.length; i++ ) { 
				toAddress[i] = new InternetAddress(to[i]);
			}
			System.out.println(Message.RecipientType.TO);

			for( int i=0; i < toAddress.length; i++) { 
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			message.setSubject(subject);
			message.setContent(msg, "text/html; charset=utf-8");


			Transport transport = session.getTransport("smtps");
			transport.connect(HOST_NAME, USER_MAIL_ID, AUTH_PWD);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			return true;	    

		}catch(Exception e)	{
			e.printStackTrace();
			return false;
		}
	}


}
