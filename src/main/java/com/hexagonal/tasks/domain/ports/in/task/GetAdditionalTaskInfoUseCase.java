package com.hexagonal.tasks.domain.ports.in.task;

import com.hexagonal.tasks.domain.model.task.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
