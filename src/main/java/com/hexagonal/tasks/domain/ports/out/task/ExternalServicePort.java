package com.hexagonal.tasks.domain.ports.out.task;

import com.hexagonal.tasks.domain.model.task.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
