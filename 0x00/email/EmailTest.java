public class EmailTest {

    public static boolean test_email_with_at_symbol() {
        return Person.emailValid("email_test@domain.com") == true;
    }

    public static boolean test_email_without_at_symbol() {
        return Person.emailValid("email_testdomain.com") == false;
    }

    public static boolean test_email_over_50_characters() {
        return Person.emailValid("email_test_very_long_should_not_be_valid@domain.com") == false;
    }
}
