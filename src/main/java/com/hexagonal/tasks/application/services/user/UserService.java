package com.hexagonal.tasks.application.services.user;

import com.hexagonal.tasks.domain.model.user.User;
import com.hexagonal.tasks.domain.ports.in.user.GetUserUseCase;

import java.util.Optional;

public class UserService implements GetUserUseCase {

    private final GetUserUseCase getUserUseCase;

    public UserService(GetUserUseCase getUserUseCase){
        this.getUserUseCase = getUserUseCase;
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return getUserUseCase.getUserById(userId);
    }
}
