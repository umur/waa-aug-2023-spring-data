package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;
}
