package upper.lesson04.logging_system;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Anon. (Feb 12 2020). Sending Emails with Java [Web Tutorial]. Baeldung. Accessed 7 Nov 2021. https://www.baeldung.com/java-email
*/
public class EmailNotification {

    private void configure() {

    }

    public void send() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.mailtrap.io");
        properties.put("mail.smtp.port", "2525");
        properties.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("64be0430a4b2c8", "2bd0a4fe94d165");
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("erika.camilleri@gmail.com"));
            message.setRecipients(
            Message.RecipientType.TO, InternetAddress.parse("davidbriffa@gmail.com"));
            message.setSubject("Mail Subject");

            String msg = "This is my first email using JavaMailer";

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);

            Transport.send(message);
        
         System.out.println("message sent successfully....");  

        } catch (MessagingException exception) {
            exception.printStackTrace();
        }
    }
}