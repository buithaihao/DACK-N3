import java.util.regex.Pattern;

public class dang_ky {
    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    public static boolean Ten(String Ten){
        return !Ten.trim().isEmpty();
    }

    public static boolean Ho(String Ho){
        return !Ho.trim().isEmpty();
    }

    public static boolean password(String password){
        return !password.trim().isEmpty();
    }

    public static boolean ConfirmPassword(String CfPwd, String password){
        return CfPwd.equals(password);
    }



    public static boolean Gmail(String gmail){
        String regexPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return patternMatches(gmail, regexPattern);
    }
}
