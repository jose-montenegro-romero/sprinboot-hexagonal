package com.hexagonal.tasks.domain.ports.in.task;

import java.util.UUID;

public interface DeleteTaskUseCase {
    boolean deleteTask(UUID id);
}
