package com.hexagonal.tasks.domain.ports.out.user;

import com.hexagonal.tasks.domain.model.user.User;

import java.util.Optional;

public interface UserRepositoryPort {
    Optional<User> findById(Long id);
}
