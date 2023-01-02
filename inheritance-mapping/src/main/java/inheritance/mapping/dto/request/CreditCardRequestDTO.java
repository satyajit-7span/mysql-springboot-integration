package inheritance.mapping.dto.request;

import lombok.Data;

@Data
public class CreditCardRequestDTO {

    private double amount;
    private String cardNumber;
}
