package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Phone> phones = new ArrayList<>();

    @ManyToMany
    private List<Course> courses = new ArrayList<>();

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Address> getAddresses() { return addresses; }
    public List<Phone> getPhones() { return phones; }
    public List<Course> getCourses() { return courses; }
}
