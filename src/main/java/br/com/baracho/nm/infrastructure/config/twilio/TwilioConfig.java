package br.com.baracho.nm.infrastructure.config.twilio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "spring.twilio")
public class TwilioConfig {
    private String account;
    private String token;
    private String phoneNumber;
}
