package com.leanthoughts.sky.resources.partner;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by sadath on 26-Jul-2015.
 */
@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class NewUserResource {
    private String userName;
    @NotNull
    @NotEmpty
    private String password;
    private String partnerUid;
    private String roleUid;
    private List<String> authorities;
    private String homeScreen;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPartnerUid() {
        return partnerUid;
    }

    public void setPartnerUid(String partnerUid) {
        this.partnerUid = partnerUid;
    }

    public String getRoleUid() {
        return roleUid;
    }

    public void setRoleUid(String roleUid) {
        this.roleUid = roleUid;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    public String getHomeScreen() {
        return homeScreen;
    }

    public void setHomeScreen(String homeScreen) {
        this.homeScreen = homeScreen;
    }
}