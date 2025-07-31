package com.nullifidianz.java_auth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nullifidianz.java_auth.dto.UserRequest;
import com.nullifidianz.java_auth.dto.UserResponse;
import com.nullifidianz.java_auth.dto.UserUpdateRequest;
import com.nullifidianz.java_auth.entity.User;
import com.nullifidianz.java_auth.mapper.UserMapper;
import com.nullifidianz.java_auth.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse createUser(UserRequest request) {
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado");
        }
        User user = userMapper.toEntity(request);
        return userMapper.toResponse(userRepository.save(user));
    }

    public List<UserResponse> getAll() {
        return userRepository.findAll().stream().map(userMapper::toResponse).toList();
    }

    public UserResponse getById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return userMapper.toResponse(user);
    }

    public UserResponse update(UserUpdateRequest request, Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        userMapper.updateMapper(request, user);
        return userMapper.toResponse(userRepository.save(user));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}
