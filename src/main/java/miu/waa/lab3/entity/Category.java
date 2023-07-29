package miu.waa.lab3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
