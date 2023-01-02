package inheritance.mapping.service.impl;

import inheritance.mapping.dto.request.LicenseRequestDTO;
import inheritance.mapping.dto.response.BaseResponse;
import inheritance.mapping.entity.License;
import inheritance.mapping.mapper.LicenseMapper;
import inheritance.mapping.repository.CustomRepository;
import inheritance.mapping.repository.LicenseRepository;
import inheritance.mapping.service.LicenseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
@Slf4j
public class LicenseServiceImpl implements LicenseService {

    @Autowired
    private LicenseMapper licenseMapper;

    @Autowired
    private CustomRepository customRepository;

    @Autowired
    private LicenseRepository licenseRepository;

    BaseResponse response = new BaseResponse();

    EntityManager manager;

    @Override
    public BaseResponse save(LicenseRequestDTO licenseRequestDTO) {
        log.info("save() method called from service :");

        License license = licenseMapper.toLicenseEntity(licenseRequestDTO);
        licenseRepository.save(license);
        response.setResultMessage("License saved successfully");
        response.setData(null);

        return response;
    }

    @Override
    public BaseResponse findAll() {

        log.info("findAll() method called from service :");
        List<License> licenseList = (List<License>) licenseRepository.findAll();

        if(CollectionUtils.isEmpty(licenseList)) {
            response.setResultMessage("Customer not found");
        } else {
            response.setResultMessage(null);
            response.setData(licenseList);
        }

        return response;
    }

    @Override
    public BaseResponse getData() {
        return null;
    }

    @Override
    public BaseResponse getAllData() {
        log.info("findAll() method called from service :");
        List<License> licenseList = (List<License>) licenseRepository.getAllData();

        if(CollectionUtils.isEmpty(licenseList)) {
            response.setResultMessage("Customer not found");
        } else {
            response.setResultMessage(null);
            response.setData(licenseList);
        }

        return response;
    }
}
