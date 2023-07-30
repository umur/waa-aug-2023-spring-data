package com.example.assignment3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private int rating;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

    @ManyToOne
    private Category category;
}
