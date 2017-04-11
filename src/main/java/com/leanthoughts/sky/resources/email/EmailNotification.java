package com.leanthoughts.sky.resources.email;

import lombok.*;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by fahadfazil on 03/03/17.
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailNotification {
    protected String tenantId;
    protected String accountId;
    protected String templateId;
    protected String subject;
    protected String cc;
    protected String to;
    protected Map<String,Object> content = new HashMap<>(0);

    public EmailNotification(String tenantId, String accountId, String templateId, String subject, String cc, String to) {
        this.tenantId = tenantId;
        this.accountId = accountId;
        this.templateId = templateId;
        this.subject = subject;
        this.cc = cc;
        this.to = to;
    }
}
