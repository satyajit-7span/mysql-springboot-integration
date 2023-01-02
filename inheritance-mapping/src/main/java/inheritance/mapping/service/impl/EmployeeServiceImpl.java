package inheritance.mapping.service.impl;

import inheritance.mapping.dto.request.EmployeeRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.entity.Employee;
import inheritance.mapping.mapper.PaymentMapper;
import inheritance.mapping.repository.EmployeeRepository;
import inheritance.mapping.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PaymentMapper paymentMapper;

    BaseResponse response = new BaseResponse();

    @Override
    public BaseResponse save(EmployeeRequestDTO employeeRequestDTO) {
        log.info("save() method called from service :");

        Employee employee = paymentMapper.toEmployeeEntity(employeeRequestDTO);
        employeeRepository.save(employee);

        response.setResultMessage("Employee saved successfully");

        return response;
    }
}
