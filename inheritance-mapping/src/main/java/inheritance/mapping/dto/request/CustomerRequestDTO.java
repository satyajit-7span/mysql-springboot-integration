package inheritance.mapping.dto.request;

import inheritance.mapping.entity.PhoneNumber;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerRequestDTO {

    private String name;
    private Set<PhoneNumber> phoneNumber;
}
