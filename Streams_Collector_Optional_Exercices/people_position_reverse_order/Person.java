import java.util.*;

public class Person implements Comparable<Person> {
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

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format(Locale.FRANCE, "[%d] %s %s %d $ %f", code, name, position, age, salary);
    }

    // 🔥 CRITICAL: sort by salary ASC, then code ASC
    @Override
    public int compareTo(Person other) {
        int cmp = Double.compare(this.salary, other.salary);
        if (cmp == 0) {
            return Integer.compare(this.code, other.code);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return code == p.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
