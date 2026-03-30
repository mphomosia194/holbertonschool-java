import java.util.*;

public class Person {
    private int code;
    private String name;
    private String position;
    private int age;
    private double salary;

    public Person(int code, String name, String position, int age, double salary) {
        this.code = code;
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return String.format(Locale.FRANCE, "[%d] %s %s %d $ %f", code, name, position, age, salary);
    }
}
