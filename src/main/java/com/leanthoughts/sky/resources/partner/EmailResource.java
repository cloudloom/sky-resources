package com.leanthoughts.sky.resources.partner;

import com.leanthoughts.sky.resources.dictionary.jpa.impl.BaseEntity;

/**
 * @author fahad
 * @since 02-08-2016.
 */
public class EmailResource extends BaseEntity{

    private String email;
    private boolean defaultEmail;

    EmailResource(){}

    public EmailResource(String email, boolean defaultEmail) {
        this.email = email;
        this.defaultEmail = defaultEmail;
    }

    public EmailResource(String uid, String email, boolean defaultEmail) {
        super(uid);
        this.email = email;
        this.defaultEmail = defaultEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDefaultEmail() {
        return defaultEmail;
    }

    public void setDefaultEmail(boolean defaultEmail) {
        this.defaultEmail = defaultEmail;
    }
}
