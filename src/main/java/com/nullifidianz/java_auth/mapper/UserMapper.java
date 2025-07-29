package com.nullifidianz.java_auth.mapper;

import org.springframework.stereotype.Component;

import com.nullifidianz.java_auth.dto.UserRequest;
import com.nullifidianz.java_auth.dto.UserResponse;
import com.nullifidianz.java_auth.dto.UserUpdateRequest;
import com.nullifidianz.java_auth.entity.User;

@Component
public class UserMapper {
    public User toEntity(UserRequest request) {
        // TODO: toEntity DTO
        return null;
    }

    public UserResponse toResponse(User user) {
        // TODO: toResponse DTO
        return null;
    }

    public UserUpdateRequest updateMapper(User user) {
        // TODO: updateMapper DTO
        return null;
    }

}
