package edu.miu.cs545.assignment03.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String name;
    private double price;
    private CategoryDto category;

    public ProductDto() {
    }

    public ProductDto(String name, double price, CategoryDto categoryDto) {
        this.name = name;
        this.price = price;
        this.category = categoryDto;
    }
}
