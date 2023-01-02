package inheritance.mapping.controller;

import inheritance.mapping.dto.request.CreditCardRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.entity.CreditCard;
import inheritance.mapping.entity.Payment;
import inheritance.mapping.mapper.PaymentMapper;
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
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PaymentMapper paymentMapper;

    @PostMapping
    public ResponseEntity<BaseResponse> save(@Valid @RequestBody CreditCardRequestDTO creditCardRequestDTO) {
        log.info("save() method called from controller :");

        BaseResponse baseResponse = paymentService.save(creditCardRequestDTO);
        return new ResponseEntity<>(baseResponse, HttpStatus.CREATED);
    }
}
