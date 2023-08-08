package com.myapp.myapp.dto;




import com.myapp.myapp.entity.Category;
import com.myapp.myapp.entity.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDto {
    private int id;
    private String name;
    private Double price;
    private Integer rating;
    private Category category;
    private List<Review> reviews;
}
