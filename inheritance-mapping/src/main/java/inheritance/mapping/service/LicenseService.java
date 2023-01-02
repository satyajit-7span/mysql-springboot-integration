package inheritance.mapping.service;

import inheritance.mapping.dto.request.LicenseRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;

public interface LicenseService {
    BaseResponse save(LicenseRequestDTO licenseRequestDTO);

    BaseResponse findAll();

    BaseResponse getData();

    BaseResponse getAllData();
}
