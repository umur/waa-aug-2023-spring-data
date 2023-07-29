package miu.waa.lab3.dto;

import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import miu.waa.lab3.entity.Product;

import java.util.List;

@Getter
@Setter
public class CategoryDto {
    private int id;
    private String name;
}
