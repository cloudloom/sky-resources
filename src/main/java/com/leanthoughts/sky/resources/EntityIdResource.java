package com.leanthoughts.sky.resources;

import java.io.Serializable;

public class EntityIdResource implements Serializable {
    private String id;

    public EntityIdResource() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EntityIdResource)) return false;
        final EntityIdResource other = (EntityIdResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.id;
        final Object other$id = other.id;
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.id;
        result = result * PRIME + ($id == null ? 0 : $id.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof EntityIdResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.api.gateway.resources.EntityIdResource(id=" + this.id + ")";
    }
}
