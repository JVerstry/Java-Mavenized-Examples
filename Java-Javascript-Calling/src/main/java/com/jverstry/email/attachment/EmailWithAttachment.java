
package com.jverstry.email.attachment;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import org.apache.commons.io.IOUtils;

public class EmailWithAttachment {

	public static void main(String[] args) throws AddressException,
			MessagingException, IOException {
		
		String to = "jverstry@gmail.com";
		String from = "ffff@ooop.com";

		// Which server is sending the email?
		String host = "localhost";

		// Setting sending mail server
		Properties ps = System.getProperties();
		ps.setProperty("mail.smtp.host", host);
		
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
		 
        // Create a multipart message
        Multipart mp = new MimeMultipart();
		
		// Body text
		BodyPart messageBP = new MimeBodyPart();
        messageBP.setText("Some message body !!!");
        mp.addBodyPart(messageBP);

        // Attachment
        BodyPart messageBP2 = new MimeBodyPart();
		
		String image = "/MyImage.jpg";
		InputStream is = EmailWithAttachment.class
			.getResourceAsStream(image);
		
        DataSource source = new ByteArrayDataSource(
			IOUtils.toByteArray(is), "image/jpeg");

        messageBP2.setDataHandler(new DataHandler(source));
        mp.addBodyPart(messageBP2);

        m.setContent(mp);

		// Sending the message
		Transport.send(m);
		 
	}
	
}
