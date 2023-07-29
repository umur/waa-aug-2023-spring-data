package lab3.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class CategoryDto {

    private int id;
    private String name;


    private List<ProductDto> products;

}
