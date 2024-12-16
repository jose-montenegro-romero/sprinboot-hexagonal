package com.hexagonal.tasks.domain.ports.out.task;

import com.hexagonal.tasks.domain.model.task.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findById(UUID id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(UUID id);
}
