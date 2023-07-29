package lab3.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class AddressDto {

    private int id;
    private String street;
    private String zip;
    private String city;


    private MainUserDto mainUser;

}
