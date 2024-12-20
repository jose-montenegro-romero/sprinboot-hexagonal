package com.hexagonal.tasks.application.usecases.task;

import com.hexagonal.tasks.domain.model.task.Task;
import com.hexagonal.tasks.domain.ports.in.task.UpdateTaskUseCase;
import com.hexagonal.tasks.domain.ports.out.task.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskRepositoryPort.update(updatedTask);
    }
}
