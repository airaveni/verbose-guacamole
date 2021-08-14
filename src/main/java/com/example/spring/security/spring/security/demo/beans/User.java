package com.example.spring.security.spring.security.demo.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private Long id;
    private String name;
    private String role;
    private String password;


}
