package com.leanthoughts.sky.resources.order;

import com.leanthoughts.sky.resources.BaseResource;

public class OrganizationResource extends BaseResource {
    private String reference;

    public OrganizationResource() {
    }

    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof OrganizationResource)) return false;
        final OrganizationResource other = (OrganizationResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$reference = this.reference;
        final Object other$reference = other.reference;
        if (this$reference == null ? other$reference != null : !this$reference.equals(other$reference)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $reference = this.reference;
        result = result * PRIME + ($reference == null ? 0 : $reference.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof OrganizationResource;
    }
}