package com.example.spring.security.spring.security.demo.service;

import com.example.spring.security.spring.security.demo.beans.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomerUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = User.builder()
                .id(1L)
                .name("Shabbir")
                .role("ADMIN")
                .password("$2a$12$hudhq.ah4PAM4nCY2jfazOX.7X4ClW3.L0Y1xKSEPPCcoIwm1PSCO")
                .build();

        return new CustomUserDetails(user);
    }
}
