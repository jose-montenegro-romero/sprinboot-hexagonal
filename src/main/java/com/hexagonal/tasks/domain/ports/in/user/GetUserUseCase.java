package com.hexagonal.tasks.domain.ports.in.user;

import com.hexagonal.tasks.domain.model.user.User;

import java.util.Optional;

public interface GetUserUseCase {
    Optional<User> getUserById(Long userId);
}
