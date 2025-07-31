package com.nullifidianz.java_auth.mapper;

import org.springframework.stereotype.Component;

import com.nullifidianz.java_auth.dto.UserRequest;
import com.nullifidianz.java_auth.dto.UserResponse;
import com.nullifidianz.java_auth.dto.UserUpdateRequest;
import com.nullifidianz.java_auth.entity.User;

@Component
public class UserMapper {
    public User toEntity(UserRequest request) {
        User user = new User();
        user.setNome(request.getNome());
        user.setEmail(request.getEmail());
        user.setSenha(request.getSenha());
        return user;
    }

    public UserResponse toResponse(User user) {
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setNome(user.getNome());
        response.setEmail(user.getEmail());
        return response;
    }

    public void updateMapper(UserUpdateRequest request, User user) {
        if (request.getNome() != null) {
            user.setNome(request.getNome());
        }
        if (request.getEmail() != null) {
            user.setEmail(request.getEmail());
        }

    }

}
