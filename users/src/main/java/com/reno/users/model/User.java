package com.reno.users.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class User {
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Max(100)
    @Min(18)
    private Integer age;

    @NotNull
    @Email
    private String email;
}
