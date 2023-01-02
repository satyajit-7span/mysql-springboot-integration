package inheritance.mapping.mapper;

import inheritance.mapping.dto.request.ProgrammerRequestDTO;
import inheritance.mapping.dto.response.ProgrammerResponseDTO;
import inheritance.mapping.entity.Programmer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProgrammerMapper {

    ProgrammerRequestDTO toProgrammerDto(Programmer programmer);

    Programmer toProgrammerEntity(ProgrammerRequestDTO programmerRequestDTO);

    ProgrammerResponseDTO toProgrammerResponseDto(Programmer programmer);
}
