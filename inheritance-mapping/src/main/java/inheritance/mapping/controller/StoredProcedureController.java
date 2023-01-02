package inheritance.mapping.controller;

import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.service.ProgrammerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/programmer-stored-procedure")
@Slf4j
public class StoredProcedureController {

    @Autowired
    private ProgrammerService programmerService;

    @GetMapping
    public List test() {
        log.info("test() method called from controller layer...!!");
        return programmerService.test();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public BaseResponse deleteProgrammer(@PathVariable int id) {
        log.info("deleteStudent() method called from controller layer...!!");
        return programmerService.deleteProgrammer(id);
    }
}
