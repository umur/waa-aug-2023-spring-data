package com.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {
    @Id
    private int id;

    private String street;
    private String city;
    private long zip;

    @OneToOne(mappedBy = "address")
    private User user;

};
