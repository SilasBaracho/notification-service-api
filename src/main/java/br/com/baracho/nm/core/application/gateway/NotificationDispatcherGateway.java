package br.com.baracho.nm.core.application.gateway;

import br.com.baracho.nm.core.domain.model.NotificationTypeEnum;
import jakarta.mail.MessagingException;

public abstract class NotificationDispatcherGateway<Avro> {
    abstract public void execute(Avro input) throws MessagingException;
}
