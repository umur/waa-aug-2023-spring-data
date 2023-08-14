package com.example.lab3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {

   @Id
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//@Column(name ="em",unique = true,updatable = false)
    private String email;
    private String password;
    private String firstName;
    private String lastname;

 @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Review> review;
 @JsonIgnore
    @OneToOne
    private Address address;

}
