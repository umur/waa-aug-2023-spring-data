package miu.waa.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private int id;
    private String street;
    private int zip;
    private String city;

    @OneToOne(mappedBy = "address")
    private User user;
}
