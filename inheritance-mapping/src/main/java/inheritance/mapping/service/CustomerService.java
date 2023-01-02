package inheritance.mapping.service;

import inheritance.mapping.dto.request.CustomerRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;

public interface CustomerService {

    BaseResponse save(CustomerRequestDTO customerRequestDTO);

    BaseResponse findAll();
}
