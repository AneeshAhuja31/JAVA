import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class sendemail {
    public static void main(String[] args) {
        String to = "abc@gmail.com";
        String from = "xyz@gmail.com";
        String host = "localhost";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session = Session.getDefaultInstance(properties); //create session object on which mail is sent
        try{
            MiniMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addReceipient(Message.ReceipientType.TO,new InternetAddress(to));
            message.setSubject("This is the subject line");

            //for html use setContent
            message.setText("Text");
            message.setContent("<h1>hello</h1>","text/html");

            Transport.send(message);
            System.out.println("Sent message");
        }catch(MessagingException e){
            e.printStackTrace();
        }
    }
}