package com.example.assignment3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String commit;
    @ManyToOne
    private User user;
    @ManyToOne

    private Product product;
}
