package com.example.assignment3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    int id;

    String comment;

    @ManyToOne
    @JsonBackReference
    User user;

    @ManyToOne
    @JsonBackReference
    Product product;
}
