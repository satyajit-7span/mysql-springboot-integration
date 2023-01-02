package inheritance.mapping.controller;

import inheritance.mapping.dto.request.LicenseRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.mapper.LicenseMapper;
import inheritance.mapping.service.LicenseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/license")
@Slf4j
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    @Autowired
    private LicenseMapper licenseMapper;

    @PostMapping
    public ResponseEntity<BaseResponse> save(@Valid @RequestBody LicenseRequestDTO licenseRequestDTO) {
        log.info("save() method called from controller :");

        BaseResponse baseResponse = licenseService.save(licenseRequestDTO);
        return new ResponseEntity<>(baseResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public BaseResponse findAll() {
        log.info("findAll() method called from controller layer...!!");
        return licenseService.findAll();
    }

    @GetMapping("/get-data")
    public BaseResponse getData() {
        log.info("getData() method called from controller layer...!!");
        return licenseService.getData();
    }

    @GetMapping("/get-all-data")
    public BaseResponse getAllData() {
        log.info("getAllData() method called from controller layer...!!");
        return licenseService.getData();
    }
}
