package com.example.lab3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id
    private int  id;

    private String street;
    private int zip ;
    private String city;

   }
