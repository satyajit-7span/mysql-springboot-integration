package inheritance.mapping.service.impl;

import inheritance.mapping.dto.request.ProgrammerRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.dto.response.ProgrammerResponseDTO;
import inheritance.mapping.entity.License;
import inheritance.mapping.entity.Programmer;
import inheritance.mapping.entity.Project;
import inheritance.mapping.mapper.ProgrammerMapper;
import inheritance.mapping.repository.ProgrammerRepository;
import inheritance.mapping.service.ProgrammerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class ProgrammerServiceImpl implements ProgrammerService {

    @Autowired
    private ProgrammerRepository programmerRepository;

    @Autowired
    private ProgrammerMapper programmerMapper;

    @Autowired
    private EntityManager em;

    BaseResponse response = new BaseResponse();

    @Override
    public BaseResponse save(ProgrammerRequestDTO programmerRequestDTO) {
        log.info("save() method called from service :");

        Programmer programmer = programmerMapper.toProgrammerEntity(programmerRequestDTO);
        Set<Project> projectSet = programmerRequestDTO.getProjects();
        programmer.setProject(projectSet);
        programmerRepository.save(programmer);

        response.setResultMessage("Programmer saved successfully");
        return response;
    }

    @Override
    public BaseResponse findById(int id) {
        log.info("findById() method called from service layer...!!");

        ProgrammerResponseDTO programmerResponseDTO = programmerMapper.toProgrammerResponseDto(programmerRepository.findById(id).isPresent() ? programmerRepository.findById(id).get() : null);

        if(programmerResponseDTO == null) {
            response.setResultMessage("Programmer not found...!!");
        } else {
            response.setResultMessage(null);
            response.setData(programmerResponseDTO);
        }

        return response;
    }

    @Override
    public BaseResponse deleteProgrammer(int id) {
        programmerRepository.deleteProgrammer(id);
        response.setResultMessage("Student deleted successfully");

        return response;
    }

    public List test() {
        return em.createNamedStoredProcedureQuery("testProcedure").getResultList();
    }
}
