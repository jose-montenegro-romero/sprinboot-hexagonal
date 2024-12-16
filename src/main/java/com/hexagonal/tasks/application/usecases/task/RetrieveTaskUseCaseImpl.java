package com.hexagonal.tasks.application.usecases.task;

import com.hexagonal.tasks.domain.model.task.Task;
import com.hexagonal.tasks.domain.ports.in.task.RetrieveTaskUseCase;
import com.hexagonal.tasks.domain.ports.out.task.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTaskById(UUID id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }
}
