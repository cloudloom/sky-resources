package com.leanthoughts.sky.resources;

public class TenantResource {
    private String uid;

    public TenantResource() {
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TenantResource)) return false;
        final TenantResource other = (TenantResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uid = this.uid;
        final Object other$uid = other.uid;
        if (this$uid == null ? other$uid != null : !this$uid.equals(other$uid)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uid = this.uid;
        result = result * PRIME + ($uid == null ? 0 : $uid.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TenantResource;
    }
}