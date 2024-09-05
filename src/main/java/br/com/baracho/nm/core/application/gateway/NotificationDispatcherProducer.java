package br.com.baracho.nm.core.application.gateway;


import br.com.baracho.nm.core.domain.model.NotificationTypeEnum;

public interface NotificationDispatcherProducer {
    void execute(NotificationTypeEnum notificationTypeEnum, String contactInfo, String subject, String message);
}
