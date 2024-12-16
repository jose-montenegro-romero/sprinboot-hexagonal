package com.hexagonal.tasks.application.services.user;

import com.hexagonal.tasks.domain.model.user.User;
import com.hexagonal.tasks.domain.ports.in.user.GetUserUseCase;

import java.util.Optional;
import java.util.UUID;

public class UserService implements GetUserUseCase {

    private final GetUserUseCase getUserUseCase;

    public UserService(GetUserUseCase getUserUseCase){
        this.getUserUseCase = getUserUseCase;
    }

    @Override
    public Optional<User> getUserById(UUID userId) {
        return getUserUseCase.getUserById(userId);
    }
}
