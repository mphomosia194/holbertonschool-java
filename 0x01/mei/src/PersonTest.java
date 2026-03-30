import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;

public class PersonTest {

    static Person person;

    @BeforeAll
    public static void setup() {
        person = new Person();

        person.setName("Paul");
        person.setSurname("McCartney");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2000);
        person.setBirthDate(cal.getTime());

        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        person.setSalary(1000);
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);

        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        person.setSalary(20000);
        person.setAnotherCompanyOwner(true);

        assertFalse(person.isMEI());
    }
}
