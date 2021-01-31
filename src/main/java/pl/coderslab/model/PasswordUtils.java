package pl.coderslab.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUtils {
    public static boolean validatePasswordStrength(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[!@#$%^&*()_+\\-={}\\[\\]|\\:\";'<>?,./])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[!@#$%^&*()_+\\-={}\\[\\]|\\:\";'<>?,./a-zA-Z\\d]{8,}$");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
