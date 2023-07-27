package edu.miu.cs545.assignment03.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id@GeneratedValue
    private Long id;
    private String street;
    private int zip;
    private String city;
    @OneToOne
    private User user;


    public Address() {
    }

    public Address(String street, int zip, String city, User user) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.user = user;
    }
}
