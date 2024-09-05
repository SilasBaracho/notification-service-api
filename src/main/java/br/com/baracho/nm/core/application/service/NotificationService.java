package br.com.baracho.nm.core.application.service;

import br.com.baracho.nm.core.domain.model.NotificationTypeEnum;

public interface NotificationService {
    void publishEvent(NotificationTypeEnum notificationTypeEnum, String contactInfo, String subject, String message);
}
