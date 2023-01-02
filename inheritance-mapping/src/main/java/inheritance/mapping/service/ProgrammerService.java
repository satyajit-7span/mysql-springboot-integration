package inheritance.mapping.service;

import inheritance.mapping.dto.request.ProgrammerRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;

import java.util.List;

public interface ProgrammerService {

    BaseResponse save(ProgrammerRequestDTO programmerRequestDTO);

    BaseResponse findById(int id);

    BaseResponse deleteProgrammer(int id);

    List test();
}
