package waa.lab3.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
public class CategoryDto{
    private int categoryId;
    private String name;

}
