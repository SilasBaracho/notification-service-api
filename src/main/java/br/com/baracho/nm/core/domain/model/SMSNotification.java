package br.com.baracho.nm.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SMSNotification {
    private String contactInfo;
    private String message;
}
