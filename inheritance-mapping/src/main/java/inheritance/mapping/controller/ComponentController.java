package inheritance.mapping.controller;

import inheritance.mapping.dto.request.CreditCardRequestDTO;
import inheritance.mapping.dto.request.EmployeeRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.entity.Employee;
import inheritance.mapping.mapper.PaymentMapper;
import inheritance.mapping.service.EmployeeService;
import inheritance.mapping.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/component")
@Slf4j
public class ComponentController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PaymentMapper paymentMapper;

    @PostMapping
    public ResponseEntity<BaseResponse> saveEmployee(@Valid @RequestBody EmployeeRequestDTO employeeRequestDTO) {
        log.info("save() method called from controller :");

        BaseResponse baseResponse = employeeService.save(employeeRequestDTO);
        return new ResponseEntity<>(baseResponse, HttpStatus.CREATED);
    }
}
