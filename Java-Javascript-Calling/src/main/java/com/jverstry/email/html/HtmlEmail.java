
package com.jverstry.email.html;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class HtmlEmail {

	public static void main(String[] args)
			throws AddressException, MessagingException {
		
		String to = "jverstry@gmail.com";
		String from = "ffff@ooop.com";

		// Which server is sending the email?
		String sender = "localhost";

		// Setting sending mail server
		Properties ps = System.getProperties();
		ps.setProperty("mail.smtp.host", sender);
		
		// Providing email and password access to mail server
		ps.setProperty("mail.user", "jverstry@gmail.com");
		ps.setProperty("mail.password", "xxxxxxxxxxxxx");

		// Retrieving the mail session
		Session session = Session.getDefaultInstance(ps);

		// Create a default MimeMessage
		MimeMessage m = new MimeMessage(session);

		m.setFrom(new InternetAddress(from));
		m.addRecipient(
			Message.RecipientType.TO, new InternetAddress(to));

		m.setSubject("This an email test !!!");
		
		StringBuilder htmlContent = new StringBuilder();
		htmlContent.append("<h1>My Email Content Header</h1>");
		htmlContent.append("Some body text");
		 
        m.setContent(htmlContent.toString(), "text/html" );
		
		// Sending the message
		Transport.send(m);
		 
	}
	
}
