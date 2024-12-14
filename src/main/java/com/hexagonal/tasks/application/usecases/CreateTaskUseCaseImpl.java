package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.model.task.Task;
import com.hexagonal.tasks.domain.ports.in.task.CreateTaskUseCase;
import com.hexagonal.tasks.domain.ports.out.task.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
