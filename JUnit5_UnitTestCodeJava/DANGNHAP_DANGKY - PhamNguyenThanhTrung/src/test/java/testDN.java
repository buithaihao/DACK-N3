import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertTrue;

public class testDN {
    @Test
    public void testInvalidEmail() {
        assertFalse(dangnhap.login("abc.com", "password"));
    }

    @Test
    public void testUnknownUser() {
        assertFalse(dangnhap.login("unknown@gmail.com", "password"));
    }

    @Test
    public void testWrongPassword() {
        assertFalse(dangnhap.login("user1@gmail.com", "wrongPassword"));
    }

    @Test
    public void testCorrectCredentials() {
        assertTrue(dangnhap.login("user1@gmail.com", "password1"));
    }
}

