package br.com.baracho.nm.infrastructure.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationDocConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("notification-manager-api")
                .description("API responsável pelo gerenciamento de envios de notificações")
                .contact(new Contact()
                    .name("Silas Baracho")
                )
            );
    }
}
