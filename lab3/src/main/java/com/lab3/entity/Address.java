package com.lab3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToOne(mappedBy = "address")
    private User user;

};
