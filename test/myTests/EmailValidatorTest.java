package myTests;

import org.junit.jupiter.api.Test;
import com.EmailValidator;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {

    EmailValidator validator = new EmailValidator();

    @Test
    void isValidEmail() {
        assertTrue(validator.isValidEmail("test@mail.com"));
    }

    @Test
    void testNull () {
        assertFalse(validator.isValidEmail(null));
    }

    @Test
    void testBlank () {
        assertFalse(validator.isValidEmail(""));
        assertFalse(validator.isValidEmail(" "));
    }

    @Test
    void testAt () {
        assertFalse(validator.isValidEmail("test.mail.com"));
    }

    @Test
    void testDotAfterAt() {
        assertFalse(validator.isValidEmail("test.test@mail"));
    }

    @Test
    void testDotRightAfterAt () {
        assertFalse(validator.isValidEmail("test@.com"));
    }

    @Test
    void testStartWithAt () {
        assertFalse(validator.isValidEmail("@mail.com"));
    }

    @Test
    void testStartWithDot() {
        assertFalse(validator.isValidEmail(".test@mail.com"));
    }

    @Test
    void testEndWithAt () {
        assertFalse(validator.isValidEmail("test@"));
    }

    @Test
    void testEndWithDot () {
        assertFalse(validator.isValidEmail("test@mail."));
    }
}