package br.com.baracho.nm.infrastructure.config.kafka.consumer;

import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;

public interface KafkaConsumerConfig<T> {
    ConsumerFactory<String, T> consumerFactory();
    ConcurrentKafkaListenerContainerFactory<String, T> kafkaListenerContainerFactory();
}
