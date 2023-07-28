package lab3.springdata.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private long id;
    private String name;
    private double price;
    private String rating ;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;



}
