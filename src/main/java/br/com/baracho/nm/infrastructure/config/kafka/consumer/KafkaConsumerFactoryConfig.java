package br.com.baracho.nm.infrastructure.config.kafka.consumer;

import br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConsumerFactoryConfig {
    @Autowired
    private KafkaProperties kafkaProperties;

    @Bean
    public KafkaConsumerConfig<NotificationAvro> notificationKafkaConsumerConfig() {
        return new KafkaConsumerConfigImpl<>(kafkaProperties);
    }
}
