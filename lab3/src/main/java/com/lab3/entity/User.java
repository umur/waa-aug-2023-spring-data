package com.lab3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    private int id;

    private String email;
    private String password;
    private String firstName;
    private String lastname;

}
