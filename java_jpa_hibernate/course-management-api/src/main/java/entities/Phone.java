package entities;

import javax.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private Long id;

    private String areaCode;
    private String number;

    public Long getId() { return id; }
}
