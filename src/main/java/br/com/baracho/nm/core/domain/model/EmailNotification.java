package br.com.baracho.nm.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmailNotification {
    private String contactInfo;
    private String subject;
    private String message;
}
