package inheritance.mapping.dto.request;

import inheritance.mapping.entity.Address;
import lombok.Data;

@Data
public class EmployeeRequestDTO {

    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private Address address;
}
