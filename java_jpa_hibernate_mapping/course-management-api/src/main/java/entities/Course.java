package entities;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String code;
}
