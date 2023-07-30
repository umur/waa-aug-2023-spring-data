package com.example.assignment3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import com.example.assignment3.entity.Review;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;
    @OneToOne
    private Address address;
}
