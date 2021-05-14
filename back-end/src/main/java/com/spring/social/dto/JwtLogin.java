package com.spring.social.dto;

import lombok.Data;

@Data
public class JwtLogin {

    private String email;

    private String password;
}
