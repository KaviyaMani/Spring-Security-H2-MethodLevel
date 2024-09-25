package com.nila.security_method_level.service;

import com.nila.security_method_level.entity.User;
import com.nila.security_method_level.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class InitializeDB {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            User admin = User.builder()
                    .userName("kaviya")
                    .password(passwordEncoder.encode("kaviya"))
                    .enabled(true)
                    .roles("ADMIN")
                    .build();
            userRepository.save(admin);
            User user1 = User.builder()
                    .userName("nila")
                    .password(passwordEncoder.encode("nila"))
                    .enabled(true)
                    .roles("USER")
                    .build();
            userRepository.save(user1);

        };
    }
}
