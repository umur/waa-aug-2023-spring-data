package edu.miu.cs545.assignment03.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id@GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @OneToOne(mappedBy = "user")
    private Address address;


    public User() {
    }

    public User(String email, String password, String firstName, String lastname) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastname = lastname;
    }
}
