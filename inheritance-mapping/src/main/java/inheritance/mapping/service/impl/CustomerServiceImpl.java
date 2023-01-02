package inheritance.mapping.service.impl;

import inheritance.mapping.dto.request.CustomerRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.entity.Customer;
import inheritance.mapping.entity.PhoneNumber;
import inheritance.mapping.mapper.PaymentMapper;
import inheritance.mapping.repository.CustomerRepository;
import inheritance.mapping.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Autowired
    private CustomerRepository customerRepository;

    BaseResponse response = new BaseResponse();

    @Override
    public BaseResponse save(CustomerRequestDTO customerRequestDTO) {
        log.info("save() method called from service :");

        Customer customer = paymentMapper.toCustomerEntity(customerRequestDTO);
        Set<PhoneNumber> phoneNumber = customerRequestDTO.getPhoneNumber();
        customer.setPhoneNumber(phoneNumber);
        customerRepository.save(customer);

        response.setResultMessage("Customer saved successfully");

        return response;
    }

    @Override
    public BaseResponse findAll() {
        log.info("findAll() method called from service :");
        List<Customer> productList = (List<Customer>) customerRepository.findAll();

        if(CollectionUtils.isEmpty(productList)) {
            response.setResultMessage("Customer not found");
        } else {
            response.setResultMessage(null);
            response.setData(productList);
        }

        return response;
    }
}
