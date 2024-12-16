package com.hexagonal.tasks.application.usecases.task;

import com.hexagonal.tasks.domain.ports.in.task.DeleteTaskUseCase;
import com.hexagonal.tasks.domain.ports.out.task.TaskRepositoryPort;

import java.util.UUID;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(UUID id) {
        return taskRepositoryPort.deleteById(id);
    }
}
