package com.example.Lab3.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int rating;
    @JsonManagedReference
    @ManyToOne
    private Category category;
    @JsonManagedReference
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

}
