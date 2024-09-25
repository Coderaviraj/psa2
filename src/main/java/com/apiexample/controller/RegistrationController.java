package com.apiexample.controller;


import com.apiexample.payload.RegistrationDto;
import com.apiexample.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }


    //http://localhost:8080/api/v1/registration


    @PostMapping
    public ResponseEntity<?> addRegistartion(@Valid @RequestBody RegistrationDto registrationDto, BindingResult result)
    {
        if (result.hasErrors()) {
            return new ResponseEntity<>(result.getFieldError().getDefaultMessage(), HttpStatus.CREATED);
        }
        RegistrationDto regDto = registrationService.createRegistration(registrationDto);
        return new ResponseEntity<>(regDto, HttpStatus.CREATED);
    }

   // http://localhost:8080/api/v1/registration?id=


    @DeleteMapping
    public ResponseEntity<String> deleteRegistrationById(@RequestParam
                                                         long id)
    {
        registrationService.deleteRegistrationById(id);
        return new ResponseEntity<>("Registration of  " +id+ "  Deleted Successfully" , HttpStatus.OK);

    }

    // http://localhost:8080/api/v1/registration?id=
    @PutMapping
    public ResponseEntity<RegistrationDto> updateRegistration(@RequestParam long id
            , @RequestBody RegistrationDto registrationDto)
    {
        RegistrationDto updatedDto = registrationService.updateRegistration(id, registrationDto);
        return new ResponseEntity<>(updatedDto, HttpStatus.OK);

    }

    // http://localhost:8080/api/v1/registration?pageNo=0&pageSize=5&sortBy=email&sortOrder=ASCENDING
    @GetMapping
    public ResponseEntity<List<RegistrationDto>> getAllRegistrations(
            @RequestParam(name="pageNo",defaultValue ="0",required = false)int pageNo,
            @RequestParam(name="pageSize",defaultValue ="5",required = false)int pageSize,
            @RequestParam(name="sortBy",defaultValue="name",required = false)String sortBy,
            @RequestParam(name="sortDir",defaultValue="ASC",required = false)String sortDir
    ){
        List<RegistrationDto> dtos = registrationService.getAllregistartions(pageNo, pageSize, sortBy , sortDir);
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }


    @GetMapping("/byid")
    public ResponseEntity<RegistrationDto> getRegistrationById(
        @RequestParam long id
    ){
        RegistrationDto regDto = registrationService.getRegistrationById(id);
        return new ResponseEntity<>(regDto, HttpStatus.OK);

}




}
