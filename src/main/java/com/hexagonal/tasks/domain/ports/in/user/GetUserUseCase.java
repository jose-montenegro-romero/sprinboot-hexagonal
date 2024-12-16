package com.hexagonal.tasks.domain.ports.in.user;

import com.hexagonal.tasks.domain.model.user.User;

import java.util.Optional;
import java.util.UUID;

public interface GetUserUseCase {
    Optional<User> getUserById(UUID userId);
}
