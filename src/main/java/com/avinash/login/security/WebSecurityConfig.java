package com.avinash.login.security;

import com.avinash.login.security.services.UserDetailsSeerviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@Configuration
@EnableMethodSecurity
public class WebSecurityConfig {

    @Autowired
    UserDetailsSeerviceImpl userDetailsSeervice;

}
