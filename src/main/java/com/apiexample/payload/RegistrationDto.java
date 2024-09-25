package com.apiexample.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegistrationDto {

    private Long id;

    @NotNull
    @Size(min = 3, max =15,message = "Name should be not null and between 3 to 15 characters")
    private String name;

    @NotNull
    @Size(min = 5, max =50, message = "Email should be not null and between 5 to 50 characters")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull
    @Size(min = 10, max =10, message = "Mobile should be not null and 10 characters")
    private String mobile;

    private String message;

}