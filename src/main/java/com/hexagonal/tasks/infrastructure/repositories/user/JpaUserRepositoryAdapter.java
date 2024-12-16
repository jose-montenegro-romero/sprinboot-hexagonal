package com.hexagonal.tasks.infrastructure.repositories.user;

import com.hexagonal.tasks.domain.model.user.User;
import com.hexagonal.tasks.domain.ports.out.user.UserRepositoryPort;
import com.hexagonal.tasks.infrastructure.entities.user.UserEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final JpaUserRepository jpaUserRepository;

    public JpaUserRepositoryAdapter(JpaUserRepository jpaUserRepository){
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public Optional<User> findById(UUID id) {
        return jpaUserRepository.findById(id).map(UserEntity::toDomainModel);
    }
}
