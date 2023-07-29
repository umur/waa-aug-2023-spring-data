package com.example.Lab3.entity.test;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class ReviewTest {

    @Id
    private int id;

    private String comment;


    @ManyToOne
    private ProductTest productTest;

}
