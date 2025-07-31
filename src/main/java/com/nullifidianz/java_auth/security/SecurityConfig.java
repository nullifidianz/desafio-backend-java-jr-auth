package com.nullifidianz.java_auth.security;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // @Bean
    // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    // http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(auth ->
    // auth.anyRequest().permitAll());
    // return http.build();
    // }

}
