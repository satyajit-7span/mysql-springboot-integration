package inheritance.mapping.mapper;

import inheritance.mapping.dto.request.CreditCardRequestDTO;
import inheritance.mapping.dto.request.CustomerRequestDTO;
import inheritance.mapping.dto.request.EmployeeRequestDTO;
import inheritance.mapping.entity.CreditCard;
import inheritance.mapping.entity.Customer;
import inheritance.mapping.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    CreditCardRequestDTO toCreditCardDto(CreditCard creditCard);

    CreditCard toCreditCard(CreditCardRequestDTO creditCardRequestDTO);

    EmployeeRequestDTO toEmployeeDto(Employee employee);

    Employee toEmployeeEntity(EmployeeRequestDTO employeeRequestDTO);

    CustomerRequestDTO toCustomerDto(Customer customer);

    Customer toCustomerEntity(CustomerRequestDTO customerRequestDTO);
}
