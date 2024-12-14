package com.hexagonal.tasks.domain.ports.in.user;

import com.hexagonal.tasks.domain.model.user.User;

public interface GetUserUseCase {
    User getUser(Long userId);
}
