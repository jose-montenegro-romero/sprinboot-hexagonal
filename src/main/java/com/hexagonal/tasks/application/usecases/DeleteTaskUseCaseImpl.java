package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.ports.in.task.DeleteTaskUseCase;
import com.hexagonal.tasks.domain.ports.out.task.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
