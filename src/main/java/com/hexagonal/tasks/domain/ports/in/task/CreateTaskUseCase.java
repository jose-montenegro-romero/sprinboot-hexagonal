package com.hexagonal.tasks.domain.ports.in.task;

import com.hexagonal.tasks.domain.model.task.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
