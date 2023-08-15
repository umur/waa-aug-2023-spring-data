package com.example.assignment3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    int id;

    String firstName;
    String lastName;
    String email;
    String password;


    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL)
    @JsonBackReference
    List<Review> reviews;


}
