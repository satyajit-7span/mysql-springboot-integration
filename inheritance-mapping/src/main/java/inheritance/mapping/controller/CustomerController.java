package inheritance.mapping.controller;

import inheritance.mapping.dto.request.CustomerRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.entity.Customer;
import inheritance.mapping.mapper.PaymentMapper;
import inheritance.mapping.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    BaseResponse response = new BaseResponse();

    @PostMapping
    public ResponseEntity<BaseResponse> save(@Valid @RequestBody CustomerRequestDTO customerRequestDTO) {
        log.info("save() method called from controller :");

        BaseResponse baseResponse = customerService.save(customerRequestDTO);
        return new ResponseEntity<>(baseResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public BaseResponse findAll() {
        log.info("findAll() method called from controller layer...!!");
        return customerService.findAll();
    }
}
