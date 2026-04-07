package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Teacher teacher;

    @ManyToMany
    private List<Student> students = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private CourseMaterial material;

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public void setTeacher(Teacher teacher) { this.teacher = teacher; }
    public List<Student> getStudents() { return students; }

    public void setMaterial(CourseMaterial material) { this.material = material; }
}
