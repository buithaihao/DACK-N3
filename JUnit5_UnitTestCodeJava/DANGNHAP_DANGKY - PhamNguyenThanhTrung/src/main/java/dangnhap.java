import java.util.HashMap;
import java.util.Map;

public class dangnhap {
    private static final Map<String, String> userDatabase = new HashMap<>();

    // Hàm khởi tạo mẫu dữ liệu người dùng, có thể thay bằng kết nối cơ sở dữ liệu thực tế
    static {
        userDatabase.put("user1@gmail.com", "password1");
        userDatabase.put("user2@gmail.com", "password2");
    }

    public static boolean login(String emailAddress, String password) {
        if (!isValidEmail(emailAddress)) {
            return false;
        }

        String storedPassword = userDatabase.get(emailAddress);
        if (storedPassword == null) {
            return false;
        }

        return storedPassword.equals(password);
    }

    private static boolean isValidEmail(String email) {
        String regexPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regexPattern);
    }
}
