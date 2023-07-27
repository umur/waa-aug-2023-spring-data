package edu.miu.cs545.assignment03.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id@GeneratedValue
    private Long id;
    private String name;
    private double price;

    @ManyToOne()
//    @Fetch(FetchMode.JOIN)
    private Category category;

    @OneToMany(mappedBy = "product")
    List<Review> reviews;

    public Product() {
    }

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
       // this.category.addProduct(this);
    }
}
