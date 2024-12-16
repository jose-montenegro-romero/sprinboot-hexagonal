package com.hexagonal.tasks.infrastructure.config.user;

import com.hexagonal.tasks.application.services.user.UserService;
import com.hexagonal.tasks.application.usecases.user.GetUserUseCaseImpl;
import com.hexagonal.tasks.domain.ports.out.user.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort){
        return new UserService(
                new GetUserUseCaseImpl(userRepositoryPort)
        );
    }
}
