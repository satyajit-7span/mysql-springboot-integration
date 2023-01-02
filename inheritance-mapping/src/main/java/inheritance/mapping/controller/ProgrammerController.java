package inheritance.mapping.controller;

import inheritance.mapping.dto.request.CustomerRequestDTO;
import inheritance.mapping.dto.request.ProgrammerRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.service.ProgrammerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/programmer")
@Slf4j
public class ProgrammerController {

    @Autowired
    private ProgrammerService programmerService;

    @PostMapping
    public ResponseEntity<BaseResponse> save(@Valid @RequestBody ProgrammerRequestDTO programmerRequestDTO) {
        log.info("save() method called from controller :");

        BaseResponse baseResponse = programmerService.save(programmerRequestDTO);
        return new ResponseEntity<>(baseResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public BaseResponse findById(@PathVariable int id) {
        log.info("findById() method called from controller layer...!!");
        return programmerService.findById(id);
    }
}
