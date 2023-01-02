package inheritance.mapping.dto.request;

import inheritance.mapping.entity.Person;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LicenseRequestDTO {

    private String type;
    private LocalDate validFrom;
    private LocalDate validTo;

    private Person person;
}
