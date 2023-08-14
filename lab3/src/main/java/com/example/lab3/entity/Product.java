package com.example.lab3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private int id;

    private String name;
    private int price ;
    private int rating;

@JsonIgnore
    @ManyToOne
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<Review>reviews;
}
