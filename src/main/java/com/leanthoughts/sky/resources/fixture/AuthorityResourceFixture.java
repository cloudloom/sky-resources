package com.leanthoughts.sky.resources.fixture;


import com.leanthoughts.sky.resources.auth.AuthorityResource;
import com.leanthoughts.sky.resources.builder.AuthorityResourceBuilder;

/**
 * @author ssm
 * @since 13-03-15
 */
public class AuthorityResourceFixture {
    public static AuthorityResource agentAuthority() {
        AuthorityResource authority = AuthorityResourceBuilder.anAuthorityBuilder()
                .withRole("CUSTOMER_SERVICE_AGENT")
                .build();
        return authority;
    }

    public static AuthorityResource adminAuthority() {
        AuthorityResource authority = AuthorityResourceBuilder.anAuthorityBuilder()
                .withRole("TENANT_ADMINISTRATOR")
                .build();
        return authority;
    }

    public static AuthorityResource managerAuthority() {
        AuthorityResource authority = AuthorityResourceBuilder.anAuthorityBuilder()
                .withRole("TENANT_MANAGER")
                .build();
        return authority;
    }

    public static AuthorityResource withAuthority(String authority) {
        if(authority.equals("TENANT_ADMINISTRATOR")) {
            return AuthorityResourceFixture.adminAuthority();
        } else if(authority.equals("TENANT_MANAGER")) {
            return AuthorityResourceFixture.managerAuthority();
        } else if(authority.equals("CUSTOMER_SERVICE_AGENT")) {
            return AuthorityResourceFixture.agentAuthority();
        }
        return null;
    }
}