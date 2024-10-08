package com.stella.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String age;
    private String address;
    private String gender;

}
