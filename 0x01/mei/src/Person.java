import java.util.Date;
import java.util.Calendar;

public class Person {

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public String fullName() {
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    private int getAge() {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        return age;
    }

    public boolean isMEI() {
        return (calculateYearlySalary() < 130000) &&
               (getAge() > 18) &&
               !anotherCompanyOwner &&
               !pensioner &&
               !publicServer;
    }

    // Setters for test usage
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
    public void setAnotherCompanyOwner(boolean value) { this.anotherCompanyOwner = value; }
    public void setPensioner(boolean value) { this.pensioner = value; }
    public void setPublicServer(boolean value) { this.publicServer = value; }
}
