package inheritance.mapping.mapper;

import inheritance.mapping.dto.request.LicenseRequestDTO;
import inheritance.mapping.entity.License;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LicenseMapper {

    LicenseRequestDTO toLicenseRequestDto(License license);

    License toLicenseEntity(LicenseRequestDTO licenseRequestDTO);
}
