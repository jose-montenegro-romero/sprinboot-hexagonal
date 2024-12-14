package com.hexagonal.tasks.domain.ports.in.task;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);
}
