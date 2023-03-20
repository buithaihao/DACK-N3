import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testDK {

    @Test
    public void testHoEmpty() {
        assertFalse(dang_ky.Ho(""));
    }

    @Test
    public void testHoNotNull() {
        assertTrue(dang_ky.Ho("Nguyen"));
    }

    @Test
    public void testTenEmpty() {
        assertFalse(dang_ky.Ten(""));
    }

    @Test
    public void testTenNotNull() {
        assertTrue(dang_ky.Ten("Van"));
    }

    @Test
    public void testPasswordEmpty() {
        assertFalse(dang_ky.password(""));
    }

    @Test
    public void testPasswordNotNull() {
        assertTrue(dang_ky.password("123456"));
    }

    @Test
    public void testConfirmPasswordEmpty() {
        assertFalse(dang_ky.ConfirmPassword("","123456"));
    }

    @Test
    public void testConfirmPasswordNotNull() {
        assertTrue(dang_ky.ConfirmPassword("123456", "123456"));
    }


    @Test
    public void testGmailInvalid() {
        assertFalse(dang_ky.Gmail("abc.com"));
    }

    @Test
    public void testGmailValid() {
        assertTrue(dang_ky.Gmail("abc@gmail.com"));
    }
}
