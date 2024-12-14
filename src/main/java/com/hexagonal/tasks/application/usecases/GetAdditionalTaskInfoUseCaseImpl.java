package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.model.task.AdditionalTaskInfo;
import com.hexagonal.tasks.domain.ports.in.task.GetAdditionalTaskInfoUseCase;
import com.hexagonal.tasks.domain.ports.out.task.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
