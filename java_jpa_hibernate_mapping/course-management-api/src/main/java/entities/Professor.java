package entities;

import javax.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue
    private Long id;

    private String fullName;
    private String registration;
    private String email;
}
