import java.io.*;
import java.util.*;

public class SerializeStudents<T> {
    private String fileName;

    public SerializeStudents(String fileName) {
        this.fileName = fileName;
    }

    public void serialize(List<T> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (Exception e) {
            System.out.println("Unable to serialize");
        }
    }

    public List<T> deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Unable to deserialize");
            return new ArrayList<>();
        }
    }
}
