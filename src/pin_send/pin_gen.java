package pin_send;

import static Session.Compte.User_name;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import message_gen.message;

public class pin_gen {

    private String from, to, host, sub, content;
    private String username = "moadzero27@gmail.com";
    private String password = "vcwuynxdlqjijngy";
    Random rnum = new Random();
    public static int ID;
    message show_message;

    public void gen(String email, String obj, String message) {
        from = "moadzero27@gmail.com";
        to = email;
        host = "localhost";
        sub = obj;
        content = "pin code";
        ID = rnum.nextInt(999999);
        String htmlText;
        htmlText = "<style>\n"
                + "    #bd {\n"
                + "        background-color: #252525;\n"
                + "\n"
                + "        text-align: center;\n"
                + "        color: white;\n"
                + "        font-family: cursive;    border: solid;\n"
                + "    border-color: orange;\n"
                + "\n"
                + "    }\n"
                + "\n"
                + "    #img {\n"
                + "        text-align: center;\n"
                + "    }\n"
                + "\n"
                + "    img {\n"
                + "        width: 20%;\n"
                + "    }\n"
                + "\n"
                + "    #text {\n"
                + "    }\n"
                + "\n"
                + "    a {\n"
                + "        color: orange;\n"
                + "        text-align: left;\n"
                + "        text-decoration: none;\n"
                + "        padding-right: 11px;\n"
                + "    }\n"
                + "    #link{\n"
                + "        text-align: right;\n"
                + "        padding-bottom: 10px;\n"
                + "    padding-top: 20px;\n"
                + "    }\n"
                + "</style>\n"
                + "\n"
                + "<body>\n"
                + "    <div id=\"bd\">\n"
                + "        <div id=\"img\">\n"
                + "\n"
                + "            <img src=\"https://i.ibb.co/XxDvG4h/Logo.png\">\n"
                + "\n"
                + "        </div>\n"
                + "\n"
                + "        <div id=\"text\">\n"
                + "            <h3 style=\"color:white;font-family: cursive;\">Your code is : " + "<span style=\"color: orange;\">" + ID + "<span>" + "\n"
                + "                <br>\n"
                + "            </h3>\n"
                + message + "\n"
                + "\n"
                + "        </div>\n"
                + "        <div id=\"link\">\n"
                + "\n"
                + "            <a href=\"#\">@Mr.x</a>\n"
                + "        </div>\n"
                + "    </div>\n"
                + "\n"
                + "</body>\n"
                + "\n"
                + "</html>";

        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
            public PasswordAuthentication getpasAuthentication() {
                if ((username != null) && (username.length() > 0) && (password != null)
                        && (password.length() > 0)) {
                    return new PasswordAuthentication(username, password);
                }
                return null;
            }

        });
        try {
            MimeMessage m = new MimeMessage(s);
            m.setFrom(from);
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(sub);
            m.setContent(htmlText, "text/html");
            Transport.send(m, username, password);
            String[] keys = new String[3];
            keys[0] = "email";
            keys[1] = "pin";
            keys[2] = "Date";
            //-->
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
            //-->
            String[] val = new String[3];
            val[0] = to;
            val[1] = String.valueOf(ID);
            val[2] = formattedDateTime;

            new mongodb.mongoRobot(1, keys, val, "email_code");
            
        } catch (Exception e) {
            System.out.println(e);
            new Log_Reg.Login_or_Register().message_Gen(1, "Problem ,Tray Again !");
        }

    }

    public pin_gen(String string, String x2, String x3) {
        gen(string, x2, x3);
    }

}
