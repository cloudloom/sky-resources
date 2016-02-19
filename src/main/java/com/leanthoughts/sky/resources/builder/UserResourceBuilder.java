package com.leanthoughts.sky.resources.builder;


import com.leanthoughts.sky.resources.TenantResource;
import com.leanthoughts.sky.resources.auth.AuthorityResource;
import com.leanthoughts.sky.resources.auth.GroupResource;
import com.leanthoughts.sky.resources.auth.UserResource;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ssm
 * @since 13-03-15
 */
public class UserResourceBuilder {
    private String password;
    private String username;
    private Set<AuthorityResource> authorities = new HashSet<AuthorityResource>(0);
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;
    private Set<GroupResource> groups = new HashSet<>(0);
    private Set<TenantResource> tenantInformation = new HashSet<TenantResource>();

    private UserResourceBuilder() {}

    public static UserResourceBuilder anUserBuilder() {
        return new UserResourceBuilder();
    }

    public UserResourceBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserResourceBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserResourceBuilder withAuthorities(Set<AuthorityResource> authorities) {
        this.authorities = authorities;
        return this;
    }

    public UserResourceBuilder withAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
        return this;
    }

    public UserResourceBuilder withAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
        return this;
    }

    public UserResourceBuilder withCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
        return this;
    }

    public UserResourceBuilder withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public UserResourceBuilder withGroups(Set<GroupResource> groups) {
        this.groups = groups;
        return this;
    }

    public UserResourceBuilder withTenantInformation(Set<TenantResource> tenantInformation) {
        this.tenantInformation = tenantInformation;
        return this;
    }

    public UserResource build() {
        UserResource user = new UserResource();
        user.setAccountNonExpired(this.accountNonExpired);
        user.setAccountNonLocked(this.accountNonLocked);
        user.setAuthorities(this.authorities);
        user.setCredentialsNonExpired(this.credentialsNonExpired);
        user.setEnabled(this.enabled);
        user.setGroups(this.groups);
        user.setPassword(this.password);
        user.setUsername(this.username);
        user.setTenantInformation(this.tenantInformation);
        return user;
    }
}