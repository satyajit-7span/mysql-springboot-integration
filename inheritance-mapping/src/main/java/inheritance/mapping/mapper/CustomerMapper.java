package inheritance.mapping.mapper;

import inheritance.mapping.dto.request.CustomerRequestDTO;
import inheritance.mapping.entity.Customer;

public interface CustomerMapper {

    CustomerRequestDTO toCustomerDto(Customer customer);

    Customer toCustomerEntity(CustomerRequestDTO customerRequestDTO);
}
