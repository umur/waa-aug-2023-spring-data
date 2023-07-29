package lab3.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ReviewDto {

    private int id;
    private String comment;
    private MainUserDto user;


    private ProductDto product;

}
