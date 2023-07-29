package com.example.assignment3.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    @MapsId("product_id")
    private Product product;

    @ManyToOne
    @JoinColumn
    @MapsId("user_id")
    private User user;

    public Review() {
    }
}
