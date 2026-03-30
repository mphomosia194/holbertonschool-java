import java.io.Serializable;

public class Student implements Serializable {
    private int age;
    private String name;
    private transient String password;

    public Student(int age, String name, String password) {
        this.age = age;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Student { name='%s', age='%d', password='%s' }", name, age, password);
    }
}
