package inheritance.mapping.service;

import inheritance.mapping.dto.request.EmployeeRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;

public interface EmployeeService {
    BaseResponse save(EmployeeRequestDTO employeeRequestDTO);
}
