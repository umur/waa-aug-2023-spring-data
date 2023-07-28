package com.example.assignment3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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


    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<Review> reviews;
}
