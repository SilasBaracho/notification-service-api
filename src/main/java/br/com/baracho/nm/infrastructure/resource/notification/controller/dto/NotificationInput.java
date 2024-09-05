package br.com.baracho.nm.infrastructure.resource.notification.controller.dto;

import br.com.baracho.nm.core.domain.model.NotificationTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationInput {
    private NotificationTypeEnum notificationType;

    private String contactInfo;

    private String subject;

    private String message;
}
