package br.com.baracho.nm.core.application.service;

import br.com.baracho.nm.core.application.gateway.NotificationDispatcherProducer;
import br.com.baracho.nm.core.domain.model.NotificationTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    private final NotificationDispatcherProducer notificationDispatcherProducer;

    public NotificationServiceImpl(
        NotificationDispatcherProducer notificationDispatcherProducer
    ) {
        this.notificationDispatcherProducer = notificationDispatcherProducer;
    }

    @Override
    public void publishEvent(NotificationTypeEnum notificationType, String contactInfo, String subject, String message) {
        notificationDispatcherProducer.execute(notificationType, contactInfo, subject, message);
    }
}
