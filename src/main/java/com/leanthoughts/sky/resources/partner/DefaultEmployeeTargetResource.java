package com.leanthoughts.sky.resources.partner;

/**
 * Created by sadath on 20-Aug-2015.
 */
@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class DefaultEmployeeTargetResource {
    private String organizationUid;
    private String partnerUid;
    private String targetOrgUnitUid;
    private String targetPositionUid;

    public String getPartnerUid() {
        return partnerUid;
    }

    public void setPartnerUid(String partnerUid) {
        this.partnerUid = partnerUid;
    }

    public String getTargetOrgUnitUid() {
        return targetOrgUnitUid;
    }

    public void setTargetOrgUnitUid(String targetOrgUnitUid) {
        this.targetOrgUnitUid = targetOrgUnitUid;
    }

    public String getTargetPositionUid() {
        return targetPositionUid;
    }

    public void setTargetPositionUid(String targetPositionUid) {
        this.targetPositionUid = targetPositionUid;
    }

    public String getOrganizationUid() {
        return organizationUid;
    }

    public void setOrganizationUid(String organizationUid) {
        this.organizationUid = organizationUid;
    }
}