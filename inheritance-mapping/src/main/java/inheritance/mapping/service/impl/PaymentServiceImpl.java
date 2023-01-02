package inheritance.mapping.service.impl;

import inheritance.mapping.dto.request.CreditCardRequestDTO;
import inheritance.mapping.dto.request.EmployeeRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.entity.Address;
import inheritance.mapping.entity.CreditCard;
import inheritance.mapping.entity.Employee;
import inheritance.mapping.mapper.PaymentMapper;
import inheritance.mapping.repository.PaymentRepository;
import inheritance.mapping.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private PaymentMapper paymentMapper;

    BaseResponse response = new BaseResponse();

    @Override
    public BaseResponse save(CreditCardRequestDTO creditCardRequestDTO) {
        log.info("save() method called from service :");

        CreditCard cc = paymentMapper.toCreditCard(creditCardRequestDTO);
        paymentRepository.save(cc);

        response.setResultMessage("Student saved successfully");

        return response;
    }
}
