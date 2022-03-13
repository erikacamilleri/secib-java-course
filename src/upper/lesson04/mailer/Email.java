package upper.lesson04.mailer;

import java.util.HashMap;

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

import upper.lesson04.Environment;

/**
 * Anon. (Feb 12 2020). Sending Emails with Java [Web Tutorial]. Baeldung. Accessed 7 Nov 2021. https://www.baeldung.com/java-email
*/
public class Email {

    protected String recipientTo;

    protected String recipientFrom;

    protected String subject;

    protected String message;

    protected boolean isMessageTemplate;

    protected HashMap<String, String> parameters;

    public Email (String recipientFrom, String recipientTo, String subject, String message, boolean isMessageTemplate) {
        this.recipientFrom = recipientFrom;
        this.recipientTo = recipientTo;
        this.subject = subject;
        this.isMessageTemplate = isMessageTemplate;
        this.message = message;
    }

    private String getMessage() {
        // TODO IF isMessageTemplate THEN getMessageFromFile
        // TODO IF parameters.isNotEmpty() THEN replace KEYS in template with VALUES
        return this.message;
    }

    public void send () {
        Environment environmet = Environment.instance();
        Session session = Session.getInstance(environmet.properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(environmet.properties.getProperty("mail.smtp.username"), 
                environmet.properties.getProperty("mail.smtp.password"));
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(this.recipientFrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.recipientTo));
            message.setSubject(this.subject);
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(this.getMessage(), "text/html");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);
            message.setContent(multipart);
            Transport.send(message);
        } catch (MessagingException exception) {
            exception.printStackTrace();
        }
    }
}