import java.util.Objects;

public class Author implements Comparable<Author> {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public int compareTo(Author other) {
        int cmp = this.name.compareTo(other.name);
        if (cmp == 0) {
            return this.surname.compareTo(other.surname);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author a = (Author) o;
        return name.equals(a.name) && surname.equals(a.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
