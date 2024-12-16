package com.hexagonal.tasks.domain.ports.in.task;

import com.hexagonal.tasks.domain.model.task.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RetrieveTaskUseCase {
    Optional<Task> getTaskById(UUID id);
    List<Task> getAllTasks();
}
