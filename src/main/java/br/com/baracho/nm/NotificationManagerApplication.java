package br.com.baracho.nm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class NotificationManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationManagerApplication.class, args);
	}

}
