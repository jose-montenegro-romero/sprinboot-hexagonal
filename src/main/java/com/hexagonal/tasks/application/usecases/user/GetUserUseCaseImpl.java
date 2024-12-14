package com.hexagonal.tasks.application.usecases.user;

import com.hexagonal.tasks.domain.model.user.User;
import com.hexagonal.tasks.domain.ports.in.user.GetUserUseCase;
import com.hexagonal.tasks.domain.ports.out.user.UserRepositoryPort;

import java.util.Optional;

public class GetUserUseCaseImpl implements GetUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public GetUserUseCaseImpl(UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<User> getUserById(Long userId) {
        return userRepositoryPort.findById(userId);
    }
}
