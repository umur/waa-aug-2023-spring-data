package lab3.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class MainUserDto {

    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;


    private List<ReviewDto> reviewList;

    private AddressDto address;
}
