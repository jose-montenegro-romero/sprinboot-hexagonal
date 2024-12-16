package com.hexagonal.tasks.infrastructure.repositories.user;

import com.hexagonal.tasks.infrastructure.entities.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, UUID> {
}
