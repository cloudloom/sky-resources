package com.leanthoughts.sky.resources.partner;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.dictionary.EmailType;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Size;

/**
 * Created by sadath on 15-Jun-2015.
 */
public class DefaultEmailResource extends BaseResource {
    @Size(min = 1, max = 250)
    @Email
    private String email;
    private EmailType emailType;
    private boolean defaultEmail;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmailType getEmailType() {
        return emailType;
    }

    public void setEmailType(EmailType emailType) {
        this.emailType = emailType;
    }

    public boolean isDefaultEmail() {
        return defaultEmail;
    }

    public void setDefaultEmail(boolean defaultEmail) {
        this.defaultEmail = defaultEmail;
    }
}