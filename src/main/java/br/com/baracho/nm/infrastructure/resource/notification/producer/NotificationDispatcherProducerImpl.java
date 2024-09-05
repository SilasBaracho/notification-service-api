package br.com.baracho.nm.infrastructure.resource.notification.producer;

import br.com.baracho.nm.core.application.gateway.NotificationDispatcherProducer;
import br.com.baracho.nm.core.domain.model.NotificationTypeEnum;
import br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import java.util.concurrent.CompletableFuture;

@Component
public class NotificationDispatcherProducerImpl implements NotificationDispatcherProducer {
    @Autowired
    private KafkaTemplate<String, NotificationAvro> kafkaTemplate;
    @Value("${spring.kafka.topics.notification-message-dispatcher}")
    private String topic;

    @Override
    public void execute(NotificationTypeEnum notificationType, String contactInfo, String subject, String message) {
        var messageAvro = new NotificationAvro(notificationType.toString(), contactInfo, subject, message);
        CompletableFuture<SendResult<String, NotificationAvro>> future = kafkaTemplate.send(topic, messageAvro);
        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + messageAvro + "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" + messageAvro + "] due to : " + ex.getMessage());
            }
        });
    }
}
