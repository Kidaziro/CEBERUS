/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_email;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
    public static void main(String[] args) {
        String email = "example@example$.com";
        if(validate(email)){
            System.out.println("Email address is valid");
        }
        else{
            System.out.println("Email address is invalid");
        }
    }
}