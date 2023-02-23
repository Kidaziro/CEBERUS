package check_email;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
public class EmailValidation {
    public static void main(String[] args) {
        String email = "zoro@gmail.com";
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
            System.out.println("Email address is valid.");
            System.out.println(email);
        } catch (AddressException e) {
            System.out.println("Email address is not valid.");
        }
    }
}