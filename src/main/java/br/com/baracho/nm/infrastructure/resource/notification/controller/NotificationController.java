package br.com.baracho.nm.infrastructure.resource.notification.controller;

import br.com.baracho.nm.core.application.service.NotificationService;
import br.com.baracho.nm.infrastructure.resource.notification.controller.dto.NotificationInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notification-manager")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody NotificationInput notificationInput) {
        notificationService.publishEvent(
            notificationInput.getNotificationType(),
            notificationInput.getContactInfo(),
            notificationInput.getSubject(),
            notificationInput.getMessage()
        );

        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

}
