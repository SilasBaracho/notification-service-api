package br.com.baracho.nm.infrastructure.resource.notification.gateway;

import br.com.baracho.nm.core.application.gateway.NotificationDispatcherGateway;
import br.com.baracho.nm.core.domain.model.EmailNotification;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationDispatcherGatewayImpl extends NotificationDispatcherGateway<EmailNotification> {
    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void execute(EmailNotification message) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

        helper.setFrom("noreply@test.com");
        helper.setTo(message.getContactInfo());
        helper.setSubject(message.getContactInfo());
        helper.setText(message.getMessage(), true);

        mailSender.send(mimeMessage);
    }
}
