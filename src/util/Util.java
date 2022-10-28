package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Util {
    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
