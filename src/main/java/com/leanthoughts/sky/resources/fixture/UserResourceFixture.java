package com.leanthoughts.sky.resources.fixture;

import com.leanthoughts.sky.resources.TenantResource;
import com.leanthoughts.sky.resources.auth.AuthorityResource;
import com.leanthoughts.sky.resources.auth.UserResource;
import com.leanthoughts.sky.resources.builder.UserResourceBuilder;
import com.leanthoughts.sky.resources.partner.NewUserResource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ssm
 * @since 13-03-15
 */
public class UserResourceFixture {
    public static UserResource user(NewUserResource userResource, Set<TenantResource> tenantInformation) {
        Set<AuthorityResource> authorities = new HashSet<AuthorityResource>();
        if(userResource.getAuthorities() != null && userResource.getAuthorities().size() > 0) {
            userResource.getAuthorities().stream().forEach(authority -> {
                authorities.add(AuthorityResourceFixture.withAuthority(authority));
            });
        }
        UserResource user = UserResourceBuilder.anUserBuilder()
                .withUsername(userResource.getUserName())
                .withPassword(userResource.getPassword())
                .withAccountNonExpired(true)
                .withAccountNonLocked(true)
                .withCredentialsNonExpired(true)
                .withEnabled(true)
                .withTenantInformation(tenantInformation)
                .withAuthorities(authorities)
                .build();
        return user;
    }

    public static List<UserResource> users(List<NewUserResource> userResources, List<NewUserResource> duplicateUserNames, Set<TenantResource> tenantInformation) {
        List<UserResource> resources = new ArrayList<>();
        if(userResources != null && userResources.size() > 0) {
            if (duplicateUserNames != null && duplicateUserNames.size() > 0) {
                userResources.stream().forEach(user -> {
                        NewUserResource userResource = duplicateUserNames.stream().filter(duplicateUserName -> duplicateUserName.getUserName().equals(user.getUserName())).findFirst().orElse(null);
                        if (userResource == null) {
                            resources.add(user(user, tenantInformation));
                        }
                });
            } else {
                userResources.stream().forEach(user -> {
                    resources.add(user(user, tenantInformation));
                });
            }
        }
        return resources;
    }
}