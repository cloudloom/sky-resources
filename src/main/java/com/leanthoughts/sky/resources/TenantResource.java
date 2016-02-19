package com.leanthoughts.sky.resources;

public class TenantResource {
    private String uid;
    private String name;
    private String description;
    private String logo;
    private String url;

    public TenantResource() {
    }

    public String getUid() {
        return this.uid;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TenantResource)) return false;
        final TenantResource other = (TenantResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$uid = this.uid;
        final Object other$uid = other.uid;
        if (this$uid == null ? other$uid != null : !this$uid.equals(other$uid)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.description;
        final Object other$description = other.description;
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$logo = this.logo;
        final Object other$logo = other.logo;
        if (this$logo == null ? other$logo != null : !this$logo.equals(other$logo)) return false;
        final Object this$url = this.url;
        final Object other$url = other.url;
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uid = this.uid;
        result = result * PRIME + ($uid == null ? 0 : $uid.hashCode());
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $description = this.description;
        result = result * PRIME + ($description == null ? 0 : $description.hashCode());
        final Object $logo = this.logo;
        result = result * PRIME + ($logo == null ? 0 : $logo.hashCode());
        final Object $url = this.url;
        result = result * PRIME + ($url == null ? 0 : $url.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof TenantResource;
    }
}