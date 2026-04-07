package entities;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String street;
    private String address;
    private String number;
    private String neighboorhood;
    private String city;
    private String state;
    private String zipCode;
}
