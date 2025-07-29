package com.nullifidianz.java_auth.mapper;

import org.springframework.stereotype.Component;

import com.nullifidianz.java_auth.dto.UserRequest;

import com.nullifidianz.java_auth.entity.User;

@Component
public class UserMapper {
    public User toEntity(UserRequest request) {
        User user = new User();
        return user;
    }

}
