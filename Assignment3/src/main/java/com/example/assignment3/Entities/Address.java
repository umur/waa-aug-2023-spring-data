package com.example.assignment3.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private int zip;
    private String city;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
