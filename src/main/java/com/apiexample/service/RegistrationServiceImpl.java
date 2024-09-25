package com.apiexample.service;

import com.apiexample.entity.Registration;
import com.apiexample.exception.ResourceNotFound;
import com.apiexample.payload.RegistrationDto;
import com.apiexample.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    
    @Autowired
    private RegistrationRepository registrationRepository;

    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public RegistrationServiceImpl(){

    }

    @Override
    public RegistrationDto createRegistration(RegistrationDto registrationDto) {
        Registration registration = mapToEntity(registrationDto);
        Registration savedEntity = registrationRepository.save(registration);
        RegistrationDto dto = mapToDto(savedEntity);
        dto.setMessage("Registration saved");
        return dto;
    }

    @Override
    public void deleteRegistrationById(long id) {
        registrationRepository.deleteById(id);
    }

    @Override
    public RegistrationDto updateRegistration(long id, RegistrationDto registrationDto) {
        Optional<Registration> opReg = registrationRepository.findById(id);
        Registration registration = opReg.get();
        registration.setName(registrationDto.getName());
        registration.setEmail(registrationDto.getEmail());
        registration.setMobile(registrationDto.getMobile());
        Registration updatedEntity = registrationRepository.save(registration);
        RegistrationDto updatedDto = mapToDto(updatedEntity);
        updatedDto.setMessage("Registration updated");
        return updatedDto;
    }




    Registration mapToEntity(RegistrationDto dto){
        Registration entity = new Registration();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setMobile(dto.getMobile());
        return entity;
    }

    RegistrationDto mapToDto(Registration registration){
        RegistrationDto dto = new RegistrationDto();
        dto.setId(registration.getId());
        dto.setName(registration.getName());
        dto.setEmail(registration.getEmail());
        dto.setMobile(registration.getMobile());
        return dto;
    }
    @Override
    public List<RegistrationDto> getAllregistartions(int pageNo, int pageSize, String sortBy, String sortDir) {
        // Create a Sort object based on the sort direction
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ?
                Sort.by(Sort.Direction.ASC, sortBy) :
                Sort.by(Sort.Direction.DESC, sortBy);

        // Pass the Sort object when creating the Pageable
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        // Retrieve paginated and sorted data
        Page<Registration> all = registrationRepository.findAll(pageable);
        List<Registration> registrations = all.getContent();

        // Convert the entity to DTO
        List<RegistrationDto> registrationDtos = registrations.stream()
                .map(r -> mapToDto(r))
                .collect(Collectors.toList());

        System.out.println(all.getTotalPages());
        System.out.println(all.isFirst());
        System.out.println(all.isLast());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getPageSize());

        return registrationDtos;
    }

    @Override
    public RegistrationDto getRegistrationById(long id) {


        Registration registration = registrationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFound("Could not find registration with id " + id)
        );

        RegistrationDto dto = mapToDto(registration);
        dto.setMessage("Registration found");

        return dto;
    }

}
