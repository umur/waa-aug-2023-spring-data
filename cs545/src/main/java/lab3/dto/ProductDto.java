package lab3.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class ProductDto {

    private int id;
    private String name;
    private int price;
    private int rating;
    private CategoryDto category;


    private List<ReviewDto> reviewList;

}
