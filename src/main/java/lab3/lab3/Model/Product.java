package lab3.lab3.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Product {

@Id
@GeneratedValue
    private int id;
    private String name;
    private double price;
    private String rating;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    @OneToMany(mappedBy = "product" , cascade = CascadeType.PERSIST)
    private List<Review> reviewList;


}
