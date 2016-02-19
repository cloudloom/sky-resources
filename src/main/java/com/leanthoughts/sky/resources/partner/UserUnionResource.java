package com.leanthoughts.sky.resources.partner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Map;

/**
 * Created by sadath on 29-Jul-2015.
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserUnionResource {
    private Map<String, String> user;
    private DefaultPartnerResource partner;

    public Map<String, String> getUser() {
        return user;
    }

    public void setUser(Map<String, String> user) {
        this.user = user;
    }

    public DefaultPartnerResource getPartner() {
        return partner;
    }

    public void setPartner(DefaultPartnerResource partner) {
        this.partner = partner;
    }
}
