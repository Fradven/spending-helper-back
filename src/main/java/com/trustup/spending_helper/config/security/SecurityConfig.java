package com.trustup.spending_helper.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/hello").permitAll() // Allow public access to /api/hello
                        .anyRequest().authenticated() // Secure everything else
                )
                .csrf(csrf -> csrf.disable()) // Disable CSRF for testing
                .formLogin(login -> login.disable()) // Disable login redirect
                .httpBasic(httpBasic -> httpBasic.disable()); // Disable basic auth

        return http.build();
    }
}
