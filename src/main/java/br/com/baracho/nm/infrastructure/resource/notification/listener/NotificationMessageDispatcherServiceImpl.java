package br.com.baracho.nm.infrastructure.resource.notification.listener;

import br.com.baracho.nm.core.application.gateway.NotificationDispatcherGateway;
import br.com.baracho.nm.core.domain.model.EmailNotification;
import br.com.baracho.nm.core.domain.model.SMSNotification;
import br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro;
import jakarta.mail.MessagingException;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationMessageDispatcherServiceImpl {
    @Autowired
    private NotificationDispatcherGateway<EmailNotification> emailNotificationNotificationDispatcherGateway;
    @Autowired
    private NotificationDispatcherGateway<SMSNotification> smsNotificationNotificationDispatcherGateway;

    @KafkaListener(
        topics = "${spring.kafka.topics.notification-message-dispatcher}",
        groupId = "${spring.kafka.consumer.group-id}"
    )
    public void listen(ConsumerRecord<String, NotificationAvro> data, Acknowledgment acknowledgment) throws MessagingException {
        GenericRecord record = data.value();
        NotificationAvro notificationAvro = new NotificationAvro();
        notificationAvro.setContactInfo(record.get("contactInfo").toString());
        notificationAvro.setMessage(record.get("message").toString());
        notificationAvro.setNotificationType(record.get("notificationType").toString());
        notificationAvro.setSubject(record.get("subject").toString());

        if(notificationAvro.getNotificationType().equals("EMAIL")) {
            emailNotificationNotificationDispatcherGateway.execute(
                new EmailNotification(
                    notificationAvro.getContactInfo().toString(),
                    notificationAvro.getSubject().toString(),
                    notificationAvro.getMessage().toString()
                )
            );
            log.info("Email sent");
        } else {
            smsNotificationNotificationDispatcherGateway.execute(
                new SMSNotification(
                    notificationAvro.getContactInfo().toString(),
                    notificationAvro.getMessage().toString()
                )
            );
            log.info("Sms sent");
        }
        acknowledgment.acknowledge();
    }
}
