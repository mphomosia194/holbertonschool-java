import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    public void test_email_with_at_symbol() {
        assertTrue(Person.isEmailValid("email_test@domain.com"));
    }

    @Test
    public void test_email_without_at_symbol() {
        assertFalse(Person.isEmailValid("email_testdomain.com"));
    }

    @Test
    public void test_email_over_50_characters() {
        assertEquals(false, Person.isEmailValid("email_test_very_long_should_not_be_valid@domain.com"));
    }
}
