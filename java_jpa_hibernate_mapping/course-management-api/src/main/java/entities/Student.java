package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String fullName;
    private String registration;
    private Date birthDate;
    private String email;
}
