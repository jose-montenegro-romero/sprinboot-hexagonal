package com.hexagonal.tasks.infrastructure.repositories.task;

import com.hexagonal.tasks.infrastructure.entities.task.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, UUID> {
}
