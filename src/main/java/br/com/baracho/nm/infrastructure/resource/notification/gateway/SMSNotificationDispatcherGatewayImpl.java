package br.com.baracho.nm.infrastructure.resource.notification.gateway;

import br.com.baracho.nm.core.application.gateway.NotificationDispatcherGateway;
import br.com.baracho.nm.core.domain.model.NotificationTypeEnum;
import br.com.baracho.nm.core.domain.model.SMSNotification;
import br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro;
import br.com.baracho.nm.infrastructure.config.twilio.TwilioConfig;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class SMSNotificationDispatcherGatewayImpl extends NotificationDispatcherGateway<SMSNotification> {
    @Autowired
    private TwilioConfig twilioConfig;

    @Override
    public void execute(SMSNotification message) {
        try {
            Twilio.init(twilioConfig.getAccount(), twilioConfig.getToken());
            var twilio = Message.creator(
                new PhoneNumber("+5581999949515"),
                new PhoneNumber(twilioConfig.getPhoneNumber()),
                message.getMessage()
            ).create();

            System.out.println(twilio.getSid()+ " - " + twilio.getStatus());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
