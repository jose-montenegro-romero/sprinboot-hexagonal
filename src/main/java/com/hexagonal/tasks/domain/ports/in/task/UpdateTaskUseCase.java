package com.hexagonal.tasks.domain.ports.in.task;

import com.hexagonal.tasks.domain.model.task.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updatedTask);
}
