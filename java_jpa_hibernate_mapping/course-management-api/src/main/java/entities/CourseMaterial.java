package entities;

import javax.persistence.*;

@Entity
public class CourseMaterial {

    @Id
    @GeneratedValue
    private Long id;

    private String url;
}
