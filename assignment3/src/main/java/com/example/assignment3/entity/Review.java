package com.example.assignment3.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
    @JsonIgnore
    User user;

    @ManyToOne
    @JsonIgnore
    Product product;
}
