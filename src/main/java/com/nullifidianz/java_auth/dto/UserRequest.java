package com.nullifidianz.java_auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String nome;
    private String email;
    private String senha;

}
