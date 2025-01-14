package com.apiexample.service;

import com.apiexample.payload.RegistrationDto;

import java.util.List;

public interface RegistrationService {

    public RegistrationDto createRegistration(RegistrationDto registrationDto);

    void deleteRegistrationById(long id);

    RegistrationDto updateRegistration(long id, RegistrationDto registrationDto);

    List<RegistrationDto> getAllregistartions(int pageNo, int pageSize, String sortBy, String sortOrder);

    RegistrationDto getRegistrationById(long id);
}
