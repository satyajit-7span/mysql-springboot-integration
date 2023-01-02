package inheritance.mapping.service;

import inheritance.mapping.dto.request.CreditCardRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;

public interface PaymentService {

    BaseResponse save(CreditCardRequestDTO creditCardRequestDTO);
}
