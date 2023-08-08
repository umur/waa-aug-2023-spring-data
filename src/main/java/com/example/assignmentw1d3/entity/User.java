package com.example.assignmentw1d3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

   @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Review> review;
    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_address")
    private Address address;

}
